package example;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        int so = Integer.parseInt(sc.nextLine());
        if (so % 2 == 0){
            System.out.println(so + " là số chẵn");
        }else {
            System.out.println(so+ " là số lẻ");
        }



    }
}
