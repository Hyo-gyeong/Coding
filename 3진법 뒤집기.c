#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#define MAX_STACK_SIZE 1000000

typedef struct{
    int data[MAX_STACK_SIZE];
    int top;
}Stack;

void init(Stack *s)
{
	s->top = -1;
}
void push(Stack *s, int value)
{
    s->data[++(s->top)] = value;
}
int pop(Stack *s)
{
    if (s->top == -1)
        return -1;
    else
        return s->data[(s->top)--];
}
int solution(int n) {
    
    Stack tmp;
    int answer = 0;
    int r, i;
    int ternary = 1;
    
    init(&tmp);
    while(n != 0){
        push(&tmp, n%3);
        n /= 3;
    }
    while(1){
        r = pop(&tmp);
        if (r == -1)
            break;
        answer += r * ternary;
        ternary *= 3;
   }
    return answer;
}

**************************************************************
memo)
자료구조때 배웠던 stack을 활용해봤다.
불과 한 달 전에 배웠던 내용이고 술술짰던 코드인데 잠깐 안쓰니까 검색하고있다....ㅡㅡ^^
배열에 넣어서 뒤집으려던 지난달보다는 발전한 것 같다.
*************************************************************


다른분 코딩 예시)
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int temp = 0;
    int cn = n;

    while (cn != 0)
    {
        int remain = cn % 3;
        temp *= 3;
        temp += remain;
        cn /= 3;

    }


    return temp;
}
*************************************************************
memo)
저세상 코딩,,,,
직관적으로 와닿지가 않아서 손으로 계산해봤는데 그 원리가 아직도 머리에 안들어온다...
*************************************************************
