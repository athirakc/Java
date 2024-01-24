package dem_Oper;
class fact
{
	int i,fact=1;
	void setValue(int fact1)
	{
		fact=fact1;
	}
	int getDisplay()
	{
		for(i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
}

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact f=new fact();
		int res=f.getDisplay();
		System.out.println("factorial of numbers:"+res);
	}

}
