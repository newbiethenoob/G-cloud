package gcloud.kdt.dbconn;

public class EmployeeDto {

	private String firstName;
	private String lastName;
	
	public String getFirtstName() {
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
	
	@Override
	public String toString() {
		return "EmployeeDto [firstName = "+firstName+", lastName = "+lastName+"]";
	}
	
	
	

}
