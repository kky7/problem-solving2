package org.cote.inflearn.c4_hashMep;
import java.util.*;

public class p02 {
    public static String solution(String s1, String s2){
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char key: s1.toCharArray()){
            map.put(key, map.getOrDefault(key,0) + 1);
        }

        for(char x: s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x) == 0)
                return "NO";
            else
                map.put(x,map.get(x) -1);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(solution(s1,s2));
    }
}
