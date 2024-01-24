import java.util.*;
public class Vote
{
	public static void main(String[]args)
	{
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter age");
		int a=obj.nextInt();
                System.out.println(a>18?"Eligible":"Not Eligible");
	}
 }