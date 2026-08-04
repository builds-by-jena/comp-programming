while (t--) {
        int x;
        cin >> x;

        string s;
        cin >> s;

        int carlsen = 0, chef = 0;

        for (char ch : s) {
            if (ch == 'C')
                carlsen += 2;
            else if (ch == 'N')
                chef +=
            else {
                carlsen++;
                chef++;
            }
        }

        if (carlsen > chef)
            cout << 60 * x << endl;
        else if (carlsen < chef)
            cout << 40 * x << endl;
        else
            cout << 55 * x << endl;
    }

    return 0;
}