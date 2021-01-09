import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> cut = new ArrayList<Integer>();
        List<Integer> tmp = new ArrayList<Integer>();
        int cmd_len = 0;
        while (cmd_len < commands.length){
            for (int i = commands[cmd_len][0]-1; i < commands[cmd_len][1]; i++)
                cut.add(array[i]);
            Collections.sort(cut);
            int rslt = cut.get(commands[cmd_len][2]-1);
            tmp.add(rslt);
            int size = cut.size();
            for (int j = 0; j < size; j++)
                cut.remove(0);
            cmd_len++;
        }
        int[] answer = new int[tmp.size()]; //1.list를 배열로 옮기는 방법
        for(int i = 0; i < tmp.size(); i++) 
            answer[i] = tmp.get(i);
        return answer;
    }
}

*************************************************************************
memo)
1.코드가 길긴 하지만 내가 실수없이 짤 수 있고 가장 잘 이해할 수 있는 방법
*************************************************************************


모범답안 예)
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]); //1.copyOfRange사용
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}

*************************************************************************
memo)
1.Arrays 클래스의 주요 메소드
1)copyOf() : 배열 전체를 복사해서 새로운 배열을 생성한 후 반환
  ex)
  // initializing an array original 
  int[] org = new int[] {1, 2 ,3};
  // copying array org to copy 
  int[] copy = Arrays.copyOf(org, 5); //객체와 길이, 길이자리엔 주로 객체.length들어감
  Q What happens if length of copied array is greater than original array?
  A The indices missing in original will have zero in copy.
2)copyOfRange() : 배열 일부를 복사해서 새로운 배열을 생성한 후 반환. 지정된 범위의 끝은 포함되지 않음.
3)fill() : 배열의 모든 요소를 지정된 값으로 채움.
4)setAll() : 배열을 채우는데 사용할 함수형 인터페이스를 매개변수로 받음. 메소드 호출시 함수형 인터페이스를 구현한 객체를 매개변수나 람다식을 지정해야함.
  ex1>
  int[] arr = new int[10];
  Arrays.setAll(arr, (index) -> 1 + index);
    //output = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
  ex2>
  int[] arr_parallel1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
  int[] arr = Arrays.copyOf(arr_parallel1, arr_parallel1.length); 
  Arrays.setAll(arr, e-> 
  { 
      if (e % 2 == 0) 
          return e * e; 
      else
          return e; 
  }); //조건문을 넣을 수도 있음.
5)sort(Object [] o, int from_Index, int to_Index) : 배열 오름차순 정렬. 정렬범위 정할 수 있음.
  ex)
  int[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
  Arrays.sort(arr, 1, 5);
  //output = [13, 6, 7, 21, 45, 9, 2, 100] //to_index is exclusive.
6)sort(Object [] o, Comparator c) : 지정한 Comparator에 의해 정렬됨. Comparator를 구현해서 정렬기준을 제공할 수 있음.
7)binarySearch(data_type arr, data_type key) : 배열에 저장된 요소를 검색할 때 사용. 지정된 값이 저장된 위치(index)반환.
  *If input list is not sorted, the results are undefined.
  *If there are duplicates, there is no guarantee which one will be found. 
8)toString() : 배열의 모든 요소를 문자열로 출력. 일차원 배열에서만 사용가능
9)deepToString() : 배열의 모든 요소를 재귀적으로 접근해서 문자열을 구성하므로 2차원 배열뿐 아니라 그 이상의 다차원 배열에서도 사용가능.
10)equals(Object[] a, Object[] a2) : 두 배열에 저장된 모든 요소를 비교해서 같으면 true, 아니면 false반환. 일차원 배열에서만 사용가능.
11)deepEquals(Object[] a, Object[] a2) : 다차원 배열의 요소 비교시 사용.
12)asList(Object...a) : 새로운 배열 객체를 만드는 것이 아니라, 원본 배열의 주소값을 가져오게 된다. 따라서 새로운 원소를 추가하거나 삭제 할 수 없다. 배열의 내용을 수정하려고 할 때 List로 바꿔서 편리하게 사용하기 위함.
  ex)
  String[] strs = {"alpha", "beta", "charlie"};
  System.out.println(Arrays.toString(strs));   // [alpha, beta, charlie]

  List<String> lst = Arrays.asList(strs); // new ArrayList<String>(); 대신에 사용, 원본 배열의 주소값을 가져오게됨.
  System.out.println(lst);  // [alpha, beta, charlie]

  lst.add("ttt");     // error : asList()로 List를 생성하면 원소를 새롭게 추가할 수 없음

  // Changes in array or list write thru
  strs[0] += "88";
  lst.set(2, lst.get(2) + "99"); // 2번째 인덱스 원소에 charlie99 넣음
  System.out.println(Arrays.toString(strs)); // [alpha88, beta, charlie99]
  System.out.println(lst);  // [alpha88, beta, charlie99]

  // Initialize a list using an array
  List<Integer> lstInt = Arrays.asList(22, 44, 11, 33);
  System.out.println(lstInt);  // [22, 44, 11, 33]
  
  *진짜 ArrayList를 받기 위해서는...
  ex)
  String[] strs = {"alpha", "beta", "charlie"};
  System.out.println(Arrays.toString(strs));   // [alpha, beta, charlie]

  List<String> lst = new ArrayList<String>(Arrays.asList(strs)); //원본을 복사했지만 원본과는 별개의 List를 생성
  System.out.println(lst);  // [alpha, beta, charlie]

  lst.add("ttt");     // 이제는 에러가 나지 않고 데이터를 추가 시킬 수 있다.

  // Changes in array or list write thru
  strs[0] += "88";
  lst.set(2, lst.get(2) + "99"); // 2번째 인덱스 원소에 charlie99 넣음
  System.out.println(Arrays.toString(strs)); // [alpha88, beta, charlie]
  System.out.println(lst);  // [alpha, beta, charlie99, ttt]

  // Initialize a list using an array
  List<Integer> lstInt = Arrays.asList(22, 44, 11, 33);
  System.out.println(lstInt);  // [22, 44, 11, 33]
13)parallelXX() : 'parallel'로 시작하는 메소드는 보다 빠른 결과를 얻기 위해 여러 thread가 작업을 나누어 처리.
14)spliterator() : 여러 thread가 처리할 수 있게 하나의 작업을 여러 작업으로 나누는 Spliterator반환.
15)stream() : The stream(T[] array) method of Arrays class in Java, is used to get a Sequential Stream from the array passed as the parameter with its elements. 
              It returns a sequential Stream with the elements of the array, passed as parameter, as its source.
  ex)
  String[] arr = { "Geeks", "for", "Geeks" }; 
    // Using Arrays.stream() to convert 
    // array into Stream 
  Stream<String> stream = Arrays.stream(arr); 
    // Displaying elements in Stream 
  stream.forEach(str -> System.out.print(str + " ")); 
    //Arrays.stream(arr).forEach(str -> System.out.print(str + " "));로 줄여서 사용도 가능.

출처 : [https://codedragon.tistory.com/8087, https://www.geeksforgeeks.org], [https://m.blog.naver.com/roropoly1/221140156345]
*************************************************************************
