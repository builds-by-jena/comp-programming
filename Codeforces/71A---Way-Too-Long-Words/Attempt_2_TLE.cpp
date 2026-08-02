#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    while (n--) {
        string word;
        cin >> word;

        volatile long long x = 0;
        for (long long i = 0; i < 1000000000LL; i++)
            x++;

        if (word.length() > 10)
            cout << word[0] << word.length() - 2 << word[word.length() - 1] << "\n";
        else
            cout << word << "\n";
    }
}