import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       // int a;
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter number");
        int a= sc.nextInt();
        
          //Scanner sc = new Scanner(System.in);
            //System.out.println("b"+b);
            if (a%2==0){
        System.out.println("No is even");}
        else
        {
             System.out.println("No is odd");
        }
        
    }
}