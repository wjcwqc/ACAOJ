//
// Created by wjcwqc on 2019/12/11 0011.
//
#include <stdio.h>
#include <math.h>

int p[16] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103,
             107};

int judge(int n) {
    int i = 0, cnt;
    while (n != 1) {
        cnt = 0;
        while (n % p[i] == 0) {
            n /= p[i];
            cnt++;
        }
        if (cnt % 2)
            return 0;
        i++;
    }
    return 1;
}

int fun(int *p, int n, int m) {
    int s, c = 0;
    int b[100];
    int i, j, k, cnt;
    int min = 0, max = 0;
    for (i = 0; i < m; i++) {
        min += pow(2, i);
    }
    for (i = n - m; i < n; i++)
        for (j = 0; j < n; ++j) {
            b[j] = 0;
        }
    k = i;
    j = 0;
    cnt = 0;
    while (k) {
        b[j] = k % 2;
        k /= 2;
        if (b[j])
            cnt++;
        if (cnt > m)
            break;
        j++;
    }
    if (cnt == m) {
        s = 1;
        for (j = 0; j < n; j++) {
            if (b[j]) {
                s *= p[j];
            }
            if (judge(s)) {
                for (j = 0; j < n; j++) {
                    if (b[j]) {
                        printf("")
                    }
                    c++;
                }
            }
        }
    }
    return c;
}

int main() {
    int total = 0, i, t, m;
    int a[100];
    scanf("%d", &t);
    scanf("%d", &m);
    for (i = 0; i < m; i++) {
        scanf("%d", &a[i]);
    }
    for (i = 1; i <= m; i++) {
        total += fun(a, m, i);
    }
    printf("%d", total);
    return 0;
}

}
