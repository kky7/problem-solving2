package org.cote.inflearn.c6_sort;
import java.util.*;

/*
[선택 정렬]
해당 순서에 원소를 넣을 위치는 이미 정해져 있고, 어떤 원소를 넣을지 선택하는 알고리즘
배열에서 해당 자리를 선택하고 그 자리에 오는 값을 찾는 것
앞에서 부터 정렬이 이루어 진다.
최선, 평균, 최악 모두 O(n^2)
*/
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
        System.out.println(solution(n, arr));
    }
}
