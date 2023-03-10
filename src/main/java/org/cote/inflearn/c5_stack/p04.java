package org.cote.inflearn.c5_stack;
import java.util.*;

public class p04 {
    public static int solution(String s){
        int result = 0;
        Stack<Integer> st = new Stack<>();
        for(char x: s.toCharArray()){
            if(Character.isDigit(x)){
                int num = x - '0';
                st.push(num);
            } else {
                int right = st.pop();
                int left = st.pop();
                if(x == '+') result = left + right;
                else if(x == '*') result = left * right;
                else if(x == '-') result = left - right;
                else result = left / right;
                st.push(result);
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }
}
