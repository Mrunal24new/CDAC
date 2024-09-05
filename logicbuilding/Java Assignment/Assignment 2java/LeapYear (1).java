package Demo;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year:");
		int year = sc.nextInt();
		if(year % 4 ==0) {
			System.out.println("It is a Leap Year");
		}
		else if(year % 400 ==0) {
			System.out.println("It is a Leap Year");
		}
		else if(year %100 == 0) {
			System.out.println("It is not a Leap Year");
		}
		else {
			System.out.println("It is not a Leap Year");
		}

	}

}
