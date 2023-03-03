package org.cote.inflearn.c2_array;
import java.util.*;

public class p04 {
    public int[] solution(int n){
        int[] fibo = new int[n];
        fibo[0] = 1;
        fibo[1] = 1;
        for(int i = 2; i < n; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x: new p04().solution(n)){
            System.out.print(x+" ");
        }
    }
}
