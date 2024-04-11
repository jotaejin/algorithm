package stackQueue;


import java.util.Scanner;
import java.util.Stack;

/**
 * answer:바구니에서 같은인형2개를 터뜨린 횟수
 * pos:크레인의 위치(열)
 * board[i]:밑으로 내려가는것(행)
 * tmp:격자판의 인형을 뽑을 위치
 * stack:격자판에서 꺼낸 인형을 담는 바구니
 */
public class P크레인인형뽑기 {
    public static int solution(int[][] board, int[] moves){
        int answer = 0;//터뜨려진 인형의 개수
        Stack<Integer> stack = new Stack<>();

        for(int move: moves){
            for (int i = 0; i < board.length; i++) {
                if (board[i][move-1] != 0) {
                    int tmp = board[i][move - 1];
                    board[i][move - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }









        /*for (int move : moves){
            for (int i = 0; i < board.length; i++) {
                if(board[i][move-1] != 0){
                    int tmp = board[i][move-1];//인형의 숫자를 tmp에 저장
                    board[i][move-1] = 0;//뽑은 인형의 자리는 0으로 대체
                    if(!stack.isEmpty() && tmp==stack.peek()){
                        answer+=2;
                        stack.pop();
                    }else{
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }*/
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];//n*n 크기의 보드
        for (int i = 0; i < n; i++) {//보드의 크기
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();//크레인을 몇번 움직일건지
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(board,moves));
    }
}
