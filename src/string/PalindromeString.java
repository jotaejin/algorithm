package string;

import java.util.Scanner;

public class PalindromeString {
    public static String solution(String str){
        String answer = "YES";
        str = str.toUpperCase();
        int length = str.length();
        for (int i = 0; i < length /2; i++) {
            if(str.charAt(i) != str.charAt(length-i-1)){
                return "NO";
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kb = sc.next();
        System.out.println(solution(kb));
    }
}
