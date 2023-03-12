package org.cote.inflearn.c6_sort;

import java.util.Scanner;

public class p03_insertSort {
    public static int[] solution(int n, int[] arr){
        for(int i = 1; i < n; i++){ // 삽입 대상 순회
            int tmp = arr[i]; // 삽입 대상
            int j;
            for(j = i-1; j >= 0; j--){// i번째 이전을 순회하면서 삽입 대상을 어디에 삽입할지 선택
                if(arr[j] > tmp)
                    arr[j+1] = arr[j];
                else break; // arr[j] < tmp 이면 j이전 인덱스의 값들이 tmp보다 작은 값이다.
            }
            arr[j+1] = tmp; // // j번째 에서 else에 의해 for문을 빠져 나왔으므로, j+1 이전은 tmp보다 작은 값이고, j 이후는 tmp보다 큰 값을 갖고 있다.
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
