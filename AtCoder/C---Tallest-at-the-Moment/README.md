# [C---Tallest-at-the-Moment]

**Platform:** AtCoder
**Limits:** 2 sec | 1024 MiB
**Link:** [Problem Statement](https://atcoder.jp/contests/abc463/tasks/abc463_c)

---

### 📝 Problem Statement
Currently, there are 
𝑁
N Takahashi in a conference room. The 
𝑖
i-th 
(
1
≤
𝑖
≤
𝑁
)
(1≤i≤N) Takahashi has a height of 
𝐻
𝑖
H
i
	​

 and will leave the room 
𝐿
𝑖
L
i
	​

 minutes from now. Once a Takahashi leaves the room, he never returns.

You are given 
𝑄
Q queries, so answer them in order. For the 
𝑖
i-th 
(
1
≤
𝑖
≤
𝑄
)
(1≤i≤Q) query, you are given an integer 
𝑇
𝑖
T
i
	​

, so find the maximum height among the Takahashi who are in the room 
𝑇
𝑖
+
1
2
T
i
	​

+
2
1
	​

 minutes from now. Under the constraints of this problem, it is guaranteed that at least one Takahashi will be in the room 
𝑇
𝑖
+
1
2
T
i
	​

+
2
1
	​

 minutes from now.

**Constraints:**


---

### 📥 Input / Output Specification
**Input:** Standard Input
**Output:** Standard Output

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```
4
31 4
26 5
3 5
15 9
4
3 4 5 6
```
**Output:**
```
31
26
15
15
```


#### Example 2
**Input:**
```
10
587 138
772 155
755 404
519 408
529 432
169 586
114 632
249 656
329 972
299 984
14
443 801 824 276 399 314 300 510 311 580 498 930 359 5
```
**Output:**
```
329
329
329
755
755
755
755
329
755
329
329
329
755
772
```




---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | 78097794 | 2026-08-03 17:51:37 | ❌ AC | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`78097794_Attempt_1_AC.java`](./78097794_Attempt_1_AC.java) |
