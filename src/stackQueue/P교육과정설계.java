package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P교육과정설계 {
    public static String solution(String need, String plan){
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();
        for (char x : need.toCharArray()){
            q.offer(x);//필수과목 세팅
        }
        for (char x : plan.toCharArray()){
            if(q.contains(x)){
                if(x!=q.poll()){
                    return "NO";
                }
            }
        }
        if(!q.isEmpty()){//plan 에 필수과목이 없을때 no
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String need = sc.next();
        String plan = sc.next();
        System.out.println(solution(need,plan));
    }
}
