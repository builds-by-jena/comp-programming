# [A---Four-Coloring]

**Platform:** AtCoder
**Limits:** 2 sec | 1024 MiB
**Link:** [Problem Statement](https://atcoder.jp/contests/arc225/tasks/arc225_a)

---

### 📝 Problem Statement
There is an 
𝑁
×
𝑁
N×N grid 
𝑋
X. Let 
(
𝑖
,
𝑗
)
(i,j) denote the cell at the 
𝑖
i-th row from the top and the 
𝑗
j-th column from the left. We call two cells that share an edge adjacent.

Cell 
(
𝑖
,
𝑗
)
(i,j) is painted with color 
𝑋
𝑖
,
𝑗
X
i,j
	​

. The color is one of 
1
,
2
,
3
,
4
1,2,3,4, and adjacent cells are painted with different colors.

You will prepare an 
𝑁
×
𝑁
N×N grid 
𝑌
Y and paint each cell. Let 
𝑌
𝑖
,
𝑗
Y
i,j
	​

 denote the color painted on cell 
(
𝑖
,
𝑗
)
(i,j) of 
𝑌
Y.

Find one way of painting that satisfies the following conditions.

It can be proved that a way of painting satisfying the conditions always exists.

**Constraints:**


---

### 📥 Input / Output Specification
**Input:** Standard Input
**Output:** Adjacent cells of 
𝑌
Y may have the same color.

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```
3
1 2 3
2 1 4
1 3 2
```
**Output:**
```
4 1 4
1 3 2
4 4 2
```


#### Example 2
**Input:**
```
2
1 4
4 1
```
**Output:**
```
1 1
1 1
```




---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | 78102152 | 2026-08-03 22:35:12 | ❌ CE | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`78102152_Attempt_1_CE.java`](./78102152_Attempt_1_CE.java) |
