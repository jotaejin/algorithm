package string;

import java.util.Scanner;

public class Palindrome {
    public static String solution(String s){
        String answer = "NO";
        s = s.replaceAll("[^A-Z]","");//A-Z가 아니면 빈문자로 치환
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equalsIgnoreCase(tmp)){//원래 문자열과 reverse 한 문자열이 같으면 yes반환
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}
