class Solution {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}

--------------------------------------
s = "123", Integer.parseInt(s) = 123
s = "-123", Integer.parseInt(s) = -123
s = "+123", Integer.parseInt(s) = +123
s = "a123", NumberFormatException.forInputString
s = "*123", NumberFormatException.forInputString
