import time
   
def fibonacci(n: int) -> int:
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
    n = 35
    start: float = time.time()
    print(fibonacci(n))
    end: float = time.time()
    print(f"Fibonacci Time Taken: {end - start:.3f}s.")

