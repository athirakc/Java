package java_Grooming;
import java.util.*;
public class Biggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of the array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("array elements: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			else if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("smallest number: "+min);
		System.out.println("largest number: "+max);
	}

}