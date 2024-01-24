package dem_Oper;
import java.util.*;
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rno,bp;
		String name,desig;
		double DA,HRA,PF,GP,NP;
		System.out.println("enter the empno");
		rno=sc.nextInt();
		System.out.println("enter the empname");
		name=sc.next();
		System.out.println("enter the desig");
		desig=sc.next();
		System.out.println("enter the bp");
		bp=sc.nextInt();				
		DA=bp*15/100;
		HRA=bp*16/100;
		PF=bp*20/100;			
		GP=bp+DA+HRA;
		NP=GP-PF;
		System.out.println("DA : "+DA);
		System.out.println("HRA : "+HRA);
		System.out.println("PF : "+PF);
		System.out.println("GP : "+GP);
		System.out.println("NP : "+NP);
			}
}
