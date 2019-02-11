#include <stdio.h>
#include <time.h>

int fibonacci(int);



int main(void){

    clock_t t;

    t = clock();
    int n = fibonacci(40);
    t = clock() - t;
    double total_time = ((double)t)/CLOCKS_PER_SEC;

    printf("The %d number of fibonacci is %d\nIt took %f",40,n,total_time);
    return 0;
}

int fibonacci(int n){

    if(n <= 1){
        return n;
    }
    else{
        return fibonacci(n-1) + fibonacci(n-2);
    }
}