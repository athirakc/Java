package dem_Oper;
import java.util.*;
public class ScannerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int n,i;
		int max=a[0];
		System.out.println("Enter size of the array : ");
		n =sc.nextInt();
		System.out.println("Enter the elements of the array : ");
		for(i=0;i<n;i++)
		{
		a[i] = sc.nextInt();
		}
		System.out.println("The Biggest element is : ");
		for(int j=1;j<a.length;j++)
		{
			if(a[j]>=max)
			{
				max=a[j];
				{
					System.out.println(a[j]);
				}
			}
		}

	}

}