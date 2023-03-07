package org.cote.inflearn.c3_sliding_window;
import java.util.*;
public class p03 {
    public static int solution(int n, int k, int[] arr){
        int answer = Integer.MIN_VALUE;
        int preSum = 0;
        for(int i = 0; i < k; i++){
            preSum += arr[i];
        }
        answer = preSum;

        for(int i = 1; i < n-k; i++){
            preSum = preSum - arr[i-1] + arr[i+k-1];
            answer = Math.max(answer,preSum);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(solution(n,k,arr));
    }
}
