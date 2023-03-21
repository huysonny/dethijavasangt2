package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private static ArrayList<HangHoa> list = new ArrayList<>();

    public static void main(String[] args) {
        int choice = 0;
        var sc = new Scanner(System.in);
        do {
            System.out.println("=============Menu=============");
            System.out.println("0. Thoát chương trình ");
            System.out.println("1. Nhập điện thoại ");
            System.out.println("2. Nhập oto ");
            System.out.println("3. Tất cả điện thoại có hệ điều hành Android có hỗ trợ 5g và dung lượng pin>3000");
            System.out.println("4. Tổng tiền của tất cả điện thoại có hệ điều hành Android");
            System.out.println("5. in toàn bộ điện thoại ");
            System.out.println("6. in toàn bộ oto ");
            System.out.println("7. sắp xếp tất cả đơn hàng theo giá ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    nhapdienthoai();
                    break;
                case 2:
                    nhapoto();
                    break;
                case 3:
                    yc3();
                    break;
                case 4:
                    sum();
                    break;
                case 5:
                    yc5();
                    break;
                case 6:
                    yc6();
                    break;
                case 7:
                    yc7();
                    break;



            }
        } while (choice != 0);
    }

    private static void yc3() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getHangHoaType() == 1) {
                SmartPhone temp = (SmartPhone) list.get(i);
                if (temp.getHeDieuHanh().equals("Android") && (temp.getHotro5g().equals("có")||temp.getHotro5g().equals("co")) && temp.getDungLuongPin() > 3000)
                {
                    temp.output();
                }
            }
        }
    }
    private static void sum(){
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getHangHoaType() == 1) {
                SmartPhone temp = (SmartPhone) list.get(i);
                if (temp.getHeDieuHanh().equals("Android"))
                {
                    sum+=temp.getDonGia()*temp.getSoLuong();
                }
            }
        }
        System.out.println("Tổng tiền của tất cả điện thoại có hệ điều hành Android "+sum);
    }

    private static void nhapdienthoai() {
        int n;
        var sc = new Scanner(System.in);
        System.out.println("nhập số điện thoại cần quản lí : ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            SmartPhone dt = new SmartPhone();
            dt.input();
            list.add(dt);
        }

    }

    private static void nhapoto() {
        int n;
        var sc = new Scanner(System.in);
        System.out.println("nhập số oto cần quản lí : ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Oto oto = new Oto();
            oto.input();
            list.add(oto);
        }

    }
    private static void yc5(){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getHangHoaType()==1){
                list.get(i).output();
            }
        }
    }
    private static void yc6(){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getHangHoaType()==2){
                list.get(i).output();
            }
        }
    }
    private static void yc7(){
        for (int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if (list.get(i).getDonGia()>list.get(j).getDonGia()){
                    HangHoa temp=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        for (int i=0;i<list.size();i++){
            list.get(i).output();
        }
    }
}
