package dem_Oper;
import java.util.*;
public class ArithOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		int a = scan.nextInt();
		System.out.print("Enter the 2nd number: ");
		int b = scan.nextInt();
		int sum = a + b;
		int difference = a - b;
		int product = a * b;
        double quotient = a/ b;
        double remainder = a%b;
		System.out.println(a+" + "+b +" = " + sum);
		System.out.println(a+" - "+b +" = " + difference);
		System.out.println(a+" x "+b +" = " + product);
		System.out.println(a+" / "+b +" = " + quotient);
		System.out.println(a+" mod "+b +" = " + remainder);
	}

}