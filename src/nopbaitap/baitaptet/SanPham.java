package nopbaitap.baitaptet;

import java.util.Scanner;

public class SanPham {

    private String tenSP;
    private Double donGia;
    private Double giamGia;

    Scanner sc = new Scanner(System.in);

    public String getTenSanPham() {
        return tenSP;
    }

    public void setTenSanPham(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setgiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public SanPham() {

    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double donGia) {
        this(tenSP, donGia, 0);
    }

    private Double getThueNhapKhau() {
        return 0.1 * donGia;
    }

    void nhap() {
        System.out.println("==============================");
        System.out.print("- Nhập tên sản phẩm: ");
        tenSP = sc.nextLine();
        System.out.print("- Nhập giá sản phẩm: ");
        donGia = sc.nextDouble();
        sc.nextLine();
        giamGia = 0.2 * donGia;
        System.out.println("- Giảm giá: " + giamGia);
        System.out.println("==============================");
    }

    public void xuat() {
        System.out.println("==============================");
        System.out.println("- Tên sản phẩm: " + tenSP);
        System.out.println("- Giá: " + donGia);
        System.out.println("- Giảm giá: " + giamGia);
        System.out.println("- Thuế nhập khẩu: " + getThueNhapKhau());
        System.out.println("==============================");
    }

}
