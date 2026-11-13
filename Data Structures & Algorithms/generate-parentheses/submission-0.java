
class Solution {

    public void FindAnswer(int n, List<String> result,
                           StringBuilder temp, int open, int close) {

        // Base condition
        if (temp.length() == 2 * n) {
            result.add(temp.toString());
            return;
        }

        // Add opening bracket
        if (open < n) {
            temp.append('(');

            FindAnswer(n, result, temp, open + 1, close);

            temp.deleteCharAt(temp.length() - 1);
        }

        // Add closing bracket
        if (close < open) {
            temp.append(')');

            FindAnswer(n, result, temp, open, close + 1);

            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        FindAnswer(n, result, new StringBuilder(), 0, 0);

        return result;
    }
}