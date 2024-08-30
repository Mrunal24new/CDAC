//Write a program to reverse the digits of the number 1234. The output should be 4321
public class ReverseDigit {
    public static void main(String[] args) {
        int num = 1234;
        int reversed = 0;
        while(num != 0) {
            
             int digit = num % 10;  // Get the last digit
              reversed = reversed * 10 + digit;  // Append the digit to the reversed number
               num /= 10;  // Remove the last digit from the original number
        }
    }
    System.out.println(" " +reversed);
}
