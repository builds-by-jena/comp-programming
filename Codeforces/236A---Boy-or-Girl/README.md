# [236A---Boy-or-Girl]

**Platform:** Codeforces
**Limits:** time limit per test1 second | memory limit per test256 megabytes
**Link:** [Problem Statement](https://codeforces.com/problemset/problem/236/A)

---

### 📝 Problem Statement
Those days, many boys use beautiful girls' photos as avatars in forums. So it is pretty hard to tell the gender of a user at the first glance. Last year, our hero went to a forum and had a nice chat with a beauty (he thought so). After that they talked very often and eventually they became a couple in the network.

But yesterday, he came to see "her" in the real world and found out "she" is actually a very strong man! Our hero is very sad and he is too tired to love again now. So he came up with a way to recognize users' genders by their user names.

This is his method: if the number of distinct characters in one's user name is odd, then he is a male, otherwise she is a female. You are given the string that denotes the user name, please help our hero to determine the gender of this user by his method.

---

### 📥 Input / Output Specification
**Input:** The first line contains a non-empty string, that contains only lowercase English letters — the user name. This string contains at most 100 letters.
**Output:** If it is a female by our hero's method, print "CHAT WITH HER!" (without the quotes), otherwise, print "IGNORE HIM!" (without the quotes).

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```
wjmzbmr
```
**Output:**
```
CHAT WITH HER!
```


#### Example 2
**Input:**
```
xiaodao
```
**Output:**
```
IGNORE HIM!
```


#### Example 3
**Input:**
```
sevenkplus
```
**Output:**
```
CHAT WITH HER!
```


--- 
### 💡 Note
For the first example. There are 6 distinct characters in "wjmzbmr". These characters are: "w", "j", "m", "z", "b", "r". So wjmzbmr is a female and you should print "CHAT WITH HER!".


---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | 385218180 | Aug/02/2026 07:32UTC+5.5 | ❌ Compilation error | 0 ms | 0 KB | C++20 (GCC 13-64) | [`385218180_Attempt_1_CE.cpp`](./385218180_Attempt_1_CE.cpp) |
| 2 | 385218195 | Aug/02/2026 07:32UTC+5.5 | ❌ Runtime error on test 1 | 30 ms | 0 KB | C++20 (GCC 13-64) | [`385218195_Attempt_2_RTE.cpp`](./385218195_Attempt_2_RTE.cpp) |
