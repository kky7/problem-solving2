package org.cote.inflearn.c1_string;
import java.util.*;

public class p12 {
    public String solution(int n, String s){
        String answer = "";
        for(int i = 0; i < n; i++){
            String tmp = s.substring(0,7).replace('#','1').replace('*','0');
            answer += (char)Integer.parseInt(tmp, 2);
            s = s.substring(7);
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.print(new p12().solution(n, s));
    }
}
