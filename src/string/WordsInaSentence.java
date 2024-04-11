package string;

import java.util.Scanner;

public class WordsInaSentence {
    public String solution(String index){
        String answer = "";
        int min = Integer.MIN_VALUE;

        String[] s = index.split(" ");// 공백 기준으로 문자열 자르기
        for(String x : s){
            int length = x.length();
            if(length > min){//min 보다 x의 길이가 크디면
                min = length;//length 의 길이를 min에 대입한다
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int num = 0;
        while (num < 10){
            if(num == 5){
                break;
            }
            num++;
            System.out.println(num);
        }

        WordsInaSentence T = new WordsInaSentence();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));


    }
}
