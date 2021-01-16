#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

long long solution(int a, int b) {
    int tmp_a;
    if (a > b){
        tmp_a = a;
        a = b;
        b = tmp_a;
    }
    long long answer = 0;
    int value = a;
    while(value <= b)
        answer += value++;
    return answer;
}
