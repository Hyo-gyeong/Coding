import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        List<Integer> a_list = Arrays.stream(a).boxed().collect(Collectors.toList()); //1.배열->리스트
        List<Integer> b_list = Arrays.stream(b).boxed().collect(Collectors.toList());
        for (int i = 0; i < a.length; i++)
            answer += a_list.get(i) * b_list.get(i);
        return answer;
    }
}

-----------------------------------------------------
memo)
1.배열을 list로 바꾸는 방법
We can use Java 8 Stream API to convert int array to list of Integer. Below are the steps:

1.Convert the specified primitive array to a sequential stream using Arrays.stream()
 
2.Box each element of the stream to an Integer using IntStream.boxed()
 
3.Use Collectors.toList() to accumulate the input elements into a new List.
ex)
  import java.util.stream.Collectors;잊지 말고
    int[] arr = { 1, 2, 3, 4, 5 };

    List<Integer> list = Arrays.stream(arr)        // IntStream
                                .boxed()          // Stream<Integer>
                                .collect(Collectors.toList());
    System.out.println(list);
    //output : [1, 2, 3, 4, 5]
  
*Naive
  int[] arr = { 1, 2, 3, 4, 5 };
 
    List<Integer> list = new ArrayList<>(arr.length);

    for (int i : arr) {
        list.add(Integer.valueOf(i));
    }

    System.out.println(list);
-----------------------------------------------------
