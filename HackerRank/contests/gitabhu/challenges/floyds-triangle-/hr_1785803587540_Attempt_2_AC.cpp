using namespace std;

int main() {
    // Optimize standard I/O operations for 
    performance
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    if (cin >> n) {
        int num = 1; // Counter variable 
        starting from 1
        
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                cout << num++;
                
                // Add a space between 
                numbers, except for the 
                last number in the row
                if (j < i) {
                    cout << " ";
                }
            }
            cout << "\n";
        }
    }

    return 0;
}