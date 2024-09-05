package Demo;
import java.util.*;
public class Season {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a month (1-12): ");
		        int month = sc.nextInt();

		     
		        String season;
		        switch (month) {
		            case 12: // December
		            case 1:  // January
		            case 2:  // February
		                season = "Winter";
		                break;
		            case 3:  // March
		            case 4:  // April
		            case 5:  // May
		                season = "Spring";
		                break;
		            case 6:  // June
		            case 7:  // July
		            case 8:  // August
		                season = "Summer";
		                break;
		            case 9:  // September
		            case 10: // October
		            case 11: // November
		                season = "Autumn";
		                break;
		            default:
		                season = "Invalid month";
		                break;
		        }

		        // Print the result
		        System.out.println("The season is: " + season);

		    }
		


	}


