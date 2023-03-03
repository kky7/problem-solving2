package org.cote.inflearn.c1_string;

import java.util.Scanner;

public class p07 {
    public String solution(String s){
        int lt = 0;
        int rt = s.length()-1;
        char[] c = s.toCharArray();
        while(lt < rt){
            if(Character.toUpperCase(c[lt])!=Character.toUpperCase(c[rt]))
                return "NO";
            lt++; rt--;
        }
        return "YES";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(new p07().solution(s));
    }
}
