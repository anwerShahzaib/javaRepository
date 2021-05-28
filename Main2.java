package Task2;
import java.util.Scanner;

public class Main extends Throwable{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for division :");
		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			//2nd try
			try {
				System.out.println(num1/num2);
			}//2nd catch
			catch(ArithmeticException e) {
				System.out.println("!! Cannot divide by zero !!");
			}
		}//1st try
		catch(Exception e) {
			System.out.println("!!! integer input required !!!");
		}
	}
}