package org.cote.inflearn.c2_array;
import java.util.*;
public class p03 {
    public char[] solution(int n, int[] a, int[] b){
        char[] result = new char[n];
        for(int i = 0; i < n; i++){
            if(a[i] == 1 && b[i] ==3) result[i] = 'A';
            else if (a[i] == 3 && b[i] ==1) result[i] = 'B';
            else if(a[i] < b[i]) result[i] = 'B';
            else if(a[i] > b[i]) result[i] = 'A';
            else if(a[i] == b[i]) result[i] = 'D';
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }

        for(char c: new p03().solution(n, a, b)){
            System.out.println(c);
        }
    }
}
