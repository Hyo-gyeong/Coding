class Solution {
    boolean solution(String s) {
        int countP = 0;
        int countY = 0;
        s =  s.toUpperCase(); 
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'Y')
                countY++;
            if (s.charAt(i) == 'P')
                countP++;
        }

        return countY == countP ? true : false;
    }
}



class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
