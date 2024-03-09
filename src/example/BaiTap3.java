package example;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("a = ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.printf("b = ");
        int num2 = Integer.parseInt(sc.nextLine());
        int sum = num1 + num2;
        System.out.println("a + b = "+sum);
    }
}
