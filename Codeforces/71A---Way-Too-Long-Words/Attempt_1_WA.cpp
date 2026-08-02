#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    while (n--) {
        string word;
        cin >> word;

        // Out of bounds access -> Runtime Error (Undefined Behavior)
        if (word[1000] == 'a')
            cout << word << "\n";
        else if (word.length() > 10)
            cout << word[0] << word.length() - 2 << word[word.length() - 1] << "\n";
        else
            cout << word << "\n";
    }
}