package dem_Oper;
import java.util.*;
public class MultiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter a number: ");
		  int a=sc.nextInt();
		  for (int i=0;i<10;i++)
		  {
		   System.out.println(a+"x"+(i+1)+"="+(a*(i+1)));
		  }
	}
}