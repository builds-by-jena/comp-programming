# [A---Conveyor-Design]

**Platform:** AtCoder
**Limits:** 2 sec | 1024 MiB
**Link:** [Problem Statement](https://atcoder.jp/contests/ahc065/tasks/ahc065_a)

---

### 📝 Problem Statement
There is an 
𝑁
×
𝑁
N×N warehouse. Let 
(
0
,
0
)
(0,0) be the coordinates of the top-left cell, and let 
(
𝑖
,
𝑗
)
(i,j) be the coordinates of the cell located 
𝑖
i cells downward and 
𝑗
j cells to the right from there. The cell 
(
0
,
𝑁
/
2
)
(0,N/2) contains the exit of the warehouse.

There is exactly one box with each number from 
0
0 to 
𝑁
2
−
1
N
2
−1 in the warehouse. In the initial state, the number of the box placed in cell 
(
𝑖
,
𝑗
)
(i,j) is 
𝑎
𝑖
,
𝑗
a
i,j
	​

.

First, install at most 
𝑁
2
N
2
 loop-shaped devices in the warehouse. Hereafter, each loop-shaped device is called a conveyor belt.

The 
𝑚
m-th conveyor belt is represented by a sequence of cells

(
𝑖
𝑚
,
0
,
𝑗
𝑚
,
0
)
,
(
𝑖
𝑚
,
1
,
𝑗
𝑚
,
1
)
,
…
,
(
𝑖
𝑚
,
𝑙
𝑚
−
1
,
𝑗
𝑚
,
𝑙
𝑚
−
1
)
(i
m,0
	​

,j
m,0
	​

),(i
m,1
	​

,j
m,1
	​

),…,(i
m,l
m
	​

−1
	​

,j
m,l
m
	​

−1
	​

)

where 
𝑙
𝑚
l
m
	​

 is the length of the conveyor belt.

Each conveyor belt must satisfy the following conditions.

Also, over all conveyor belts, each cell must be contained in at most two conveyor belts.

After installing the conveyor belts, you may perform at most 
1
0
5
10
5
 turns of operations. In each turn, specify a conveyor belt number 
𝑚
m and a direction 
𝑑
∈
{
−
1
,
1
}
d∈{−1,1}, and all boxes and empty cells on that conveyor belt simultaneously move circularly by one cell. That is, a box or an empty cell at cell 
(
𝑖
𝑚
,
𝑥
,
𝑗
𝑚
,
𝑥
)
(i
m,x
	​

,j
m,x
	​

) before the operation moves after the operation to cell

(
𝑖
𝑚
,
(
𝑥
+
𝑑
)
m
o
d
𝑙
𝑚
,
𝑗
𝑚
,
(
𝑥
+
𝑑
)
m
o
d
𝑙
𝑚
)
(i
m,(x+d)modl
m
	​

	​

,j
m,(x+d)modl
m
	​

	​

)

After the operation, if there is a box in the exit cell 
(
0
,
𝑁
/
2
)
(0,N/2) and its number is the smallest among the boxes remaining in the warehouse, that box is removed through the exit.

If 
𝑎
0
,
𝑁
/
2
=
0
a
0,N/2
	​

=0 in the initial state, box 
0
0 is removed before the first operation is performed.

Move out all boxes in increasing order of management number using as few operations as possible.

---

### 📥 Input / Output Specification
**Input:** Please be aware that sharing visualization results or discussing solutions/ideas during the contest is prohibited.
**Output:** First, let 
𝑀
M be the number of conveyor belts to install, and output it to Standard Output in the following format.

Then, let 
𝑇
T be the number of operations, and output the operation sequence in the following format.

In the 
𝑡
t-th operation, the 
𝑚
𝑡
m
t
	​

-th conveyor belt is circularly shifted by one cell in direction 
𝑑
𝑡
d
t
	​

.

The output must satisfy the following conditions.

Show example

---

### 🧪 Sample Tests
_No sample test cases provided._



---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | 78102064 | 2026-08-03 22:24:24 | ❌ CE | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`78102064_Attempt_1_CE.java`](./78102064_Attempt_1_CE.java) |
| 2 | 78102084 | 2026-08-03 22:26:59 | ❌ CE | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`78102084_Attempt_2_CE.java`](./78102084_Attempt_2_CE.java) |
| 3 | 78102133 | 2026-08-03 22:32:21 | ❌ CE | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`78102133_Attempt_3_CE.java`](./78102133_Attempt_3_CE.java) |
