package Task1;
import java.util.Scanner;

public class Main {
	
	//Gitttttttttttttttttttttttttttttttttttt

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		try {
			System.out.println("Enter index to show :");
			int input = sc.nextInt();
			System.out.println(arr[input]);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
