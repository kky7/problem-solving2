package org.cote.inflearn.c6_sort;

import java.util.Scanner;

/*
[버블 정렬]
서로 인접한 두 원소의 대소를 비교하고, 조건에 맞지 않다면 자리를 교환하며 정렬하는 알고리즘
끝에서 부터 정렬이 이루어진다.
최선, 평균, 최악 모두 O(n^2)
*/
public class p02_bubbleSort {
    // 오름 차순
    public static int[] solution(int n, int[] arr){
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    // 내림 차순
    public static int[] solution2(int n, int[] arr){
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] < arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int x: solution(n, arr))
            System.out.print(x+" ");
    }
}
