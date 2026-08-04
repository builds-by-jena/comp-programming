int n;
    if (cin >> n) {
        // Loop through rows from 1 to N
        for (int i = 1; i <= n; ++i) {
            // Loop through columns from 1 
            to i
            for (int j = 1; j <= i; ++j) {
                // If sum of 1-indexed row 
                and column is even, print 1; 
                else print 0
                if ((i + j) % 2 == 0) {
                    cout << 1;
                } else {
                    cout << 0;
                }

                // Add space between values 
                in a row
                if (j < i) {
                    cout << " ";
                }
            }
            cout << "\n";
        }
    }

    return 0;
}