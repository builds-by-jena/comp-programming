//..
#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;

    unordered_set<char> st;

    for (char c : s)
        st.insert(c);

    cout << (st.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");

    return 0;
}