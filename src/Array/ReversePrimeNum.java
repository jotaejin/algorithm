package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrimeNum {
    public static boolean isPrime(int num) {//소수가 참인지 거짓인지
        if (num == 1) return false;
            for(int i = 2; i < num; i++) {
                if (num % i == 0)//num을 i로나눈 나머지가 0이라면 소수가 아니므로 false를 출력
                    return false;
            }
        return true;
    }
    public static ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();//소수인 숫자만 담는다

        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int result = 0;
            while (tmp > 0){//숫자 뒤집기
                int t = tmp % 10;
                result = result * 10 + t;
                tmp = tmp/10;
            }
            if(isPrime(result)){//뒤집어 진게 소수인지 판별
                answer.add(result);
            }
        }
        return answer;//뒤집어진 소수를 출력
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int x : solution(n,arr)){
            System.out.print(x + " ");
        }
    }
}
