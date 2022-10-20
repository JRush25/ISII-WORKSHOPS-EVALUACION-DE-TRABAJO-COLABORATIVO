package ec.edu.espol.workshops;

/**
 * @Clase Customer
 * Cliente
 */
public class Customer {
	/**
	 * @field age
	 * Edad
	 */
	private int age;
	/**
	 * @field gender
	 * Genero
	 */
	private char gender;
	/**
	 * @field maritalStatus
	 * Estado Civil
	 */
	private boolean maritalStatus;
	/**
	 * @field validLicense
	 * Licencia valida
	 */
	private boolean validLicense;
	
	public boolean isValidLicense() {
		return validLicense;
	}

	public void setValidLicense(boolean validLicense) {
		this.validLicense = validLicense;
	}
	
	/**
	 * @constructor Customer
	 * Cliente
	 */
	public Customer() {
		// The explicit constructor is here, so that it is possible to provide Javadoc. 
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
	
	
	/**
	 * @metodo validatePolicies
	 * Valida las politicas
	 */
	public boolean validatePolicies(int age, boolean license) {
		if (license && age < 80) {
			return true;
		}else {
			return false;
		}
	}
	
}
