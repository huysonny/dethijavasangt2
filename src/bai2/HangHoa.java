package bai2;

import java.util.Scanner;

public class HangHoa {
    private String maHangHoa;
    private String tenHangHoa;
    private int donGia;
    private int soLuong;
    private int hangHoaType;// de xac dinh xem hang hoa la dien thoai hay oto neu dien thoai thi type=1 neu oto type=2
    public HangHoa(){

    }

    public HangHoa(String maHangHoa, String tenHangHoa, int donGia, int soLuong) {
        this.maHangHoa = maHangHoa;
        this.tenHangHoa = tenHangHoa;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public void setMaHangHoa(String maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getHangHoaType() {
        return hangHoaType;
    }

    public void setHangHoaType(int hangHoaType) {
        this.hangHoaType = hangHoaType;
    }
    public void input(){
        var sc=new Scanner(System.in);
        System.out.println("Nhập mã hàng hóa : ");
        maHangHoa=sc.nextLine();
        System.out.println("Nhập tên hàng hóa : ");
        tenHangHoa=sc.nextLine();
        System.out.println("Nhập đơn giá : ");
        donGia=sc.nextInt();
        System.out.println("Nhập số lượng : ");
        soLuong=sc.nextInt();
    }
    public void output(){
        System.out.println("Mã hàng hóa : "+maHangHoa);
        System.out.println("Tên hàng hóa : "+tenHangHoa);
        System.out.println("Đơn giá : "+donGia);
        System.out.println("Số lượng : "+soLuong);
    }

    @Override
    public String toString() {
        return "HangHoa{" +
                "maHangHoa='" + maHangHoa + '\'' +
                ", tenHangHoa='" + tenHangHoa + '\'' +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                '}';
    }
}
