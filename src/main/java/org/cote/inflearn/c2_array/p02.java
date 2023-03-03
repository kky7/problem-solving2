package org.cote.inflearn.c2_array;
import java.util.*;

public class p02 {
    public int solution(int n, int[] arr){
        int max = Integer.MIN_VALUE;
        int answer = 0;
        for(int x: arr){
            if(x > max) { max = x; answer+=1;}
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(new p02().solution(n, arr));
    }
}
