package TwoPointer;

import java.util.Scanner;

/**
 * rt가 0부터 m까지 반복하면서
 * sum에 arr[rt]를 누적해서 더해준다
 * 조건문에서 sum이 n과 같다면 answer++
 * 만약 sum이 n보다 크다면 n보다 작아질때까지 sum-=arr[lt]를 해주어서 sum값을 줄여주고
 * sum이 n과 같다면 answer++
 */
public class P연속된자연수의합 {
    public static int solution(int n){
        int answer = 0, sum = 0, lt=0;
        int m=n/2+1;//연속된 자연수가 몇가지 필요한지(n=15라면 7+8이 최고로 높은 숫자이므로 여기까지를 기준으로한다)
        int[] arr = new int[m];

        for(int i=0; i<m; i++){
            arr[i] = i+1;
        }
        for(int rt=0; rt<m; rt++){
            sum+=arr[rt];
            if(sum == n){
                answer++;
            }
            while (sum >= n){
                sum -= arr[lt++];
                if(sum == n) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
