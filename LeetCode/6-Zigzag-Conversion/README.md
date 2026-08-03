# [6-Zigzag-Conversion]

**Platform:** LeetCode
**Limits:** N/A | N/A
**Link:** [Problem Statement](https://leetcode.com/problems/zigzag-conversion/)

---

### 📝 Problem Statement
The string `&quot;PAYPALISHIRING&quot;` is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)


```

P   A   H   N
A P L S I I G
Y   I   R

```



And then read line by line: `&quot;PAHNAPLSIIGYIR&quot;`


Write the code that will take a string and make this conversion given a number of rows:


```

string convert(string s, int numRows);

```



 

**Example 1:**


```

**Input:** s = &quot;PAYPALISHIRING&quot;, numRows = 3
**Output:** &quot;PAHNAPLSIIGYIR&quot;

```



**Example 2:**


```

**Input:** s = &quot;PAYPALISHIRING&quot;, numRows = 4
**Output:** &quot;PINALSIGYAHRPI&quot;
**Explanation:**
P     I    N
A   L S  I G
Y A   H R
P     I

```



**Example 3:**


```

**Input:** s = &quot;A&quot;, numRows = 1
**Output:** &quot;A&quot;

```



 

**Constraints:**



	* `1 <= s.length <= 1000`
	* `s` consists of English letters (lower-case and upper-case), `&#39;,&#39;` and `&#39;.&#39;`.
	* `1 <= numRows <= 1000`

---

### 📥 Input / Output Specification
**Input:** Refer to problem description.
**Output:** Refer to problem description.

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```
"PAYPALISHIRING"
3
```
**Output:**
```
N/A
```




---

### 📊 Submission History
| Attempt | Date & Time | Verdict | Language | File |
| :---: | :---: | :---: | :---: | :---: |
| 1 | 8/3/2026, 5:59:51 PM | ✅ Accepted | Java | [`2092590656_Attempt_1_AC.java`](./2092590656_Attempt_1_AC.java) |
