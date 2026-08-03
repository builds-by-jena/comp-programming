import java.util.*;

public class Main {

    static class Pair {
        int h, l;
        Pair(int h, int l) {
            this.h = h;
            this.l = l;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<Pair> stack = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int H = sc.nextInt();
            int L = sc.nextInt();

            while (!stack.isEmpty() &&
                   stack.get(stack.size() - 1).h <= H) {
                stack.remove(stack.size() - 1);
            }

            stack.add(new Pair(H, L));
        }

        int Q = sc.nextInt();

        while (Q-- > 0) {
            int T = sc.nextInt();

            int left = 0;
            int right = stack.size();

            while (left < right) {
                int mid = (left + right) / 2;

                if (stack.get(mid).l <= T)
                    left = mid + 1;
                else
                    right = mid;
            }

            System.out.println(stack.get(left).h);
        }
    }
}