<style>
</style>

# Python

```python
import time

def fibonacci(n:int) -> int:
    match n:
        case 0:
            return 0
        case 1:
            return 1
        case _:
            return fibonacci(n-1) + fibonacci(n-2)

'''
More functions is being planning.
更多函数，敬请期待。
'''

if __name__ == '__main__':
    start:float = time.time()
    fibonacci(35)
    end:float = time.time()
    print(f"Fibonacci Time Taken: {end - start:.3f}s.")
```

# C

```c
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
    fibonacci(n);
    end = clock();

    double timeTaken = ((double)(end - start)) / CLOCKS_PER_SEC;
    printf("Fibonacci Time Taken: %.3fs\n", timeTaken);
    return 0;
}
```

# C++

```cpp
#include <iostream>
#include <ctime>
using namespace std;

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
    time_t start, end;

    start = clock();
    fibonacci(n);
    end = clock();

    double timeTaken = ((double)(end - start)) / CLOCKS_PER_SEC;
    cout << "Fibonacci Time Taken:" << timeTaken << "s\n";
    return 0;
}
```

# Java

```java
import java.time.Instant;

public class Java {

    public static int fibonacci(int n) {
        switch (n) {
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

    public static void main(String[] args) {
        int n = 35;
        Instant start = Instant.now();
        System.out.printf("%d\n", fibonacci(n));
        Instant end = Instant.now();

        double timeTaken = (double) (end.toEpochMilli() - start.toEpochMilli()) / 1000;
        System.out.printf("Fibonacci Time Taken: %.3fs\n", timeTaken);
    }
}
```

# JavaScript

```javascript
function fibonacci(n) {
    switch (n) {
        case 0:
            return 0;
        case 1:
            return 1;
        default:
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

function main() {
    var n = 35;
    var start = new Date().getTime();
    console.log(fibonacci(n));
    var end = new Date().getTime();
    console.log("Fibonacci Time Taken: " + (end - start) / 1000 + "s.");
}

main();
```

# **_Test Result_**:

## _Fibonacci(**35**)_

| Language | First Time Taken | Second Time Taken | Third Time Taken | Average Time Taken |
| -------- | ---------------- | ----------------- | ---------------- | ------------------ |
| Python   | 3.458s           | 4.296s            | 4.063s           | 3.939s             |
| C        | 0.166s           | 0.189s            | 0.183s           | 0.179s             |
| C++      | 0.167s           | 0.181s            | 0.166s           | 0.171s             |
| Java     | 0.559s           | 0.198s            | 0.152s           | 0.303s             |
| JS       | 0.285s           | 0.362s            | 0.308s           | 0.318s             |

> This is the result of the test, but there was a funny fact that sometimes Java was the fastest but sometimes the second slowest. I know! Java is the god of change! 🤓
