import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        while(i < arr.length){
            int value = arr[i];
            list.add(value);
            while(i < arr.length && arr[i] == value) //java.lang.ArrayIndexOutOfBoundsException 예외처리
                i++;
        }
        
        int[] answer = new int[list.size()];
        int index = 0;
        for (Integer a : list){
            answer[index++] = a;
        }
        return answer;
    }
}
*********************************************************************************************
memo)
조건이 맞는다면 while문안에서 i가 arr.length와 상관없이 무한증가할 수 있기때문에
i < arr.length 이 조건문을 꼭 앞에 써줘야함! 뒤에 적게되면 i가 이미 증가된 후 조건문을 따지게되기때문에

1.길이
length : 배열의 길이 파악
length() : 문자열의 길이 파악
size() : 컬렉션프레임워크 타입의 길이 파악 예)ArrayList...
*********************************************************************************************
