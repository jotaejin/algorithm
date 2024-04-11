package string;

import java.util.Scanner;

public class OnlyNumber {
    public static int solution(String s){
        String answer = "";
        for(char x: s.toCharArray()){
            /*if(x>=48 && x<=57){
                answer = answer * 10 + (x-48);//10진수화
            }*/
            if(Character.isDigit(x)){//참이면 숫자
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
