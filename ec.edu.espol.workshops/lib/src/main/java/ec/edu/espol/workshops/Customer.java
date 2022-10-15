package ec.edu.espol.workshops;

public class Customer {
	private int age;
	private char gender;
	private boolean maritalStatus;
	private boolean validLicense;
	public boolean isValidLicense() {
		return validLicense;
	}

	public void setValidLicense(boolean validLicense) {
		this.validLicense = validLicense;
	}

	public Customer() {
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public boolean isMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	public boolean validatePolicies(int age, boolean license) {
		if (license && age < 80) {
			return true;
		}else {
			return false;
		}
	}
	
}
