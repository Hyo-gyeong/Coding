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
*************************************************************


다른 코딩 예시1)
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

다른 코딩 예시2)
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int s,r,c,buf[30];    
    int answer = 0;

    for(c=0;n;n/=3)buf[c++]=n%3; //n이 영일때까지 3으로 나눈 나머지 쭉 넣고
    for(r=1,s=0;c--;r*=3)s+=buf[c]*r; //앞에서부터 하나씩 빼서(따로 뒤집을 필요없이) 1,3,9...쭉 곱해주면 끝!

    answer = s; //이건뭐 굳이
    return answer;
}

*************************************************************
memo)
내가쓴 stack이 오히려 복잡해보인다.
그냥 배열을 사용해도 간단한 풀이가 가능하다.
30자리가 넘으면 문제가 될 수는 있겠다. 근데 그건 나의 코드도 마찬가지니까. 문제의 조건덕에 괜찮겠다.
*************************************************************
