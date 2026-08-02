import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int w = sc.nextInt();
        }
        
        // Infinite loop -> Time Limit Exceeded
        while (true) {
            // Busy wait to consume CPU time
        }
    }
}