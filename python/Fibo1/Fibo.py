from timeit import default_timer as timer
def fib(n):
    a, b = 1, 1
    key = n-1 if n > 0 else 0
    i = 0
    t0 = timer()
    for i in range(i, key):
	    a, b = b, a+b 
    t1 = timer()  
    print(a, (t1-t0), "s")	

fib(10 ** 7)	



