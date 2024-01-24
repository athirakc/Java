package dem_Oper;

public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,9,1};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("smallest number: "+min);
	}

}
