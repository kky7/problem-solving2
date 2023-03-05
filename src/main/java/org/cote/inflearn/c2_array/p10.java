package org.cote.inflearn.c2_array;
import java.util.*;

public class p10 {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static int solution(int n, int[][] arr){
        int answer = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(arr[i][j] > arr[i+dx[0]][j+dy[0]] && arr[i][j] > arr[i+dx[1]][j+dy[1]] && arr[i][j] > arr[i+dx[2]][j+dy[2]] && arr[i][j] > arr[i+dx[3]][j+dy[3]])
                    answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
}
