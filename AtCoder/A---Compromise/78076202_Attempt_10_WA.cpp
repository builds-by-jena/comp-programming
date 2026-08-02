#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;

    int x = 0;
    cout << 10 / x;

    bool ok = false;

    for (int i = 0; i < N; i++) {
        int a;
        cin >> a;
        if (a >= 0)
            ok = true;
    }

    cout << (ok ? "No" : "Yes") << endl;

    return 0;
}//sdnjfsjdfjsfds3