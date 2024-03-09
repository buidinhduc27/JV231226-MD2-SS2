package example;

import java.util.Scanner;

public class BaiTap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Đầu tháng: ");
        int dau = Integer.parseInt(sc.nextLine());
        System.out.println("Cuối tháng: ");
        int cuoi = Integer.parseInt(sc.nextLine());
        int sodien = cuoi - dau;
        if(sodien>=0 && sodien<=50){
            System.out.println("Tiền điện của tháng là: "+(sodien*10000));
        } else if (sodien<=100) {
            System.out.println("Tiền điện của tháng là: "+(50*10000+(sodien-50)*15000));
        }else if (sodien<=150) {
            System.out.println("Tiền điện của tháng là: "+(50*10000+50*15000+(sodien-100)*20000));
        }else if (sodien<=200) {
            System.out.println("Tiền điện của tháng là: "+(50*10000+50*15000+50*20000+(sodien-150)*25000));
        }else {
            System.out.println("Tiền điện của tháng là: "+(50*10000+50*15000+50*20000+50*25000+(sodien-200)*30000));
        }


    }
}
