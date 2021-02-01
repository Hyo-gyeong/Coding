import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> divisor = new ArrayList<Integer>();
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (divisor.contains(i) == false && n%i == 0){
                answer += i;
                divisor.add(i);
                if (i != n/i){
                    answer += n/i;
                    divisor.add(n/i);
                }                
            }
        }
        return answer;
    }
}
