#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;

    volatile long long dummy = 0;
    for (long long i = 0; i < 1000000000LL; i++)
        dummy++;

    set<char> st;
    for (char c : s)
        st.insert(c);

    if (st.size() % 2 == 0)
        cout << "CHAT WITH HER!";
    else
        cout << "IGNORE HIM!";

    return 0;
}//76777