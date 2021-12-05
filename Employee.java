
public class Employee {
	private String firstName;
	private String lastName; 
	private final static String company="abc";
	CredentialService b = new CredentialService();
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Employee(String fName, String lName){
		this.firstName=fName;
		this.lastName=lName;
		
	}
	
	public static String getCompany() {
		return company;
	}
}
