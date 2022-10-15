package ec.edu.espol.workshops;

import java.util.Scanner;

public class CarInsurance {
	private double premiumBase = 500;
	private double premiumTotal;
	
	public static void main (String[] args) {
		int opGender, opstatus;
		String oplicense;
		Customer customer = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("*****CAR INSURANCE*****");
		System.out.println("Enter the customer's age:");
		customer.setAge(sc.nextInt());
		do{
		System.out.println("Select the customer's gender:");
		System.out.println("1) Female");
		System.out.println("2) Male");
		opGender = sc.nextInt();
		if (opGender==1) {
			customer.setGender('F');
		} else if (opGender==2) {
			customer.setGender('M');
		}else {
			System.out.println("Enter a valid option.");
		}
		}while(opGender != 1  && opGender != 2);
		do{
		System.out.println("Select the customer's marital Status:");
		System.out.println("1) Married");
		System.out.println("2) Not married");
		opstatus = sc.nextInt();
		if (opstatus==1) {
			customer.setMaritalStatus(true);
		} else if (opstatus==2) {
			customer.setMaritalStatus(false);
		}else {
			System.out.println("Enter a valid option.");
		}
		}while(opstatus != 1 && opstatus != 2);
		do{
			System.out.println("Does the customer have a valid license? Y/N:");
			oplicense = sc.nextLine();
			oplicense = oplicense.toUpperCase();
			if (oplicense.equals("Y")) {
				customer.setValidLicense(true);
			} else if (oplicense.equals("N")) {
				customer.setValidLicense(false);
			}else {
				System.out.println("Enter a valid option.");
			}
			}while(!oplicense.equals("Y") && !oplicense.equals("N"));
		
		if (customer.validatePolicies(customer.getAge(), customer.isValidLicense())){
			System.out.println("OK");
		}else {
			System.out.println("Customer does not comply with policies");
		}
	}
}
