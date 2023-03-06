package org.cote.inflearn.c2_array;
import java.util.*;
public class p12 {
    public static int solution(int n, int m, int[][] arr){
        int answer = 0;
        int[][] rankArr = new int[m+1][n+1];
        for(int i = 1; i <=m; i++){
            for(int j = 1; j <=n; j++){
                int num = arr[i][j];
                rankArr[i][num] = j;
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int cnt = 0;
                for(int k = 1; k <= m; k++){
                    if(rankArr[k][i] >= rankArr[k][j]){
                        break;
                    }
                    cnt++;
                }
                if(cnt == m) answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, m, arr));
    }
}
