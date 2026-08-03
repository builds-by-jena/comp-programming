#include <iostream>
using namespace std;

int main() {
    int n;
    char x;

    cin >> n >> x;

    int idx = x - 'A';

    bool ok = false;

    for (int i = 0; i < n; i++) {
        string s;
        cin >> s;

        if (s[idx] == 'o')
            ok = true;
    }

    cout << (ok ? "Yes" : "No");

    return 0;
}