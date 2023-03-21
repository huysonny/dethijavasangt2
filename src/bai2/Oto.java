package bai2;

import java.util.Scanner;

public class Oto extends HangHoa {
    private int namSanXuat;
    private String hangSanXuat;
    private String hopSo;
    private int kmDiDuoc;
    private float maLuc;
    private String mauSac;
    public Oto(){
        super.setHangHoaType(2);
    }

    public Oto(int namSanXuat, String hangSanXuat, String hopSo, int kmDiDuoc, float maLuc, String mauSac) {
        this.namSanXuat = namSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.hopSo = hopSo;
        this.kmDiDuoc = kmDiDuoc;
        this.maLuc = maLuc;
        this.mauSac = mauSac;
        super.setHangHoaType(2);
    }

    public Oto(String maHangHoa, String tenHangHoa, int donGia, int soLuong, int namSanXuat, String hangSanXuat, String hopSo, int kmDiDuoc, float maLuc, String mauSac) {
        super(maHangHoa, tenHangHoa, donGia, soLuong);
        this.namSanXuat = namSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.hopSo = hopSo;
        this.kmDiDuoc = kmDiDuoc;
        this.maLuc = maLuc;
        this.mauSac = mauSac;
        super.setHangHoaType(2);
    }
    @Override
    public void input(){
        super.input();
        var sc=new Scanner(System.in);
        System.out.println("Nhập năm sản xuất : ");
        namSanXuat=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập hãng sản xuất : ");
        hangSanXuat=sc.nextLine();
        System.out.println("hộp số ( tự động/ số sàn ) ");
        hopSo=sc.nextLine();
        System.out.println("số km đi được ");
        kmDiDuoc=sc.nextInt();
        System.out.println("Mã lực : ");
        maLuc=sc.nextFloat();
        sc.nextLine();
        System.out.println("màu sắc : ");
        mauSac=sc.nextLine();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("năm sản xuất : "+namSanXuat);
        System.out.println("hãng sản xuất : "+hangSanXuat);
        System.out.println("hộp số : "+hopSo);
        System.out.println("số km đi được "+kmDiDuoc);
        System.out.println("Mã lực "+maLuc);
        System.out.println("Màu sắc "+mauSac);
    }


    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getHopSo() {
        return hopSo;
    }

    public void setHopSo(String hopSo) {
        this.hopSo = hopSo;
    }

    public int getKmDiDuoc() {
        return kmDiDuoc;
    }

    public void setKmDiDuoc(int kmDiDuoc) {
        this.kmDiDuoc = kmDiDuoc;
    }

    public float getMaLuc() {
        return maLuc;
    }

    public void setMaLuc(float maLuc) {
        this.maLuc = maLuc;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
}
