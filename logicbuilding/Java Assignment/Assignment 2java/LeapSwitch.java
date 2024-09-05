package Demo;
import java.util.*;
public class LeapSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int year = sc.nextInt();
       switch (year % 4) {
       case 0:
           if (year % 100 != 0 || year % 400 == 0) {
               System.out.println(year + " is a leap year.");
           } else {
               System.out.println(year + " is not a leap year.");
           }
           break;
       default:
           System.out.println(year + " is not a leap year.");
   }
       
	}

}

