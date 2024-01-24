package dem_Oper;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=100;i++) 
		{
			if(i%3==0) 
			{
		  		 System.out.println("divided by 3");
		  		 System.out.println(i);
			}
			if(i%5==0) 
			{
		   		 System.out.println("divded by 5");
		   		 System.out.println(i);
			}
			if(i%3==0 || i%5==0) 
			{
		   		 System.out.println("divded by 3 & 5");
		   		 System.out.println(i);
			}
		    	 
		}		
	}
}
