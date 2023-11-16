package arrays_02_05;
/*
 * Storing objects
 * 
 */
public class Person {
	private String lastname;
	private String firstname;
	private int age;
	
	public Person(String lastname, String firstname, int age) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.age = age;
	}
	
	public void displayPerson() {
		System.out.print(" Last name : " + lastname);
		System.out.print(", First name : " + firstname);
		System.out.println(", Age : " + age);
	}

	public String getLastname() {
		return lastname;
	}
	
}
