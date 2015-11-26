package fr.poec.javase.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.Random;
import java.sql.PreparedStatement;

public class MainJDBC {
	private static final String CONNECTION_URL ="jdbc:mysql://localhost:3306/blog";
	private static final String USERNAME = "blog";
	private static final String PASSWORD = "blog_pwd";
	private static final String SELECT_ALL_USERS ="SELECT * FROM user";
	private static final String SELECT_USER_BY_ID ="SELECT * FROM user WHERE id = ?";
	// definition of SQL request for adding a new user in the user DB
	private static final String INSERT_NEW_USER ="INSERT INTO user (username,password,email) VALUES (?,?,?)";

	private static final String USERNAME_COL = "username";
	private static final String PWD_COL = "password";
	
	public static void main(String[] args) {
		//Connection conn = null;
		
/*		before java 7
 *     try {
			conn = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			System.out.println("Unable to find database blog");
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
*/
		// try with resources sinc"e java >=7 
		// ok for all objects that are implementing the closable i/f
		try {
			Connection conn = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
			// on créer des statement pour acceder à la DB
			System.out.println("--------SELECT ALL USERS ------------");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SELECT_ALL_USERS);		
			while (rs.next()) {
				//System.out.println("username " + rs.getString(USERNAME_COL));
				System.out.format("username: %s, password : %s\n",
				                   rs.getString(USERNAME_COL),
                                   rs.getString(PWD_COL));

				}
				System.out.println("--------SELECT by USER ID------------");
				PreparedStatement pstmt = conn.prepareStatement(SELECT_USER_BY_ID);
				pstmt.setInt(1, 2);
				rs = pstmt.executeQuery();	
				while (rs.next()) {
					//System.out.println("username " + rs.getString(USERNAME_COL));
					System.out.format("username: %s, password : %s\n",
					                   rs.getString(USERNAME_COL),
	                                   rs.getString(PWD_COL));

					}
				// pour un 2nd appel, on a pas a renvoyer le preparedStatement, le jdbc optimise
				pstmt.setInt(1, 4);
				rs = pstmt.executeQuery();	
				while (rs.next()) {
					//System.out.println("username " + rs.getString(USERNAME_COL));
					System.out.format("username: %s, password : %s\n",
					                   rs.getString(USERNAME_COL),
	                                   rs.getString(PWD_COL));

					}
//				PreparedStatement newUserPStmt = conn.prepareStatement(INSERT_NEW_USER);
				PreparedStatement newUserPStmt = conn.prepareStatement(INSERT_NEW_USER, Statement.RETURN_GENERATED_KEYS);
				// caution can not add multiple times the same username
				// so add a random number at the END
				Random rnd = new Random();
				int i = rnd.nextInt();
				newUserPStmt.setString(1, "java_u"+i);
				newUserPStmt.setString(2, "java_u"+i);
				newUserPStmt.setString(3, "java_e"+i);
				newUserPStmt.executeUpdate();	
				ResultSet genKeysRs = newUserPStmt.getGeneratedKeys();
				genKeysRs.next();
				System.out.format("New User %s %s with id: %d","new_user_from_java"+i,"pwd_from_java"+i,genKeysRs.getInt(1) );
				
				// TRANSACTIONS
				// by default all queries ar ein auto commi mode
				try {
					conn.setAutoCommit(false);
					conn.createStatement().executeUpdate("INSERT INTO user (username,password,email) VALUES ('tuser3','tpwd3','temail3')");
					conn.createStatement().executeUpdate("INSERT INTO user (username,password,email) VALUES ('tuser2','tpwd2','temail2')");
					conn.commit();
				}
				catch(SQLException e) {
					e.printStackTrace();
					System.out.println("transaction being roll back");
					conn.rollback();
				}
				finally {
					conn.setAutoCommit(true);
				}

				
				} catch (SQLException e) {
					System.out.println("error in database blog access");
			e.printStackTrace();
		}
		

		
	}

}
