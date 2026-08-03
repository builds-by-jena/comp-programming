from bisect import bisect_right

n = int(input())

h = [0] * n
l = [0] * n

for i in range(n
    h[i], l[i] = map(int, input().split())

# suffix maximum heights
mx = [0] * n
mx[-1] = h[-1]

for i in range(n - 2, -1, -1):
    mx[i] = max(mx[i + 1], h[i])

q = int(input())
t = list(map(int, input().split()))

for x in t:
    idx = bisect_right(l, x)
    print(mx[idx])