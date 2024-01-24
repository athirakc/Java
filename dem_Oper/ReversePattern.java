package dem_Oper;

public class ReversePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n=6; 
		for (i = 1; i <= n; i++) 
		{
			for (j = n; j >i; j--) 
	        {   
				System.out.print(j-i + " "); 
		    }
	        System.out.println(); 
	    } 
    }
}
