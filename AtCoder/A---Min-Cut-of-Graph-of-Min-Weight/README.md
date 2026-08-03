# [A---Min-Cut-of-Graph-of-Min-Weight]

**Platform:** AtCoder
**Limits:** 2 sec | 2048 MiB
**Link:** [Problem Statement](https://atcoder.jp/contests/awtf2026algo/tasks/awtf2026algo_a)

---

### 📝 Problem Statement
There is a weighted tree 
𝑇
T with 
𝑁
N vertices numbered 
1
1 to 
𝑁
N. The 
𝑖
i-th edge of 
𝑇
T connects vertices 
𝐴
𝑖
A
i
	​

 and 
𝐵
𝑖
B
i
	​

 with weight 
𝐶
𝑖
C
i
	​

.

We now construct a complete undirected graph 
𝐺
G with 
𝑁
N vertices numbered 
1
1 to 
𝑁
N, based on 
𝑇
T. For each edge of 
𝐺
G, the capacity is defined as follows.

Let 
𝑓
(
𝑖
,
𝑗
)
f(i,j) be the capacity of the minimum cut separating vertices 
𝑖
i and 
𝑗
j on 
𝐺
G.

Find 
∑
1
≤
𝑖
<
𝑗
≤
𝑁
𝑓
(
𝑖
,
𝑗
)
∑
1≤i<j≤N
	​

f(i,j), modulo 
998244353
998244353.

Solve 
𝑆
S cases for each input.

**Constraints:**


---

### 📥 Input / Output Specification
**Input:** Standard Input
**Output:** In the first test case, the capacities of edges 
(
1
,
2
)
,
(
1
,
3
)
,
(
2
,
3
)
(1,2),(1,3),(2,3) of 
𝐺
G are 
1
,
1
,
10
1,1,10, respectively. The answer is 
𝑓
(
1
,
2
)
+
𝑓
(
1
,
3
)
+
𝑓
(
2
,
3
)
=
2
+
2
+
11
=
15
f(1,2)+f(1,3)+f(2,3)=2+2+11=15.

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```
4
3
1 2 1
2 3 10
4
1 2 1
2 3 10
3 4 2
13
11 4 337329830
13 1 72247
4 1 1768959
5 4 5399893
2 8 1832265
12 7 107755
10 4 743
5 12 95
4 3 389684075
2 6 1222
11 8 253280162722
9 4 21671
15
8 5 285187324995
14 10 755031423304
2 8 88860861719
12 7 596982637940
10 4 225447687713
7 15 210989590191
13 5 836365489027
6 15 859904883890
8 1 362117197524
12 8 422952343663
1 14 112179584332
15 11 487330735107
12 9 528451854379
3 7 343910842803
```
**Output:**
```
15
32
13620068
909241492
```




---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | 78097965 | 2026-08-03 17:58:31 | ❌ RE | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`78097965_Attempt_1_RTE.java`](./78097965_Attempt_1_RTE.java) |
