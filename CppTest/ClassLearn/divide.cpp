//
// Created by ckg on 20-10-4.
//

#include "divide.h"
#include <iostream>
using namespace std;

void FindMaxAndMin(int a[], int begin, int end, int* pmax, int* pmin)
{
    if(end-begin <=1)
    {
        if(a[begin] <= a[end])
        {
            *pmax = a[end];
            *pmin = a[begin];
            return;
        }
        else
        {
            *pmin = a[end];
            *pmax = a[begin];
            return;
        }
    }

    int min1, min2, max1, max2;
    int mid = (begin+end)/2;
    FindMaxAndMin(a, begin, mid, &max1, &min1);
    FindMaxAndMin(a, mid+1, end, &max2, &min2);
    *pmin = min1 < min2 ? min1 : min2;
    *pmax = max1 < max2 ? max2 : max1;
}

int main()
{
    int a[] = {1,2,3,4,5,9,41,8,12,20,98};
    int max, min;
    FindMaxAndMin(a, 0, 10, &max, &min);
    cout<<"the max num is:"<<max<<",  the min num is:"<<min<<endl;
    return 0;
}