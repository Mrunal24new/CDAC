//Write a program to calculate the sum of the first 50 natural numbers. 
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum=0 ;
        for(int i=1 ; i<=51 ; ++i) {
            
            sum= sum + i ;
            
        }
        System.out.println("Sum of first 50 natural numbers is: " +sum);
    }
}
