package dem_Oper;
import java.util.*;
class FibSeries 
{
    void Fibonacci1(int n) 
    {
        int a=1,b=1;
        System.out.print("Fibonacci Series : ");
        for (int i=1;i<=n;i++) 
        {
            System.out.print(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
}
public class FibonacciNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		FibSeries f1=new FibSeries();
		System.out.println("Limit : ");
		int n=s.nextInt();
		f1.Fibonacci1(n);
	}
}