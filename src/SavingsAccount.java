import java.util.Scanner;

public class SavingsAccount extends FixedAccount {
	public void calculateInterest() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter balance");
		float balance=scan.nextFloat();
		float interest;
		System.out.println("enter time period");
		float time=scan.nextFloat();
		int ROI=1;
		interest=(balance*time*ROI)/100;
		System.out.println("The interest on balance is "+interest);
		
	}
public static void main(String args[]) {
	SavingsAccount fix=new SavingsAccount(); 
	fix.calculateInterest();
}
}
