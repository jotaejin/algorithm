package string;

import java.util.Scanner;

//중복 문자 제거
public class WorldsRemove {
    public static String solution(String str){
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            //indexOf = 최초로 등장한 문자의 인덱스 번호를 반환
            if(str.indexOf(str.charAt(i)) == i){
                answer += str.charAt(i);
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
