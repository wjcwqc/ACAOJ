for year in range(1900,2001):
    if year/400 == int(year/400):
        print(year)
    else:
        if (year/4 == int(year/4)) and (year/100 != int(year/100)):
            print(year)
