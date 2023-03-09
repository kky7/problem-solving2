package org.cote.inflearn.c5_stack;
import java.util.*;

public class p01 {
    public static String solution(String s){
        String answer = "YES";
        Stack<Character> st = new Stack<>();
        for(char x: s.toCharArray()){
            if(x == '(') st.push(x);
            else {
                if(st.isEmpty()) return "NO";
                st.pop();
            }
        }
        if(st.size() != 0) return "NO";
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }
}
