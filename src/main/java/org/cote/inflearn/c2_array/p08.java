package org.cote.inflearn.c2_array;
import java.util.*;

public class p08 {
    public static int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            int score = 1;
            for(int j = 0; j < n; j++){
                if(arr[i] < arr[j]) score++;
            }
            answer[i] = score;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int x: solution(n, arr))
            System.out.print(x+" ");
    }
}
