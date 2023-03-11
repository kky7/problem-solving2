package org.cote.inflearn.c5_queue;
import java.util.*;

public class p07 {
    public static String solution(String nes, String p){
        Queue<Character> queue = new LinkedList<>();
        for(int i = 0; i < nes.length(); i++){
            queue.offer(nes.charAt(i));
        }

        for(char sub: p.toCharArray()){
            if(sub == queue.peek()) queue.poll();
            if(queue.isEmpty()) return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nes = sc.next();
        String p = sc.next();
        System.out.println(solution(nes, p));
    }
}
