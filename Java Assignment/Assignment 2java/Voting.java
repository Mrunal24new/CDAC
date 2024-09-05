package Demo;
import java.util.Scanner;

public class Voting {


	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();

	        String eligibility = (age >= 18) ? "You are eligible to vote." : "You are not eligible to vote.";
	        System.out.println(eligibility);
	    }
	}


