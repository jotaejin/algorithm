package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class P올바른괄호 {
    public static String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if(x == '(') {
                stack.push(x);
            }else{//처음 나온것, 닫는 괄호가 더 많다면  NO
                if(stack.isEmpty()) {
                    return "NO";
                }else {//스택이 안비어있고 닫는괄호가 나온다면 pop
                    stack.pop();
                }
            }
        }
            if(!stack.isEmpty()) {
                return "NO";
            }
                return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}
