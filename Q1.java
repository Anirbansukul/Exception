package Exception;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		try {
			System.out.println(x/y);
		}
		catch(ArithmeticException e) {
			System.out.println("Not possible!!");
		}
		finally {
			System.out.println("You are at finally block!!");
		}

	}

}
