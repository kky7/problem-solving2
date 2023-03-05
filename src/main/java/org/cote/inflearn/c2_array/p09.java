package org.cote.inflearn.c2_array;
import java.util.*;

public class p09 {
    public static int solution(int n , int[][] arr){
        int answer = Integer.MIN_VALUE;
        for(int i  = 0; i < n; i++){
            int sumRow = 0; int sumCol = 0;
            for(int j = 0; j < n; j ++){
                sumRow += arr[i][j];
                sumCol += arr[j][i];
            }
            answer = Math.max(answer, sumRow);
            answer = Math.max(answer, sumCol);
        }

        int sumL = 0; int sumR = 0;
        for(int i = 0; i < n; i++){
            sumL += arr[i][i];
            sumR += arr[i][n-i-1];
        }
        answer = Math.max(answer, sumL);
        answer = Math.max(answer, sumR);
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
}
