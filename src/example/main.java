package example;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double BUS_TICKET = 7000;
        //B1 nhập tuổi khách lên xe
        System.out.println("Hãy nhập tuổi của bạn: ");
        int age = Integer.parseInt(sc.nextLine());
        if(age<6||age>60){
            System.out.println("Bạn được miến phí vé xe");
        } else if (age<=18) {
            System.out.printf("Giá vé của bạn là: %.0f đồng. \n", (7000*0.5));
        }else{
            System.out.println("Giá vé của bạn là 7000 đồng");
        }

        //switch case
        //bài toán từ điển Anh-Việt
        //yêu cầu nhập từ tiếng Anh cần dịch sang tiếng việt
//        System.out.println("Hãy nhập vào từ tiếng anh");
//        String word = sc.nextLine();
//        switch (word){
//            case "cat":
//                System.out.println("Con mèo");
//                break;
//            case "dog":
//                System.out.println("Con chó");
//                break;
//            default:
//                System.err.println("Không tìm thấy kết quả phù hợp");
//        }

        //Vòng lặp
        //Vòng lặp for
        //Hãy in ra 10 số tự nhiên đầu tiên
//        for(int i = 10; i>0; i-- ){
//            //in ra giá trị của biến i
//            System.out.println("i = "+i);
//        }
//
//        for(int i=0; i<10; i++){//vòng lặp in các hàng
//            for(int j=0; j<20; j++){//vòng lặp in các cột
//                System.out.print(" * ");
//            }
//            System.out.println();//in xong 1 hàng thì xuống dòng
//        }

        //Vòng lặp while và do...while
        //Lặp vô hạn
//        while (true){
//        }
//        System.out.println("khối lệnh bên dưới lặp vô hạn");
        //yêu cầu: hãy nhập 1 số đến khi nhập vào số 0;
        //thì kết thúc và in ra tổng của tất cả các số vừa nhập
//        int tong = 0;
//        while (true){
//            System.out.println("Hãy nhập 1 số nguyên: ");
//            int so = Integer.parseInt(sc.nextLine());
//            if(so==0){//dưn vong lặp
//                break;
//            }
//            tong += so;//cộng tích lũy lưu vào biến tổng
//        }
//        System.out.println("Tổng các số vừa nhập: "+tong);
//        int so;
//        do {
//            System.out.println("Nhập giá trị là số nguyên");
//            so = Integer.parseInt(sc.nextLine());
//            tong += so;
//        }while (so!=0);
//        System.out.println("Tổng các số vừa nhập là: "+tong);
        //câu lệnh nhảy: return, break, continue
        //ví dụ: in ra các số chắn < 10
//        for (int i=0; i<10; i++){
//            if(i%2!=0){
//                continue; //bỏ qua vòng lặp hiện tại, nhảy sang vòng lặp mới
//            }
//            System.out.println(i);
//        }
        //vd: nhập vào 1 chuỗi nếu chuỗi đó là chuỗi rỗng thì dừng vòng lặp, nếu không thì nhập tiếp
//        while (true){
//            System.out.println("Hãy nhập vào 1 chuỗi");
//            String str = sc.nextLine();
//            if(str.isBlank()){
//                System.err.println("bạn vừa nhập vào chuỗi rỗng");
//                return;//dừng hàm tại vị trí nó trả về
//            }
//            System.out.println("Chuỗi bạn vừa nhập là: "+str);
//            break;
//        }
//        System.out.println("bên ngoài");

        System.out.println("Điểm HTML: ");
        int point1 = Integer.parseInt(sc.nextLine());
        System.out.println("Điểm CSS: ");
        int point2 = Integer.parseInt(sc.nextLine());
        System.out.println("Điểm JS: ");
        int point3 = Integer.parseInt(sc.nextLine());
        int avgMark = (point1+point2+point3)/3;
        if(avgMark>=0 && avgMark<5){
            System.out.println("Yếu");
        } else if (avgMark>=5 && avgMark<7) {
            System.out.println("Trung bình");
        } else if (avgMark>=7 && avgMark<8) {
            System.out.println("Khá");
        }else if (avgMark>=8 && avgMark<9) {
            System.out.println("Giỏi");
        }else {
            System.out.println("Xuất sắc");
        }


    }
}
