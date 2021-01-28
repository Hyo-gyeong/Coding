class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] notPrime = new boolean[n+1]; //int로 해도 됨.
        for (int i = 2; i <= n; i++)
            for (int j = 2; j*i <= n; j++){ //1.에라토스테네스의 체
                if (notPrime[j*i] == true) continue;
                notPrime[j*i] = true;
            }
        for (int i = 2; i <= n; i++)
            if (notPrime[i] == false)
                answer++;
        return answer;
    }
}

------------------------------------------------------
memo)
1.에라토스테네스의 체
간단히 말하면 배수를 제거하는 방법.
반복문을 풀어내면...
i가 2일때 j는 2로 2의 2,3,4,5,,,배수를 제거
i가 3일때도 마찬가지로 3의 2,3,4,5,,배수를 제거
...
이때 이미 제거한 배수를 건너뛴다.
이때 i는 무조건 소수이다.
i가 4가 되기전에 i가 2일때 걸러지고,
i가 9가 되기전에 i가 3일때 걸러지고,
i가 15가 되기전에 i가 5일때 걸리지는 과정등을 반복하기때문이다.
------------------------------------------------------
