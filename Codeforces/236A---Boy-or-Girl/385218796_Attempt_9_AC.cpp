#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;

    bool vis[26] = {};

    for (char c : s)
        vis[c - 'a'] = true;

    int cnt = 0;
    for (bool x : vis)
        if (x)
            cnt++;

    cout << (cnt % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");

    return 0;
}