package string;

import java.util.Scanner;

public class WorldsRepeat {
    public static String solution(String str){
        String answer = "";
        str=str+" ";
        System.out.println(str);
        int cnt = 1;//연속되는 문자의 개수 ex)AAABB A=3,B=2

        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;
            }else{
                answer += str.charAt(i);
                answer += String.valueOf(cnt);//cnt를 String으로 변환
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
