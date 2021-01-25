#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
bool solution(const char* s) {
    char *temp = s;
    int i = 0;
    if (strlen(s) == 4 || strlen(s) == 6){
        while(temp[i] != '\0'){
            if(temp[i] < '0' || temp[i] > '9')
                return false;
            i++;
        }
        return true;
    }else return false;
}
