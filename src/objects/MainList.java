package objects;

import java.util.ArrayList;

import java.util.List;

public class MainList {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		System.out.println(persons.size());
		 Person p1 = new Person("claude","marescot");
		 Person p2 = new Person("paul","emploi");
		 Person p3 = new Person("steve","job");
	 
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		
		System.out.println(persons.size());
		

	}

}
