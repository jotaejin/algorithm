package TreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * set: 중복제거
 * TreeSet: 자동 정렬 가능
 */
public class K번째큰수 {
    public static int solution(int[] arr, int n, int k){
        int answer = -1;
        TreeSet<Integer> Test = new TreeSet<>(Collections.reverseOrder());//내림차순 정렬

        //카드 3장을 뽑는 경우의 수
        for (int i = 0; i < n-2 ; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int l = j+1; l < n; l++) {
                    Test.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        // Test.first(); 내림차순 이라면 tree의 최댓값출력 오름차순이면 최솟값출력
        int cnt = 0;//k번째로 큰 수 찾을때 사용되는 변수
        for(int x : Test){//arr배열들을 돌면서 3번째로 큰 숫자를 출력
            cnt++;
            if(cnt == k){//cnt가 k번째일때 x 출력
                return x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr,n,k));
    }
}
