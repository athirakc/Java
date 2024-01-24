package dem_Oper;
import java.util.Scanner;
public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the height of the pyramid: ");
        int h=sc.nextInt();
        for (int i=1;i<=h;i++) 
        {
        	for (int j=1;j<=h-i;j++) 
        	{
        		System.out.print(" ");
        	}
        	for (int k=1;k<=2*i-1;k++) 
        	{
        		System.out.print("*");
		    }
        	System.out.println();
        }
    }
}
