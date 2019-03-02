import java.util.Scanner;

public class SammyCapg {
	public void details() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter name: ");
		String name=scan.next();
		System.out.println("enter contact no: ");
		long contactno=scan.nextLong();
		System.out.println("enter age: ");
	    int age;
	    age=scan.nextInt();
	    if(age>20 && age<55) {
	    	System.out.println("Details taken");
	    }
	    else {
	    	throw new ArithmeticException("Age should be between 20 to 55");
	    }
	}
public static void main(String args[]) {
	
    SammyCapg detail=new SammyCapg();
    detail.details();
}

}
