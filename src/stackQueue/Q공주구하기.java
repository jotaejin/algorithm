package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q공주구하기 {
    public static int solution(int n, int k){
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {// 왕자 번호(1~n) 저장하기
            q.offer(i);
        }
        while (!q.isEmpty()){//Queue가 비어있을때까지 반복
            for (int i = 1; i < k; i++) {//1~k-1
                q.offer(q.poll());//꺼낸값을 리턴
            }q.poll();
            if(q.size() == 1) answer = q.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(n,k));
    }
}
