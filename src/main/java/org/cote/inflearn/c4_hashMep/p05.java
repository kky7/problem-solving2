package org.cote.inflearn.c4_hashMep;
import java.util.*;
public class p05 {
    public static int solution(int n, int k, int[] arr){
        int answer = -1;
        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder()); // 내림차순 정렬

        // 3중 for문 이용해서 TreeSet에 정렬하면서 모든 경우의 수 집어 넣기
        // arr에서 3개를 뽑는 모든 경우의 수
        for(int i = 0; i < n; i ++){ // i < n-2
            for(int j = i+1; j < n; j++){ // j < n-1
                for(int t = j+1; t < n; t++){
                    ts.add(arr[i] + arr[j] + arr[t]);
                }
            }
        }

        // if(ts.size() < k) return -1;
        int cnt = 0;
        for(int x: ts){
            cnt++;
            if(cnt == k){
                return x;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print(solution(n, k, arr));
    }
}
