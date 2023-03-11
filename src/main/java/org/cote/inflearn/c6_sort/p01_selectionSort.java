package org.cote.inflearn.c6_sort;
import java.util.*;

public class p01_selectionSort {

    // 오름차순
    public static int[] solution(int n, int[] arr){
        for(int i = 0; i < n-1; i++){
            int idx = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    // 내림차순
    public static int[] solution2(int n, int[] arr){
        for(int i = 0; i < n-1; i++){
            int idx = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

    }
}
