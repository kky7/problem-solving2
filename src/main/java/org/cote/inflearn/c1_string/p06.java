package org.cote.inflearn.c1_string;

import java.util.Scanner;

public class p06 {
    public String solution(String s){
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i)) == i) answer+=s.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(new p06().solution(s));
    }
}
