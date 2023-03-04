package org.cote.inflearn.c2_array;
import java.util.*;
public class p06 {
    public boolean isPrime(int x){
        if(x == 1) return false;
        for(int i = 2; i < x; i++){
            if(x % i == 0) return false;
        }
        return true;
    }
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int x: arr){
            int res = 0;
            while(x > 0){
                int tmp = x % 10;
                res = res * 10 + tmp;
                x /= 10;
            }
            if(isPrime(res) == true) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for(int x: new p06().solution(n, arr)) System.out.print(x+" ");
    }

}
