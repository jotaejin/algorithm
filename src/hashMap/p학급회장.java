package hashMap;

import java.util.HashMap;
import java.util.Scanner;

//a,b,c,d 중에 투표를 가장 많이받은 알파벳을 출력
public class p학급회장 {

    public static char solution(int n, String s){
        char answer =' ' ;
        HashMap<Character,Integer> map = new HashMap<>();

        for (char x : s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max = Integer.MIN_VALUE;

        for(char key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);//key의 value를 max에 담기
                answer = key;//결과값에 key값을 대입
            }
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
