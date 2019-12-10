time = int(input())
for i in range(time):
    AH,AM,AS,BH,BM,BS = map(int, input().strip().split())
    hour_C, min_C,second_C = AH + BH,AM + BM,AS +BS
    if(second_C >= 60):
        min_C += 1
        second_C -= 60
    if(min_C >= 60):
        hour_C += 1
        min_C -= 60
    print(str(hour_C)+" "+str(min_C)+" "+str(second_C) )
