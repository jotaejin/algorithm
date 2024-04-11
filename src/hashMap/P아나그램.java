package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class P아나그램 {
    public static String solution(String s1, String s2){
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s1.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char x : s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x) == 0){//map에 key가 존재하지않거나 s2의 알파벳 개수가 더 많으면 NO출력
                return "NO";
            }
            map.put(x,map.get(x)-1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.print(solution(a,b));
    }
}
