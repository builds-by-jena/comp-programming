#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;

    bool ok = false;

    for (int i = 0; i < N; i++) {
        int x;
        cin >> x;
        if (x >= 0)
            ok = true;
    }

    cout << (ok ? "No" : "Yes") << endl;

    return 0;
}