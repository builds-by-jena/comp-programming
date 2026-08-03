#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int H, W, D;
    if (!(cin >> H >> W >> D)) return 0;

    const char colors[4] = {'R', 'G', 'B', 'Y'};

    for (int r = 0; r < H; ++r) {
        string row = "";
        for (int c = 0; c < W; ++c) {
            int u = r + c;
            int v = r - c + W; // Shift v by W to keep it non-negative

            // Find block index in the D x D grid
            int block_u = (u / D) % 2;
            int block_v = (v / D) % 2;

            if (block_u < 0) block_u += 2;
            if (block_v < 0) block_v += 2;

            int colorIdx = block_u * 2 + block_v;
            row += colors[colorIdx];
        }
        cout << row << "\n";
    }

    return 0;
}