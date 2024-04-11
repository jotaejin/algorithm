package string;

import java.util.Scanner;

public class CharacterDistance {

    public static int[] solution(String s, char t){
        int[] answer = new int[s.length()]; //거리 배열
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t){
                p=0;
                answer[i]=p;
            }else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == t){
                p=0;
            }else {
                p++;
                answer[i] = Math.min(answer[i],p);//기존값과 p중에서 작은값을 넣는다
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char t = sc.next().charAt(0);

        for(int x : solution(str,t)){
            System.out.print(x+" ");
        }

    }
}
