# [B---Train-Reservation]

**Platform:** AtCoder
**Limits:** 2 sec | 1024 MiB
**Link:** [Problem Statement](https://atcoder.jp/contests/abc463/tasks/abc463_b)

---

### 📝 Problem Statement
Takahashi is trying to reserve a seat on a train.

There are 
𝑁
N trains he is considering as candidates for reservation, numbered 
1
,
2
,
…
,
𝑁
1,2,…,N. Each train has seats in five columns, called column A, column B, column C, column D, and column E.

The current seat availability information for each train is given as strings 
𝑆
1
,
𝑆
2
,
…
,
𝑆
𝑁
S
1
	​

,S
2
	​

,…,S
N
	​

. Here, 
𝑆
1
,
𝑆
2
,
…
,
𝑆
𝑁
S
1
	​

,S
2
	​

,…,S
N
	​

 all have length 
5
5, and columns A through E of train 
𝑖
i correspond to the first through fifth characters of 
𝑆
𝑖
S
i
	​

, respectively. If that character is o, there is a vacant seat in the corresponding column; if it is x, there is no vacant seat in the corresponding column.

Takahashi wants to reserve a seat in column 
𝑋
X, where 
𝑋
X is one of A, B, C, D, E. Determine whether there is a vacant seat in column 
𝑋
X on at least one train.

**Constraints:**


---

### 📥 Input / Output Specification
**Input:** Standard Input
**Output:** No train has a vacant seat in column C. Thus, output No.

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```
3 A
xoxox
xxooo
oxxxx
```
**Output:**
```
Yes
```


#### Example 2
**Input:**
```
5 C
xoxoo
oxxoo
oxxxo
xoxxx
oxxoo
```
**Output:**
```
No
```




---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | 78097679 | 2026-08-03 17:47:17 | ❌ AC | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`78097679_Attempt_1_AC.java`](./78097679_Attempt_1_AC.java) |
