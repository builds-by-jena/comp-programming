// Fast I/O
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    if (cin >> n) {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                // Print star for first 
                column, hypotenuse (j == 
                i), or bottom row (i == n)
                if (j == 1 || j == i || i 
                == n) {
                    cout << "*";
                } else {
                    cout << " ";
                }

                // Add space between 
                characters in a row
                if (j < i) {
                    cout << " ";
                }
            }
            cout << "\n";
        }
    }

    return 0
}