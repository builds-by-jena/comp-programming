Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j != i) {
                    System.out.print(" ");
                }
            }

            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(" " + j);
            }

            System.out.println();
        }

        sc.close();
    }
}