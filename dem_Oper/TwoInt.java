package dem_Oper;
import java.util.*;
public class TwoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int a, b, sum,difference,product,avg,distance,max,min;
		System.out.println("ENTER THE FIRST NUMBER:");
		a = obj.nextInt();
		System.out.println("ENTER THE SECOND NUMBER:");
		b = obj.nextInt();
		sum=a+b;
		difference=a-b;
		product=a*b;
		avg=a+b/2;
		distance=a-b;
		System.out.println("Sum of two integers:"+sum);
		System.out.println("Difference of two integers:"+difference);
		System.out.println("Product of two integers:"+product);
		System.out.println("Average of two integers:"+avg);
		System.out.println("Distance of two integers:"+distance);
		if(a>b)
		{
			System.out.println("Max integer:"+a);
		}
		else
		{
			System.out.println("Min integer:"+a);
		}
		if(b>a)
		{
			System.out.println("Max integer:"+b);
		}
		else
		{
			System.out.println("Min integer:"+b);
		}
	}

}
