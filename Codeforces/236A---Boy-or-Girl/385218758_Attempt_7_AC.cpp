#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;

    int freq[26] = {0};

    for (char c : s)
        freq[c - 'a']++;

    int cnt = 0;
    for (int i = 0; i < 26; i++)
        if (freq[i])
            cnt++;

    if (cnt % 2 == 0)
        cout << "CHAT WITH HER!";
    else
        cout << "IGNORE HIM!";

    return 0;
}