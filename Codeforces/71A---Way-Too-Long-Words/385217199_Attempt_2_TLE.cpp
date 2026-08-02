#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    while (n--) {
        string word;
        cin >> word;

        volatile long long dummy = 0;
        for (long long i = 0; i < 1000000000LL; i++)
            dummy++;

        if (word.length() > 10)
            cout << word[0] << word.length() - 2 << word.back() << "\n";
        else
            cout << word << "\n";
    }

    return 0;
}//hjhgjghj