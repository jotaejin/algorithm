package Array;

import java.util.Scanner;

//NlogN
public class PrimeNum {
    public static int solution(int n){
        int answer = 0;
        int[] ch = new int[n+1];
        for (int i = 2; i <= n; i++) {
            if(ch[i] == 0) {
                answer++;//2,3,5,7,11,13,17,19
            }
                for(int j=i; j<=n; j=j+i){
                    ch[j] = 1;//소수가 아니 라면 1추가
                }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution(num));

    }
}
