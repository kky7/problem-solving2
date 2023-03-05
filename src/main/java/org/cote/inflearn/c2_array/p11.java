package org.cote.inflearn.c2_array;
import java.util.*;

public class p11 {
    public static int solution(int n, int[][] arr){
        int answer = 0;
        int max = 0;
        for(int i = 1; i <= n; i ++) {// 한 학생에 대하여
            int cnt = 0; // 모든 학년 중 같은 반이었던 학생 수
            for(int j = 1; j <= n; j++) { // 모든 학생을 비교
                for(int k = 1; k <= 5; k++) { // 모든 학년 비교
                    if(arr[i][k] == arr[j][k]){
                        cnt++; // 같은 반이었던 학생 수 추가, 모든 학생이 자기 자신도 추가 하므로 상관없음
                        break; // 같은 학년이 있으면 그 학생에 대해 추가했으니 학년 비교에서 빠져 나와야 함 -> 다음 학생 비교
                    }
                }
            }
            if(cnt > max){
                answer = i;
                max = cnt;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i = 1; i <= n; i++){ // 학생
            for(int j = 0; j <= 5; j++){ // 학년
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
