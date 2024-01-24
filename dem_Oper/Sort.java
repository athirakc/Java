package dem_Oper;
import java.util.*;
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the n0.of elements :");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<a.length;i++)
        {     
        	for(int j=i+1;j<a.length;j++)
        	{     
        		if(a[i]>a[j])
        		{    
        			temp=a[i];    
        			a[i]=a[j];    
        			a[j]=temp;    
        		}     
        	}     
        }     
        System.out.println();        
        System.out.println("Elements of array sorted in ascending order: ");    
        for(int i=0;i<a.length;i++) 
        {     
        	System.out.print(a[i] + " ");    
        }    
	}
}