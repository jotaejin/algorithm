package Sorting;

import java.util.Scanner;

/**
 * 최솟값or최댓값을 찾고 남은 정렬부분의 맨 앞 데이터와 swap
 */
public class P선택정렬 {
    public static int[] solution(int n, int[] arr){
        for(int i=0; i<n-1; i++){
            int idx = i;
            for (int j = i+1; j < n; j++) {//최솟값 찾는 알고리즘
                if(arr[j]<arr[idx]){
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n,arr)){
            System.out.println(x+" ");
        }
    }
}
