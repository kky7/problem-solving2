package org.cote.inflearn.c3_sliding_window;
import java.util.*;

public class p05 {
    public static int solution(int n){
        int answer = 0;
        int t = n/2 + 1; // 예를 들어 n이 15인 경우 8 이상 부터는 무조건 15보다 큼 (8*2 가 이미 15보다 크므로...)
        int[] arr = new int[t];
        for(int i = 0; i < t; i++){
            arr[i] = i+1;
        }

        int lt = 0, sum = 0;
        for(int rt = 0; rt < t; rt++){
            sum += arr[rt];
            if(sum == n) answer++;

            while(sum >= n){ // sum이 n보다 클때만 rt가 증가, sum이 n보다 크면 계속 lt를 빼야한다.
                sum -= arr[lt++];
                if(sum == n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
