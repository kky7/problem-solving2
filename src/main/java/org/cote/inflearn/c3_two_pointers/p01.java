package org.cote.inflearn.c3_two_pointers;
import java.util.*;

public class p01 {
    public static int[] solution(int n, int m, int[] a, int[] b){
        int[] answer = new int[n+m];
        int at = 0;
        int bt = 0;
        int i = 0;
        while(at < n && bt < m){
            if(a[at] < b[bt]){
                answer[i] = a[at];
                at++;
            } else {
                answer[i] = b[bt];
                bt++;
            }
            i++;
        }

        for(int k = at; k < n; k++){
            answer[i] = a[k];
            i++;
        }

        for(int k = bt; k < m; k++){
            answer[i] = b[k];
            i++;
        }
        return answer;
    }

    public static ArrayList<Integer> solution2(int n, int m, int[] arr1, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>(n+m);
        int p1 = 0, p2 = 0;
        while(p1 < n && p2 < m){
            if(arr1[p1] < arr2[p2]){
                answer.add(arr1[p1++]); // 배열에 p1값 집어 넣고 p1값 증가됨
            } else{
                answer.add(arr2[p2++]);
            }
        }

        for(int i = p1; i < n; i++){
            answer.add(arr1[i]);
        } // while(p1 < n) answer.add(arr1[p1++]);

        for(int i = p2; i < m; i++){
            answer.add(arr2[i]);
        } // while(p2 < m) answer.add(arr2[p2++]);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] =sc.nextInt();

        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; i++) b[i] = sc.nextInt();

        for(int x: solution(n, m, a, b))
            System.out.print(x + " ");
    }
}
