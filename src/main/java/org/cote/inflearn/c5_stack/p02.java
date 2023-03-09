package org.cote.inflearn.c5_stack;
import java.util.*;

public class p02 {
    public static String solution(String s){
        String answer = "";
        Stack<Character> st = new Stack<>();
        for(char x: s.toCharArray()){
            if(x!=')'){
                st.push(x);
            }else{
                while(st.peek() != '('){
                    st.pop();
                }
                st.pop();
            }
        }

        for(char x: st){
            answer+=x;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }
}
