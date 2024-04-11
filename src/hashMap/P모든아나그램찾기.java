package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class P모든아나그램찾기 {
    public static int soloution(String a, String b){
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();// 아나그램 비교 대상
        HashMap<Character, Integer> bm = new HashMap<>();//기준이 되는 문자열
        int lt = 0;
        for(char x: b.toCharArray()){
            bm.put(x,bm.getOrDefault(x,0)+1);
        }
        int length = b.length()-1;
        for(int i=0; i<length; i++){
            am.put(a.charAt(i),am.getOrDefault(a.charAt(i),0)+1);
        }

        for(int rt=length; rt<a.length(); rt++){//슬라이딩 윈도우 시작
            am.put(a.charAt(rt),am.getOrDefault(a.charAt(rt),0)+1);
            if(am.equals(bm)){
                answer++;
            }
            am.put(a.charAt(lt),am.get(a.charAt(lt))-1);//슬라이딩 윈도우 하면서 lt값 빼주기
            if(am.get(a.charAt(lt)) == 0) {
                am.remove(a.charAt(lt));
            }
            lt++;
        }


        /*for (char x : b.toCharArray()){//b의 문자열 미리담기
            bm.put(x,bm.getOrDefault(x,0)+1);
        }
        int L = b.length() - 1;
        for (int i=0; i<L; i++){//am 맵 저장
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i),0)+1);
        }
        int lt = 0;
        for (int rt = L; rt < a.length(); rt++) {/
            am.put(a.charAt(rt),am.getOrDefault(a.charAt(rt),0)+1);
            if(am.equals(bm)) answer++; //am,bm 맵의 key,value 값이 같으면 정답 증가
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
            lt++;
        }*/
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.print(soloution(a,b));
    }
}
