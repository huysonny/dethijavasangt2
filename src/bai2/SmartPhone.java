package bai2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SmartPhone extends HangHoa{
    private String heDieuHanh;
    private int dungLuongPin;
    private int dungLuongRam;
    private int dungLuongRom;
    private String hotro5g;
    public SmartPhone(){
        super.setHangHoaType(1);
    }

    public SmartPhone(String heDieuHanh, int dungLuongPin, int dungLuongRam, int dungLuongRom, String hotro5g) {
        this.heDieuHanh = heDieuHanh;
        this.dungLuongPin = dungLuongPin;
        this.dungLuongRam = dungLuongRam;
        this.dungLuongRom = dungLuongRom;
        this.hotro5g = hotro5g;
        super.setHangHoaType(1);
    }

    public SmartPhone(String maHangHoa, String tenHangHoa, int donGia, int soLuong, String heDieuHanh, int dungLuongPin, int dungLuongRam, int dungLuongRom, String hotro5g) {
        super(maHangHoa, tenHangHoa, donGia, soLuong);
        this.heDieuHanh = heDieuHanh;
        this.dungLuongPin = dungLuongPin;
        this.dungLuongRam = dungLuongRam;
        this.dungLuongRom = dungLuongRom;
        this.hotro5g = hotro5g;
        super.setHangHoaType(1);
    }

    public String getHeDieuHanh() {
        return heDieuHanh;
    }

    public void setHeDieuHanh(String heDieuHanh) {
        this.heDieuHanh = heDieuHanh;
    }

    public int getDungLuongPin() {
        return dungLuongPin;
    }

    public void setDungLuongPin(int dungLuongPin) {
        this.dungLuongPin = dungLuongPin;
    }

    public int getDungLuongRam() {
        return dungLuongRam;
    }

    public void setDungLuongRam(int dungLuongRam) {
        this.dungLuongRam = dungLuongRam;
    }

    public int getDungLuongRom() {
        return dungLuongRom;
    }

    public void setDungLuongRom(int dungLuongRom) {
        this.dungLuongRom = dungLuongRom;
    }

    public String getHotro5g() {
        return hotro5g;
    }

    public void setHotro5g(String hotro5g) {
        this.hotro5g = hotro5g;
    }
    @Override
    public void input(){
        super.input();
        var sc=new Scanner(System.in);
        System.out.println("Nhập hệ điều hành : ");
        heDieuHanh=sc.nextLine();
        System.out.println("Nhập dung lượng pin : ");
        dungLuongPin=sc.nextInt();
        System.out.println("Nhập dung lượng Ram : ");
        dungLuongRam=sc.nextInt();
        System.out.println("Nhập dung lượng Rom : ");
        dungLuongRom=sc.nextInt();
        sc.nextLine();
        System.out.println(" Có hỗ trợ 5G không ? :");
        hotro5g=sc.nextLine();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Hệ điều hành : "+heDieuHanh);
        System.out.println("Dung lượng pin : "+dungLuongPin);
        System.out.println("Dung lượng ram : "+dungLuongRam);
        System.out.println("Dung lượng rom : "+dungLuongRom);
        System.out.println("hỗ trợ 5g : "+hotro5g);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "heDieuHanh='" + heDieuHanh + '\'' +
                ", dungLuongPin=" + dungLuongPin +
                ", dungLuongRam=" + dungLuongRam +
                ", dungLuongRom=" + dungLuongRom +
                ", hotro5g='" + hotro5g + '\'' +
                '}';
    }
}
