package org.cote.inflearn.c6_sort;

import java.util.Scanner;

public class p04_quickSort {
    public static void swap(int[] arr, int p1, int p2){
        int tmp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = tmp;
    }

    // 분할
    public static int partition(int[] arr, int start, int end){
        int key = start;
        int lt = start + 1;
        int rt = end;

        while(lt <= rt){ // 엇갈릴 때까지 반복
            while( lt <= end && arr[lt] <= arr[key] ){ // 키 값보다 큰 값을 만날 때 까지
                lt++;
            }

            while(arr[rt] >= arr[key] && rt > start){ // 키 값보다 작은 값을 만날 때 까지
                rt--;
            }

            if(lt > rt) { // 현재 엇갈린 상태이면 키 값과 교체
                swap(arr, rt, key);
            } else { // 엇갈리지 않았다면 lt와 rt의 값 교체
                swap(arr, lt, rt);
            }
        }

        return rt;
    }

    // 정복
    public static void solution(int[] arr, int start, int end){
        if(start >= end)
            return;

        int key = partition(arr, start, end);
        solution(arr, start, key -1);
        solution(arr, key + 1, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        solution(arr, 0, n-1);
        for(int x: arr)
            System.out.print(x+" ");
    }
}
