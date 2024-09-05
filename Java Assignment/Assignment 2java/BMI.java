package Demo;
import java.util.*;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//BMI = Weight (kg) / (Height (m))^2
//		Underweight: BMI is less than 18.5
//		Normal weight: BMI is between 18.5 and 24.9
//		Overweight: BMI is between 25 and 29.9
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Weight:");
		double Weight = sc.nextDouble();
		System.out.println("Enter the Height");
		double Height = sc.nextDouble();
		double BMI = (Weight/(Height*Height));
		if(BMI< 18.5) {
			System.out.println("Underweight");
		}
		else if(BMI>=18.5 && BMI<=24.9) {
			System.out.println("Normal Weight");
		}
		else if(BMI>=25 && BMI <=29.9) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obessed");
		}
	}

}
