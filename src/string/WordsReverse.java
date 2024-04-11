package string;

import java.util.ArrayList;
import java.util.Scanner;

public class WordsReverse {
    private static ArrayList<String> solution(String[] str){
        ArrayList<String> answer = new ArrayList<>();//자리 바꾼 단어들을 담는 리스트 생성
        for(String x : str){
            char[] s = x.toCharArray();//x를 char로 변환 ex)str =abcd -> s={a,b,c,d}
            int lt = 0;
            int rt = x.length()-1;
            while (lt<rt){//자리 변경
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);//s 를 String 으로 변경
            answer.add(tmp);//자리바꾼 str을 리스트에 저장
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String x : solution(str)){
            System.out.println(x);
        }
    }
}
