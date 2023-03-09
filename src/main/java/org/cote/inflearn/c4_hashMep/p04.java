package org.cote.inflearn.c4_hashMep;

import java.util.*;

public class p04 {

    public static int solution(String s, String t){
        int answer = 0;
        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int n = s.length();
        int k = t.length();
        for(int i = 0; i < k-1; i++){
            sMap.put(sArr[i], sMap.getOrDefault(sArr[i], 0) + 1);
        }

        for(int i = 0; i < k; i++){
            tMap.put(tArr[i], tMap.getOrDefault(tArr[i], 0) + 1);
        }

        int lt = 0;
        for(int rt = k-1; rt < n; rt++){
            // 윈도우 늘리기
            sMap.put(sArr[rt], sMap.getOrDefault(sArr[rt], 0) + 1);

            // 아나그램 판별
            if(sMap.equals(tMap)) answer++;

            // 윈도우 줄이기
            sMap.put(sArr[lt], sMap.get(sArr[lt])-1);
            if(sMap.get(sArr[lt])==0) sMap.remove(sArr[lt]);
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(solution(s, t));
    }
}
