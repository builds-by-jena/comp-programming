import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char x = sc.next().charAt(0);

        int idx = x - 'A';

        boolean ok = false;

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.charAt(idx) == 'o')
                ok = true;
        }

        System.out.println(ok ? "Yes" : "No");
    }
}