package string;

import java.util.Scanner;

public class MessageFind {

    public static void main(String[] args) {
        MessageFind mf = new MessageFind();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        Character c  = sc.next().charAt(0);
        System.out.println(mf.solution(str,c));
    }
     int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

         for (int i = 0; i < str.length(); i++) {
             if(str.charAt(i) == t){
                 answer++;
             }
         }
         return answer;
    }
}
