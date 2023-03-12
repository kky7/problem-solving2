package org.cote.inflearn.c6_search;
import java.util.*;
public class p08_binarySearch {
    public static int binarySearch(int n, int m, int[] arr){
        Arrays.sort(arr);
        int start = 0;
        int end = n-1;
        int mid = 0;
        while(start <= end){
            mid = (start + end) / 2;
            if(arr[mid] == m) return mid + 1; // 코드는 0부터 시작 하므로
            else if (arr[mid] < m) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n개의 숫자 입력
        int m = sc.nextInt(); // m이 n개의 숫자 중 몇번째에 있는지 탐색

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(binarySearch(n,m,arr));
    }
}
