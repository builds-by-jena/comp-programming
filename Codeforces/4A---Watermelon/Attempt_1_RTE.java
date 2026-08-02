import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        
        // Triggers ArithmeticException (Division by zero) -> Runtime Error
        int result = w / 0; 
        
        System.out.println(result);
    }
}//dd