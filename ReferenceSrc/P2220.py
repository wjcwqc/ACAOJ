temp = input()
year = int(temp)
if year/400 == int(year/400):
    print('leap year')
else:
    if (year/4 == int(year/4)) and (year/100 != int(year/100)):
        print('leap year')
    else:
        print('not leap year')
