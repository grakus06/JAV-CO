package fr.poec.javaco.inheritance;

public class Employee extends Personn {
	private String number;
	private Long salary;
	
	public Employee(String firstname, String lastname, String number, Long salary) {
		super( firstname, lastname);
		this.number = number;
		this.salary = salary;
		
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	

}
