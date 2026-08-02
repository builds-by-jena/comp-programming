# [71A---Way-Too-Long-Words]

**Platform:** Codeforces
**Limits:** time limit per test1 second | memory limit per test256 megabytes
**Link:** [Problem Statement](https://codeforces.com/problemset/problem/71/A)

---

## 📝 Problem Statement
Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.

Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced with a special abbreviation.

This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.

Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".

You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.

---

## 📥 Input / Output Specification
**Input:** The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.
**Output:** Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.

---

## 🧪 Sample Tests

### Example 1
**Input:**
```
4
word
localization
internationalization
pneumonoultramicroscopicsilicovolcanoconiosis
```
**Output:**
```
word
l10n
i18n
p43s
```




---

## 📊 Submission History
| Attempt | Date & Time | Verdict | Runtime | Memory | Language | File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 2 | Aug/02/2026 06:20UTC+5.5 | ❌ Time limit exceeded on test 1 | 1000 ms | 0 KB | C++20 (GCC 13-64) | [`Attempt_2_TLE.cpp`](./Attempt_2_TLE.cpp) |
| 3 | Aug/02/2026 06:29UTC+5.5 | ✅ Accepted | 31 ms | 100 KB | C++20 (GCC 13-64) | [`Attempt_3_AC.cpp`](./Attempt_3_AC.cpp) |
| 4 | Aug/02/2026 06:33UTC+5.5 | ✅ Accepted | 46 ms | 100 KB | C++20 (GCC 13-64) | [`Attempt_4_AC.cpp`](./Attempt_4_AC.cpp) |
