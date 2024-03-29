예전에 풀려고 시도가 실패한 문제를 다시 풀어봤다
import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int m_length = 0;
        int m_index, p_index = 0;
        int i;
        List<Integer> picked = new ArrayList<Integer>();
        while(m_length < moves.length){
            i = 0;
            m_index = moves[m_length];
            while(i < board.length){
                if (board[i][m_index-1] != 0){
                	if (p_index == 0) {
                		picked.add(board[i][m_index-1]);
                		p_index++;
                	}
                	else if (picked.get(p_index-1) != board[i][m_index-1]){
                        picked.add(board[i][m_index-1]);
                        p_index++;
                    }
                    else {
                        picked.remove(--p_index);
                        answer += 2;
                    }
                    board[i][m_index-1] = 0; //1.이 포인트와 
                    break; //2.이 포인트 생각해줘야함!
                }
                i++;
            }
            m_length++;
        }
        return answer;
    }
}

**********************************************************************************************
memo)
1.0이 아닌 숫자가 걸리면 무조건 뽑기때문에 그 자리를 0으로 만들어줘야함
2.인형을 뽑고도 더 밑으로 내려가지 않도록 while문을 나와야함
**********************************************************************************************

더 나은 풀이 예시)
import java.util.Stack; //1.stack사용

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[j][move - 1]);
                        board[j][move - 1] = 0;
                        break;
                    }
                    if (board[j][move - 1] == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    } else
                        stack.push(board[j][move - 1]);
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}


**********************************************************************************************
memo)
!자바에도 stack이 있구나!!;;;하하;;;
1.Stack
public Element push(Element item); // 데이터 추가
public Element pop(); // 최근에 추가된(Top) 데이터 삭제
public Element peek(); // 최근에 추가된(Top) 데이터 조회
public boolean empty(); // stack의 값이 비었는지 확인, 비었으면 true, 아니면 false
public int search(Element data); // 인자값으로 받은 데이터의 위치 반환 - index아니고 순번으로 반환!

출처 : https://velog.io/@lshjh4848/Java-%EC%8A%A4%ED%83%9DStack-%ED%81%B4%EB%9E%98%EC%8A%A4-%EC%A0%95%EB%A6%AC
**********************************************************************************************
