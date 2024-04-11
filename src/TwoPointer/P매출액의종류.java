package TwoPointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class P매출액의종류 {
    public static ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();//슬라이딩 윈도우한 매출액종류를 담는 리스트선언
        HashMap<Integer,Integer> HM = new HashMap<>();

        for (int i = 0; i < k-1; i++) {//k번 전까지 반복
            HM.put(arr[i],HM.getOrDefault(arr[i],0)+1);
        }
        int lt = 0;
        for (int rt = k-1; rt < n; rt++) {//슬라이딩 윈도우
            HM.put(arr[rt],HM.getOrDefault(arr[rt],0)+1);
            answer.add(HM.size());//map의 사이즈 list에 저장
            HM.put(arr[lt],HM.get(arr[lt])-1);//맵에 lt의 값에서 1을뺀 map을 저장
            if(HM.get(arr[lt]) == 0){
                HM.remove(arr[lt]);
            }
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n,k,arr)){
            System.out.print(x+" ");
        }
    }
}
