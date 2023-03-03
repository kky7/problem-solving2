package org.cote.inflearn.c1_string;
import java.util.*;

public class p04 {
    public String solution(String s){
        int lt = 0;
        int rt = s.length()-1;
        char[] c = s.toCharArray();
        while(lt < rt){
            char tmp = c[lt];
            c[lt] = c[rt];
            c[rt] = tmp;
            lt++; rt--;
        }
        return String.valueOf(c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p04 T = new p04();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            System.out.println(T.solution(s));
        }
    }
}
