package org.cote.inflearn.c2_array;
import java.util.*;

public class p07 {
    public static int solution(int n, int[] arr){
        int answer = 0;
        int score = 0;
        for(int x: arr){
            if(x == 1) {
                score += 1;
                answer += score;
            }
            else score = 0;
        }
        return answer;
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
