package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{

    public int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x==o.x) {
            return this.y - o.y;//오름차순이면 빼기를 해주어야한다(음수가 리턴되도록)
        }else return this.x - o.x;
    }
}
public class P좌표정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//좌표 받기
        ArrayList<Point> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Point(x,y));
        }
        Collections.sort(list);
        for (Point point : list) {
            System.out.println(point.x+" "+ point.y);
        }
    }
}
