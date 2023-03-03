package org.cote.inflearn.c1_string;
import java.util.*;

public class p10 {

    public int[] solution(String s, char c){
        int len = s.length();
        int[] answer = new int[len];

        // 왼 -> 오
        int p = 0;
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == c) p =0;
            else p+=1;
            answer[i] = p;
        }

        // 오 -> 왼
        p =0;
        for(int i = len-1; i >= 0; i--){
            if(s.charAt(i) == c) p =0;
            else p+=1;
            if(answer[i] > p) answer[i] = p;
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        for(int x: new p10().solution(s, c)){
            System.out.print(x+" ");
        }
    }
}
