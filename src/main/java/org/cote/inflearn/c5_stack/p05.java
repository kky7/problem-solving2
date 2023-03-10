package org.cote.inflearn.c5_stack;
import java.util.*;

public class p05 {
    public static int solution(String s){
        int answer = 0;
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') st.push('(');
            else if(s.charAt(i) == ')'){
                if(i > 0 && s.charAt(i-1) == '('){
                    st.pop();
                    answer += st.size();
                } else if( i > 0 && s.charAt(i-1) == ')'){
                    st.pop();
                    answer += 1;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }
}
