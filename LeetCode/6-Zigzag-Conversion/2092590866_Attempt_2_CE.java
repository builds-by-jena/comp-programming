class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length())
            return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++)
            rows[i] = new StringBuilder();

        int curRow = 
        boolean down = false;

        for (char c : s.toCharArray()) {

            rows[curRow].append(c);

            if (curRow == 0 || curRow == numRows - 1)
                down = !down;

            curRow += down ? 1 : -1;
        }

        StringBuilder ans = new StringBuilder();

        for (StringBuilder row : rows)
            ans.append(row);

        return ans.toString();
    }
}