package org.cote.inflearn.c1_string;
import java.util.*;
public class p09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String answer = "";
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)) answer+=c;
        }
        System.out.println(Integer.parseInt(answer));
    }
}
