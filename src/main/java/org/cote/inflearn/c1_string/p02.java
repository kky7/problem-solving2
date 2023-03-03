package org.cote.inflearn.c1_string;
import java.util.*;

public class p02 {
    public String solution(String s){
        String answer = "";
        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c)) answer+=Character.toUpperCase(c);
            else answer+=Character.toLowerCase(c);
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(new p02().solution(s));
    }

}
