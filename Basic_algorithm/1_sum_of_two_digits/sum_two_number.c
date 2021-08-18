#include<stdio.h>
int sum_of_total_number(int first, int second){
    return first + second; //Do sum;
}

int main(){

    int a=0,b=0;
    printf(" Input a and b in digits: \'use space\' ");
    scanf("%d%d",&a,&b);
    printf(" Sum of total number \t %d\n",sum_of_total_number(a,b));
    return 0;
}
