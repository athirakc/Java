package dem_Oper;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=obj.nextInt();
        if(a%2==0)
        {
        	System.out.println("The number is even");
        }
        else
        {
        	System.out.println("The number is odd");
        }
	}

}
