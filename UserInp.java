import java.util.*;
class UserInp
{
   public static void main(String[]args)
   {
     Scanner obj=new Scanner(System.in);
     int a,b,c;
     System.out.println("Enter the First number");
     a=obj.nextInt();
     System.out.println("Enter the Second number");
     b=obj.nextInt();
     c=a+b;
     System.out.println("sum of number: "+c);
   }
}