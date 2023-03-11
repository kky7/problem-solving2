package org.cote.inflearn.c5_queue;
import java.util.*;

public class p08 {
    public class Person {
        private int id;
        private int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }

        public int getId() {
            return id;
        }

        public int getPriority() {
            return priority;
        }
    }

    public int solution(int n, int m, int[] arr){
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();

        for(int i = 0; i < n; i++){
            queue.offer(new Person(i,arr[i]));
        }

        while(!queue.isEmpty()){
            Person tmp = queue.poll();
            for(Person x: queue){ // tmp 자기보다 큰게 있는지 탐색
                if(tmp.getPriority() < x.getPriority()){ // 자기 보다 큰게 있을 경우
                    queue.offer(tmp); // 다시 집어 넣기
                    tmp = null; // 자기보다 큰게 있다.
                    break; // 더 이상 탐색할 필요 없음
                }
            }
            if(tmp != null) { // 자기보다 큰게 없다는 의미
                answer++;
                if(tmp.getId() == m) return answer;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(new p08().solution(n,m,arr));
    }
}
