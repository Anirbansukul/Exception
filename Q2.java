package Exception;
import java.util.Scanner;

class MobileException extends Exception{
	MobileException(String c){
		super(c);
	}
}
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your phone charge:");
		double c=sc.nextDouble();
		try {
			if(c<0||c>100) {
				throw new MobileException("Not possible!!");
			}
			else {
				System.out.println("Your mobile charge is:"+c);
			}
		}
		catch(MobileException e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
		}

	}

}
