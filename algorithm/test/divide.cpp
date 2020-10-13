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
    int a[] = {12,2,16,30,8,28,4,10,20,6};
    int max, min;
    FindMaxAndMin(a, 0, 10, &max, &min);
    cout<<"the max num is:"<<max<<",  the min num is:"<<min<<endl;
    return 0;
}


/* 分治法计算最大值和最小值的算法程序，递归实现 */
//void maxmin2(int d[], int left, int right, int *max, int *min)
//{
//    int max1, min1;
//
//    if(left==right) {
//        *max = d[left];
//        *min = d[left];
//    } else if(left == right-1) {
//        if(d[left] > d[right]){
//            *max = d[left];
//            *min = d[right];
//        } else {
//            *max = d[right];
//            *min = d[left];
//        }
//    } else {
//        int mid = (left + right) / 2;
//        maxmin2(d, left, mid, max, min);
//        maxmin2(d, mid+1, right, &max1, &min1);
//        if(*max < max1)
//            *max = max1;
//        if(*min > min1)
//            *min = min1;
//    }
//}
//int main()
//{
//    int a[] = {12,2,16,30,8,28,4,10,20,6};
//    int max, min;
//    maxmin2(a, 0, 10, &max, &min);
//    cout<<"the max num is:"<<max<<",  the min num is:"<<min<<endl;
//    return 0;
//}


//
//void binaryFindMinMax (const int *arr, int left, int right, int *min, int *max)
//{
//    if ((right - left) == 1) {
//        *max = arr[left];
//        *min = arr[right];
//        if (arr[left] < arr[right]) {
//            *max = arr[right];
//            *min = arr[left];
//        }
//    }else if ((right - left) == 0) {
//        *max = *min = arr[left];
//    }else {
//        int     min1, min2, max1, max2;
//
//        binaryFindMinMax (arr, left, (right - left)/2 + left, &min1, &max1);
//        binaryFindMinMax (arr, (right - left)/2+1 + left, right, &min2, &max2);
//        min1 > min2 ? (*min = min2) : (*min = min1);
//        max1 > max2 ? (*max = max1) : (*max = max2);
//    }
//}
//
//int main (void)
//{
////    int     arr[20];    // at the most 20 number for convenience.
//    int     min, max, i;
//
//
////    for (i = 0; scanf ("%d", &arr[i]); i++);
//    int a[] = {12,2,16,30,8,28,4,10,20,6};
//
//
//    binaryFindMinMax (a, 0, i-1, &min, &max);
//    cout<<"the max num is:"<<max<<",  the min num is:"<<min<<endl;
//
//    return EXIT_SUCCESS;
//}