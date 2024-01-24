package java_Grooming;

import java.util.Scanner;

public class Arraytask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		System.out.println("Enter the Array Elements");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
