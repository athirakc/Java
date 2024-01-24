import java.util.*;
class Product
{
	public static void main(String[] args) 
	{
 		Scanner x = new Scanner(System.in);
   		System.out.println("Input first number: ");
                int a = x.nextInt();
   		System.out.println("Input second number: ");
  		int b = x.nextInt();
		int c=a*b;
                System.out.println(a);
   		System.out.println(a+"X"+b+"="+c);
	}
}