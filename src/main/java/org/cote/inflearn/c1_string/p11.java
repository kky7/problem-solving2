package org.cote.inflearn.c1_string;
import java.util.*;

public class p11 {
    public String solution(String s){
        String answer = "";
        s += " "; // **
        char[] c = s.toCharArray();
        int cnt = 1;
        for(int i = 0; i < s.length()-1; i++){ // **
            if(c[i] == c[i+1]) cnt++;
            else{
                answer += c[i];
                if(cnt > 1) answer += cnt; // **
                cnt = 1;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(new p11().solution(s));
    }
}
