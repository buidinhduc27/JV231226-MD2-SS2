package example;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Điểm HTML: ");
        int point1 = Integer.parseInt(sc.nextLine());
        System.out.println("Điểm CSS: ");
        int point2 = Integer.parseInt(sc.nextLine());
        System.out.println("Điểm JS: ");
        int point3 = Integer.parseInt(sc.nextLine());
        int avgMark = (point1 + point2 + point3) / 3;
        if (avgMark >= 0 && avgMark < 5) {
            System.out.println("Yếu");
        } else if (avgMark >= 5 && avgMark < 7) {
            System.out.println("Trung bình");
        } else if (avgMark >= 7 && avgMark < 8) {
            System.out.println("Khá");
        } else if (avgMark >= 8 && avgMark < 9) {
            System.out.println("Giỏi");
        } else {
            System.out.println("Xuất sắc");
        }
    }
}