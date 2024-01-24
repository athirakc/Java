package dem_Oper;
public class BiggestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,9,1};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("greatest number: "+max);
	}
}
