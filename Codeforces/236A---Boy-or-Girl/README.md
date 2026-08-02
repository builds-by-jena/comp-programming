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
| 1 | 385218180 | Aug/02/2026 07:32UTC+5.5 | ❌ Compilation error | 0 ms | 0 KB | C++20 (GCC 13-64) | [`385218180_Attempt_1_CE.cpp`](./385218180_Attempt_1_CE.cpp) |
| 2 | 385218195 | Aug/02/2026 07:32UTC+5.5 | ❌ Runtime error on test 1 | 30 ms | 0 KB | C++20 (GCC 13-64) | [`385218195_Attempt_2_RTE.cpp`](./385218195_Attempt_2_RTE.cpp) |
| 3 | 385218211 | Aug/02/2026 07:32UTC+5.5 | ❌ Compilation error | 0 ms | 0 KB | C++20 (GCC 13-64) | [`385218211_Attempt_3_CE.cpp`](./385218211_Attempt_3_CE.cpp) |
| 4 | 385218680 | Aug/02/2026 07:46UTC+5.5 | ❌ Compilation error | 0 ms | 0 KB | C++20 (GCC 13-64) | [`385218680_Attempt_4_CE.cpp`](./385218680_Attempt_4_CE.cpp) |
| 5 | 385218710 | Aug/02/2026 07:47UTC+5.5 | ❌ Time limit exceeded on test 1 | 1000 ms | 0 KB | C++20 (GCC 13-64) | [`385218710_Attempt_5_TLE.cpp`](./385218710_Attempt_5_TLE.cpp) |
| 6 | 385218747 | Aug/02/2026 07:48UTC+5.5 | ✅ Accepted | 62 ms | 100 KB | C++20 (GCC 13-64) | [`385218747_Attempt_6_AC.cpp`](./385218747_Attempt_6_AC.cpp) |
| 7 | 385218758 | Aug/02/2026 07:48UTC+5.5 | ✅ Accepted | 92 ms | 100 KB | C++20 (GCC 13-64) | [`385218758_Attempt_7_AC.cpp`](./385218758_Attempt_7_AC.cpp) |
| 8 | 385218766 | Aug/02/2026 07:48UTC+5.5 | ✅ Accepted | 62 ms | 100 KB | C++20 (GCC 13-64) | [`385218766_Attempt_8_AC.cpp`](./385218766_Attempt_8_AC.cpp) |
| 9 | 385218796 | Aug/02/2026 07:49UTC+5.5 | ✅ Accepted | 92 ms | 100 KB | C++20 (GCC 13-64) | [`385218796_Attempt_9_AC.cpp`](./385218796_Attempt_9_AC.cpp) |
| 10 | 385219414 | Aug/02/2026 08:08UTC+5.5 | ❌ Compilation error | 0 ms | 0 KB | C++20 (GCC 13-64) | [`385219414_Attempt_10_CE.cpp`](./385219414_Attempt_10_CE.cpp) |
