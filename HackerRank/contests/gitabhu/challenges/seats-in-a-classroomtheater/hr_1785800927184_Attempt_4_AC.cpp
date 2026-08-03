// Compute P(r, n) = r * (r - 1) * ... * (r - n + 1) using BigInt multiplication
    string ways = "1";
    for (int i = 0; i < n; i++) {
        ways = multiply(ways, r - i);
    }

    cout << ways << "\n";

    return 0;
}