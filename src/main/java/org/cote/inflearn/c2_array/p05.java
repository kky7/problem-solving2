package org.cote.inflearn.c2_array;
import java.util.*;
public class p05 {
    public static int solution(int n){
        int answer = 0;
        int[] chk = new int[n+1];
        for(int i = 2; i <= n; i++){
            if(chk[i] == 0) answer++;
            for(int j = i; j <= n; j=j+i){
                chk[j] = 1;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(solution(n));
    }
}
