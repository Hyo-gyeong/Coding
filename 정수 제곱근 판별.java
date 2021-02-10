class Solution {
    public long solution(long n) {
        double answer = 0;
        double sqrt = Math.sqrt(n); //0.
        if (sqrt % 1 == 0)
            answer = (sqrt+1)*(sqrt+1);
        else answer = -1;
        return (long)answer; //1.
    }
}
-----------------------------------------
memo)
0.Math.sqrt() === double
1.double to long
-----------------------------------------

다른 풀이

class Solution {
  public long solution(long n) {
      if (Math.pow((int)Math.sqrt(n), 2) == n) { //1.
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
  }
}

----------------------------------------
memo)
1.Math.pow(x, y) =>x의 y승 반환
----------------------------------------
