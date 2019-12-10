def sumOfSeries(n): 
    sum = 0
    for i in range(1, n+1): 
        sum +=i*i*i 
          
    return sum
n = int(input())
i = 1
while(sumOfSeries(i) <= n):
    i = i+1
print(i-1)
