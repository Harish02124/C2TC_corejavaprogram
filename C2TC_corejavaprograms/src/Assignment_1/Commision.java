
package Assignment_1;
import java.util.Scanner;

public class Commision {
	String name;
	String address;
	String phone;
	int sales;
	public void acceptDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name:");
		name=sc.nextLine();
		
		System.out.println("Enter the address:");
		address=sc.nextLine();
		
		System.out.println("Enter the Phone:");
		phone=sc.nextLine();
		
		System.out.println("Enter the Salary:");
		sales=sc.nextInt();
		
	}
	public void ComisionDetails() {
		double comision;
		if ( sales >= 100000) {
			comision=sales*0.10;
		}
		else if(sales>= 50000) {
			comision=sales*0.05;
		}
		else if(sales>30000) {
			comision=sales*0.03;
		}
		else {
			comision=0;
		}
		System.out.println("Commision for " + name + " is: ₹" + comision);
	}
}
