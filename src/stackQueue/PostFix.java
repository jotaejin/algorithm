package stackQueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * isDigit:숫자인지 확인하는 메서드
 */
public class PostFix {
    public static int solution(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()){
            if(Character.isDigit(x)){//숫자라면 삽입
                stack.push(x-48);//아스키코드
            }else{//연산자라면 숫자 꺼내기
                int rt = stack.pop();
                int lt = stack.pop();
                if(x=='+') stack.push(lt+rt);
                else if(x=='-') stack.push(lt-rt);
                else if(x=='*') stack.push(lt*rt);
                else if(x=='/') stack.push(lt/rt);
            }
        }
        answer=stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
