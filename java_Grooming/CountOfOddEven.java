package java_Grooming;
import java.util.*;
public class CountOfOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counteven=0;
		int countodd=0;
		System.out.println("Size of the array: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("array elements: ");
		int a[]=new int[10];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]%2==0) {
				counteven+=1;
			}
			else {
				countodd+=1;
			}
		}
		System.out.println("count of even numbers = "+counteven);
		System.out.println("count of odd numbers = "+countodd);
		
	}

}
