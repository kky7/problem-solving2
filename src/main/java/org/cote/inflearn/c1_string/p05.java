package org.cote.inflearn.c1_string;
import java.util.*;

public class p05 {
    public String solution(String s){
        char[] c = s.toCharArray();
        int lt = 0;
        int rt = s.length()-1;
        while(lt < rt){
            if(!Character.isAlphabetic(c[lt])) lt++;
            else if(!Character.isAlphabetic(c[rt])) rt--;
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++; rt--;
            }
        }
        return String.valueOf(c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(new p05().solution(s));
    }
}
