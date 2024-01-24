package java_Grooming;
import java.util.*;
public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1234;
		int bal=2000;
		System.out.println("Enter Your Pin");
		Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		if(a==pin) {
			System.out.println("Valid Pin");
			System.out.println("Enter the amount you want");
			int am=sc.nextInt();
			if(am<=bal) {
				System.out.println("Transaction completed");
			}
			else {
				System.out.println("Insuficcient balance");
			}
		}
		else {
			System.out.println("Invalid Pin");

		}
	}

}
