package org.cote.inflearn.c1_string;
import java.util.*;

public class p08 {
    public String solution(String s){
        s= s.toUpperCase().replaceAll("[^A-Z]","");
        String rs = new StringBuilder(s).reverse().toString();
        if(s.equals(rs)) return "YES";
        else return "NO";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(new p08().solution(s));
    }
}
