package TwoPointer;

import java.util.Scanner;


public class P최대길이연속부분수열 {
    public static int solution(int n, int k, int[] arr){
        int answer = 0, cnt=0, lt=0;

        for(int rt=0; rt<n; rt++){
            if(arr[rt] == 0){
                cnt++;
                while (cnt > k){
                    if(arr[lt] == 0){
                        cnt --;
                    }
                    lt++;
                }
            }
            answer = Math.max(answer,rt-lt+1);
        }


        /*for (int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0){
                cnt++;// rt가 0을 1로 바꾼 횟수
                while (cnt>k){
                    if(arr[lt] == 0) { //lt가 0이라면 rt가0을 1로 바꾼지점이라서 되돌려주어야한다
                        cnt--;
                    }
                        lt++;
                }
            }
            answer=Math.max(answer,rt-lt+1);
        }*/

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

        System.out.println(solution(n,k,arr));
    }
}
