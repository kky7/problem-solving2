package org.cote.inflearn.c1_string;
import java.util.*;
public class p01 {
    public int solution(String s, char c){
        int answer = 0;
        for(char x: s.toCharArray()){
            if(Character.toUpperCase(x) == Character.toUpperCase(c)) answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        System.out.print(new p01().solution(s, c));
    }
}
