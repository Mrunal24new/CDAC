//5. Write a program to print the Fibonacci sequence up to the number 21. 
public class FibonacciSequence {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1; 
        int nextNum = 0;  


        
        System.out.print(num1 + ", " + num2);

        
        while (nextNum <= 21) {
            nextNum = num1 + num2; 
            if (nextNum > 21) {
                break;  
            }
            System.out.print(", " + nextNum);  

            
            num1 = num2;
            num2 = nextNum;
        }
    }
}
