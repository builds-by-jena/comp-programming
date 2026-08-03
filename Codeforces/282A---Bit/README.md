# [282A---Bit]

**Platform:** Codeforces
**Limits:** 1 second | 256 megabytes
**Link:** [Problem Statement](https://codeforces.com/problemset/problem/282/A)

---

### 📝 Problem Statement
The classic programming language of Bitland is Bit++. This language is so peculiar and complicated.

The language is that peculiar as it has exactly one variable, called x. Also, there are two operations:

Operation ++ increases the value of variable x by 1.
Operation -- decreases the value of variable x by 1.

A statement in language Bit++ is a sequence, consisting of exactly one operation and one variable x. The statement is written without spaces, that is, it can only contain characters "+", "-", "X". Executing a statement means applying the operation it contains.

A programme in Bit++ is a sequence of statements, each of them needs to be executed. Executing a programme means executing all the statements it contains.

You're given a programme in language Bit++. The initial value of x is 0. Execute the programme and find its final value (the value of the variable when this programme is executed).

---

### 📥 Input / Output Specification
**Input:** Input

The first line contains a single integer n (1 ≤ n ≤ 150) — the number of statements in the programme.

Next n lines contain a statement each. Each statement contains exactly one operation (++ or --) and exactly one variable x (denoted as letter «X»). Thus, there are no empty statements. The operation and the variable can be written in any order.
**Output:** Output

Print a single integer — the final value of x.

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```
1
++X
```
**Output:**
```
1
```


#### Example 2
**Input:**
```
2
X++
--X
```
**Output:**
```
0
```




---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | 385398542 | Aug/03/2026 17:30UTC+5.5 | ✅ Accepted | 234 ms | 1100 KB | Java 21 | [`385398542_Attempt_1_AC.java`](./385398542_Attempt_1_AC.java) |
| 2 | 385398762 | Aug/03/2026 17:32UTC+5.5 | ✅ Accepted | 78 ms | 0 KB | PyPy 3-64 | [`385398762_Attempt_2_AC.py`](./385398762_Attempt_2_AC.py) |
| 3 | 385398959 | Aug/03/2026 17:33UTC+5.5 | ❌ Runtime error on test 1 | 156 ms | 0 KB | Java 21 | [`385398959_Attempt_3_RTE.java`](./385398959_Attempt_3_RTE.java) |
| 4 | 385399109 | Aug/03/2026 17:35UTC+5.5 | ❌ Time limit exceeded on test 1 | 1000 ms | 0 KB | Java 21 | [`385399109_Attempt_4_TLE.java`](./385399109_Attempt_4_TLE.java) |
| 5 | 385399180 | Aug/03/2026 17:35UTC+5.5 | ❌ Compilation error | 0 ms | 0 KB | PyPy 3-64 | [`385399180_Attempt_5_CE.py`](./385399180_Attempt_5_CE.py) |
