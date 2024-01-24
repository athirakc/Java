package dem_Oper;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.next();
		String str="";
		int slen=s.length();
		for(int i=slen-1;i>=0;i--)
		{
			str=str+s.charAt(i);
		}
		if(s.toLowerCase().equals(str.toLowerCase()))
		{
			System.out.println("Is palindrome");
		}
		else
		{
			System.out.println("Is not a palindrome");
		}
	}

}
