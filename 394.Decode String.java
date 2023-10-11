class Solution {
    public String decodeString(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> sta = new Stack<>();
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                num = num * 10 + ch - '0';
            } else if (ch == '[') {
                sta.push(ans);
                ans = new StringBuilder();
                numStack.push(num);
                num = 0;
            } else if (ch == ']') {
                StringBuilder temp = ans;
                ans = sta.pop();
                int count = numStack.pop();
                while (count-- > 0) {
                    ans.append(temp);
                }
            } else {
                ans.append(ch);
            }
        }
        
        return ans.toString();
    }
}
