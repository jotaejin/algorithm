package string;

import java.util.Scanner;

public class Password {
    public static String solution(int n, String s){
        String answer = "";

        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp,2);//2진수를 10진수화 시키기
            answer += (char)num;
            s = s.substring(7);//index가 7 이후인 문자들을 뽑아내기

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n,str));
    }
}
