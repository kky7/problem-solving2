package org.cote.inflearn.c5_stack;
import java.util.*;

public class p03 {
    public static int solution(int n, int m, int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> st = new Stack<>();

        for(int move: moves){
            int j = 0;
            while(board[j][move-1] == 0 && j < n-1){
                j++;
            }

            int doll = board[j][move-1];

            if(!st.isEmpty() && st.peek() == doll){
                answer += 2;
                st.pop();
            } else {
                st.push(doll);
            }

            board[j][move-1] = 0;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j  = 0; j < n; j++){
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i = 0; i < m; i++){
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(n,m,board,moves));
    }
}
