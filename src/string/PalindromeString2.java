package string;

import java.util.Scanner;

public class PalindromeString2 {
    public static String solution(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)){
            answer = "YES";
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kb = sc.next();
        System.out.println(solution(kb));
    }
}
