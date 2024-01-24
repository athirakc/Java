package dem_Oper;

import java.util.Scanner;

public class PostvNegtv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=obj.nextInt();
        if(a>=0)
        {
        	System.out.println("Number is positive");
        }
        else
        {
        	System.out.println("Number is negative");
        }
	}

}
