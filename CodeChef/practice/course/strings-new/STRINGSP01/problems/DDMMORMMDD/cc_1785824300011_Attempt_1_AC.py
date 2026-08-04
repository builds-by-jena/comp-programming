t = int(input())

for _ in range(t):
    s = input().strip()

    a = int(s[:2])
    b = int(s[3:5])

    if a > 12:
        print("DD/MM/YYYY")
    elif b > 12:
        print("MM/DD/YYYY")
    else:
        print("BOTH")