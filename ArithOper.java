import java.util.*;
class ArithOper
 {
    public static void main(String[] args)
 {
        Scanner scan = new Scanner(System.in);
	System.out.print("Enter the 1st number: ");
        int a = scan.nextInt();
	System.out.print("Enter the 2nd number: ");
        int b = scan.nextInt();
	int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = a/ b;
        double remainder = a%b;
	System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
}
}