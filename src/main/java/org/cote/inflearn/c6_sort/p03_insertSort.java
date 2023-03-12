package org.cote.inflearn.c6_sort;

import java.util.Scanner;

/*
[삽입 정렬]
2번째 원소부터 시작하여 그 앞(왼쪽)의 원소들과 비교하여 삽입할 위치를 지정한 후,
원소를 뒤로 옮기고 지정된 자리에 자료를 삽입 하여 정렬하는 알고리즘
최선의 경우는 O(n), 평균과 최악의 경우 O(n^2)
*/

public class p03_insertSort {

    // 오름차순
    public static int[] solution(int n, int[] arr){
        for(int i = 1; i < n; i++){ // 삽입 대상 순회
            int tmp = arr[i]; // 삽입 대상
            int j;
            for(j = i-1; j >= 0; j--){// i번째 이전을 순회하면서 삽입 대상을 어디에 삽입할지 선택
                if(arr[j] > tmp)
                    arr[j+1] = arr[j];
                else break; // arr[j] < tmp 이면 j이전 인덱스의 값들이 tmp보다 작은 값이다.
            }
            arr[j+1] = tmp; // j번째 에서 else에 의해 for문을 빠져 나왔으므로, j+1 이전은 tmp보다 작은 값이고, j 이후는 tmp보다 큰 값을 갖고 있다.
        }
        return arr;
    }

    // 내림차순
    public static int[] solution2(int n, int[] arr){
        for(int i = 1; i < n; i++){ // 삽입 대상 순회
            int tmp = arr[i]; // 삽입 대상
            int j;
            for(j = i-1; j >= 0; j--) {
                if(arr[j] < tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] answer = solution(n, arr);
        for(int x: answer) System.out.print(x+" ");
    }
}
