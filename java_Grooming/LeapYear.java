package java_Grooming;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		if((year%100!=0) && (year%4==0) || (year%400==0)) {
			System.out.println(year+" is a Leap year");
		}
		else {
			System.out.println(year+" is not a Leap year");
		}
	}

}
