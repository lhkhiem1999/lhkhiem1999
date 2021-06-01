import math
n = int(input())
def primeSum(n):
    lst=[]
    for i in range(n+1):
        lst.append(1)
    print(lst)
    a = 2
    while a*a <= n:
    	print(a)
    	p = a*a
    	while p <= n:
    		lst[p] = 0
    		p+=a
    	a+=1
    	while (a<=n and lst[a]):a+=1
    	if a>n: break
    print(lst)
    s = 0
    for i in range(2,n+1):
        if lst[i] == 1:
            print(i)
            s+=i
    print(s)
    

primeSum(n)
                

    