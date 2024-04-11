package Sorting;

import java.util.Scanner;

/**
 * 버블정렬:
 * 제일 높은 숫자를 뒤로 보내는 정렬
 */
public class P버블정렬 {
    public static int[] solution(int n, int[] arr){
        for (int i = 0; i < n - 1; i++) {//턴의 횟수
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n,arr)){
            System.out.println(x+" ");
        }
    }
}
