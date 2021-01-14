#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

char* solution(const char* s) {
    char* answer;
    int str_len = strlen(s);
    
    answer = (char*)malloc(sizeof(char) * str_len);
    if (str_len % 2 == 0){
        answer[0] = s[str_len/2-1]; //1.문자열 동적할당
        answer[1] = s[str_len/2];
        answer[2] = '\0';
    }
    else{
        answer[0] = s[str_len/2];
        answer[1] = '\0';
    }
    
    return answer;
}

***************************************************************************
memo)
1.문자열 동적할당을 하면 동적할당한 양만큼 배열로 접근 가능!
+배열 각각에 문자열 대입가능
ex)
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main()
{
  char temp[80];
  char *str[3];
  int i;
  
  for(i=0; i<3; i++){
    printf("문자열을 입력하세요 : "); //hello, wolrd, clanguage라고 입력한다면
    gets(temp);
    str[i]=(char *)malloc(strlen(temp)+1); //동적할당한 배열'안'에 문자의 길이만큼 동적할당
    strcpy(str[i], temp);
    }
  for(i=0; i<3; i++){
    printf("%s₩n", str[i]);
  }
    //hello
    //wolrd
    //clanguage 출력됨
  for(i=0; i<3; i++){
    free(str[i]);
    }
  return 0;
 }
***************************************************************************
