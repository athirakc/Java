package dem_Oper;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int a,b,c,sum;
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the 1st number:");
		        a=sc.nextInt();
		        System.out.println("Enter the 2nd number:");
		        b=sc.nextInt();
		        System.out.println("Enter the 3rd number:");
		        c=sc.nextInt();
		        sum=a+b+c;
		        double avg=sum/3d;
		        System.out.println("Average of the numbers is"+avg);
	}
}