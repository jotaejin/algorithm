package string;

import java.util.Scanner;

public class Upeercase {
    public String solution(String str){
        String answer = "";
        for (char x: str.toCharArray()){
            if(x >=97 && x <=122){
                answer += (char)(x-32);
            }else {
                answer += (char)(x+32);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Upeercase upeercase = new Upeercase();
        Scanner sc = new Scanner(System.in);
        String aasAsssass = upeercase.solution(sc.next());
        System.out.println(aasAsssass);
    }
}
