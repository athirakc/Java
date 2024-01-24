package dem_Oper;
import java.util.*;
class prime2{
	int num,i,k=0;
	void setData(int num)
	{
		this.num = num;
	}
	void getDisplay()
	{
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				k++;
			}
		}
		if(k==2)
		{
			System.out.println("Is a prime");
		}
		else
		{
			System.out.println("Is not a prime");
		}
	}
}
public class PrimeSetGet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		num=sc.nextInt();
		prime2 p=new prime2();
		p.setData(num);
		p.getDisplay();
	}

}
