package org.cote.inflearn.c6_sort;

import java.util.Scanner;

public class p07_countingSort {
    public static void countingSort(int[] arr, int max){
        int[] counting = new int[max+1]; // 배열의 사이즈를 최대값이 담기도록 잡는다.

        for(int i = 0; i < arr.length; i++){
            counting[arr[i]]++;
        }

        for(int i = 1; i < max+1; i++){
            if(counting[i] != 0) {
                for(int j = 0; j < counting[i]; j++){
                    System.out.print(i+" ");
                }
            }
        }
    }

    public static void countingSort2(int[] arr, int max){
        int[] sorted_arr = new int[arr.length];
        int[] counting = new int[max+1]; // 배열의 사이즈를 최대값이 담기도록 잡는다.

        for(int i = 0; i < arr.length; i++){
            counting[arr[i]]++;
        }

        int t = 0;
        for(int i = 1; i < max+1; i++){
            if(counting[i] != 0) {
                for(int j = 0; j < counting[i]; j++){
                    sorted_arr[t++] = i;
                }
            }
        }

        for(int x: sorted_arr)
            System.out.print(x+" ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열 갯수
        int max = sc.nextInt(); // 배열의 최대 값
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        countingSort(arr, max);
    }
}
