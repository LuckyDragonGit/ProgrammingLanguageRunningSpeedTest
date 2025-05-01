#include <stdio.h>
#include <time.h>

int fibonacci(int n)
{
    switch (n)
    {
    case 0:
        return 0;
    case 1:
        return 1;
    default:
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

/*
More functions is being planning.
更多函数，敬请期待。
*/

int main()
{
    int n = 35;
    clock_t start, end;

    start = clock();
    printf("%d\n",fibonacci(n));
    end = clock();

    double timeTaken = ((double)(end - start)) / CLOCKS_PER_SEC;
    printf("Fibonacci Time Taken: %.3fs\n", timeTaken);
    return 0;
}