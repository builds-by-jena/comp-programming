N, M = map(int, input().split())

ans = [-1] * (M + 1)

for _ in range(N):
    c, s = map(int, input().split())
    ans[c] = max(ans[c], s)

print(*ans[1:])