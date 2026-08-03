cout << "Cannot adjust " << n << " people on " << r << " seats" << endl;
        return;
    }

    // Compute Permutation P(r, n) = r * (r - 1) * ... * (r - n + 1)
    unsigned long long ways = 1;
    for (int i = 0; i < n; i++) {
        ways *= (r + i);
    }