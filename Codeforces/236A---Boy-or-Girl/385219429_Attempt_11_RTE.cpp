#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;

    int x = 0;
    cout << 100 / x;

    set<char> st;
    for (char c : s)
        st.insert(c);

    if (st.size() % 2 == 0)
        cout << "CHAT WITH HER!";
    else
        cout << "IGNORE HIM!";

    return 0;
}//76;[]