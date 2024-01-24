package dem_Oper;
class Rev extends Thread
{
	public void run() 
	{
		System.out.println("Reverse a String");
		String s="Java Programming";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		System.out.println("Exit from thread rev ");
	}
}
class Mul extends Thread
{
	public void run()
	{
		int i,j,k=6;
		System.out.println("Multiplication tables:");
		for(i=1;i<=10;i++)
		{
			j=i*k;
			System.out.println(i+"*"+k+"="+j);
		}
		System.out.println("Exit from thread mul");
	}
}
class OddEven extends Thread
{
	public void run()
	{
		int i;
		System.out.println("printing 20 odd even numbers");
		for(i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println("even number: "+i);
			}
			else
			{
				System.out.println("odd number: "+i);
			}
		}
		System.out.println("Exit from thread OddEven");
	}
}
public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rev r=new Rev();
		Mul m=new Mul();
		OddEven o=new OddEven();
		r.start();
		m.start();
		o.start();
	}

}
