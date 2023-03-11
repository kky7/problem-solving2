package org.cote.inflearn.c5_queue;
import java.util.*;

public class p06 {
    public static int solution(int n, int k){
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            queue.offer(i);
        }

        int cnt = 0;
        while(queue.size() > 1){
            int tmp = queue.poll();
            cnt++;
            if(cnt == k){
                cnt = 0;
            }else{
                queue.offer(tmp);
            }
        }
        return queue.poll();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(n,k));
    }
}

