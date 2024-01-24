package dem_Oper;
import java.util.*;
class Fib
{
	int n1,n2,n3,n;
	void setData(int n)
	{
		this.n=n;
	}
	void process()
	{
		n1=0;
		n2=1;
		n3=n1+n2;
		System.out.println(n1+"\n"+n2);
		for(int i=1;i<=n;i++)
		{
			n1=n2;
			n2=n3;
			n3=n1+n2;
			System.out.println(n3);
		}
	}
}
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Fibonacci Series");
		System.out.println("Enetr any number to find fibonacci series");
		n=sc.nextInt();
		Fib f=new Fib();
		f.setData(n);
		f.process();
	}

}
