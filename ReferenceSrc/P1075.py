num = int(input())
s = []
for i in range(num):
    s.append(int(input()))
a = max(s, key=s.count)
print(a)
print(s.count(a))
