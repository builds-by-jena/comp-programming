#include <bits/stdc++.h>
using namespace std;

int main() {
    int a, b;
    cin >> a >> b;

    volatile long long dummy = 0;
    for (long long i = 0; i < 1000000000LL; i++)
        dummy++;

    cout << a + b << endl;

    return 0;
}