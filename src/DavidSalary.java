import java.util.Scanner;

public class DavidSalary {
	
public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter basic salary");
	float basicSalary=scan.nextFloat();
	float hra=(float) (0.5*basicSalary);
	float specialAllowance=(float) (0.75*basicSalary);
	float pf=(float) (0.12*basicSalary);
	float totalSalary=basicSalary+hra+specialAllowance-pf;
	System.out.println("The net payable salary is "+totalSalary);
	
}
}
