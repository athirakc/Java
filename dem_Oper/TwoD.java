package dem_Oper;

public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{4,5},{2,3}};
		int i,j;
		System.out.println("The Array");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}