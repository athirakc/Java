package dem_Oper;
import java.util.*;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter age");
		int a=obj.nextInt();
        if(a>=18)
        {
        	System.out.println("Eligible for voting");
        }
        else
        {
        	System.out.println("Not Eligible for voting");
        }
	}

}
