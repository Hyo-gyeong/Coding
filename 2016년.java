import java.util.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        Calendar cal = Calendar.getInstance(); //1.Calendar클래스
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, a-1);
        cal.set(Calendar.DATE, b);
        int day = cal.get(Calendar.DAY_OF_WEEK);//1~
        answer = days[(day-1) % 7];
        return answer;
    }
}


***********************************************************************
memo)
  //인스턴스 생성
Calendar cal = Calendar.getInstance(); 
  //년,월,일,시,분,초 각각 변수에 담기
int year = cal.get(Calendar.YEAR);
int mon = cal.get(Calendar.MONTH);
int day = cal.get(Calendar.DAY_OF_MONTH);
int hour = cal.get(Calendar.HOUR_OF_DAY);
int min = cal.get(Calendar.MINUTE);
int sec = cal.get(Calendar.SECOND);
  // Calendar에 년,월,일 셋팅
cal.set(Calendar.YEAR, year);
cal.set(Calendar.MONTH, month-1);
cal.set(Calendar.DATE, 1);
  //시작 요일과 마지막 날짜
int startDay = cal.get(Calendar.DAY_OF_WEEK); 
int lastDay = cal.getActualMaximum(Calendar.DATE);

  //날짜 별도로 설정
java.util.Calendar.set(int year, int month, int date)
cal.set(1995, 5, 25);
  //또는
cal.set(Calendar.YEAR, 2016);
cal.set(Calendar.MONTH, 12);
cal.set(Calendar.DATE, 15);
 
출처: https://hyeonstorage.tistory.com/205 [개발이 하고 싶어요]
************************************************************************
