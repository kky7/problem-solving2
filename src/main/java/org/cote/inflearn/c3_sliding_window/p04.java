package org.cote.inflearn.c3_sliding_window;
import java.util.*;

public class p04 {
    public static int solution(int n , int m, int[] arr){
        int answer = 0;
        int lt = 0;
        int sum = 0;
        for(int rt = 0; rt < n; rt++){
            sum += arr[rt];
            if(sum == m) answer ++;

            while(sum >= m) {
                lt++;
                sum -= arr[lt];
                if(sum == m) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(solution(n,m,arr));
    }
}
