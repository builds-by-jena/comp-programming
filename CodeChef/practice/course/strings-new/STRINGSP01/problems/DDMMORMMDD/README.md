# [DDMM-or-MMDD]

**Platform:** CodeChef
**Limits:** N/A | N/A
**Link:** [Problem Statement](https://www.codechef.com/practice/course/strings-new/STRINGSP01/problems/DDMMORMMDD)

---

### 📝 Problem Statement
### DDMM or MMDD

Chef is confused by all the different formats dates can be written in. Here's a simple problem Chef wants you to solve.

You are given a date string SSS. The date follows the Gregorian calendar, the one used in most parts of the world.

Identify whether it is of the form DD/MM/YYYY or MM/DD/YYYY, or if it can be of both forms. Here DD denotes the 2-digit day, MM denotes the 2-digit month and YYYY denotes the 4-digit year.

It is guaranteed that SSS is a valid date taking at least one of these forms.

For example,

21/05/2001 is of the form DD/MM/YYYY and not MM/DD/YYYY.

10/15/2069 is of the form MM/DD/YYYY and not DD/MM/YYYY.

05/11/1999 can be of both forms.

### Input Format

The first line contains a single integer TTT — the number of test cases. Then the test cases follow.

Each test case consists of a single line containing a string of 101010 characters SSS — the date string SSS, which is of the form DD/MM/YYYY or MM/DD/YYYY. It is guaranteed that SSS is a valid date taking at least one of these forms.

### Output Format

For each test case, output "BOTH" if the date string satisfies both forms. Otherwise output "DD/MM/YYYY" if it is of the form DD/MM/YYYY, else "MM/DD/YYYY". Note that the output may be case-insensitive. So "DD/MM/YYYY", "dd/mm/yyyy" and so on will be considered the same.

### Constraints

1≤T≤20231 \leq T \leq 20231≤T≤2023

SSS is of the form DD/MM/YYYY or MM/DD/YYYY

### Sample 1:

### Explanation:

Fun fact: 29/02/2024 (read as DD/MM/YYYY) is a leap year day.

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
21/05/2001
10/15/2069
05/11/1999
29/02/2024
```
**Output:**
```
DD/MM/YYYY
MM/DD/YYYY
BOTH
DD/MM/YYYY
```




---

### 📊 Submission History
| Attempt | Date & Time | Verdict | Language | File |
| :---: | :---: | :---: | :---: | :---: |
| 1 | 8/4/2026, 11:48:25 AM | ✅ Accepted | Python | [`cc_1785824300011_Attempt_1_AC.py`](./cc_1785824300011_Attempt_1_AC.py) |
