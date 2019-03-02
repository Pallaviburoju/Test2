import java.util.Scanner;

public class LargestNo {
public static void main(String args[]) {
	int big = 0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number in 3 digits");
	int number=scan.nextInt();
   int q=number/100;
   int r=number%100;
   int q1=r/10;
   int r1=r%10;
   for(int i=0;i<number;i++) {
	
	if(i==q || i==q1 || i==r1) {
	continue;
	}
	else {
		big=i;
	}
   }
   System.out.println("Largest number is "+big);
}
}
