package kiemtragiuaky;

import java.util.Date;
import java.util.Scanner;

import javax.sound.midi.VoiceStatus;

public class HoaDon {
    private int MaHoaDon;
    private String NgayHoaDon;
    private String TenKhachHang, MaPhong;
    private double DonGia;
    Scanner sc = new Scanner(System.in);

    public HoaDon() {
        this.MaHoaDon = 0;
        this.NgayHoaDon = "";
        this.TenKhachHang = "";
        this.MaPhong = "";
        this.DonGia = 0;
    }

    public HoaDon(int maHd, String ngayHd, String tenKh, String maP, double gia) {
        this.MaHoaDon = maHd;
        this.NgayHoaDon = ngayHd;
        this.TenKhachHang = tenKh;
        this.MaPhong = maP;
        this.DonGia = gia;

    }

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        MaHoaDon = maHoaDon;

    }

    public String getNgayHoaDon() {
        return NgayHoaDon;
    }

    public void setNgayHoaDon(String ngayHoaDon) {
        NgayHoaDon = ngayHoaDon;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        TenKhachHang = tenKhachHang;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String maPhong) {
        MaPhong = maPhong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double donGia) {
        DonGia = donGia;
    }

    public void nhap() {
        System.out.println("Nhap ma hoa don: ");
        MaHoaDon = sc.nextInt();
        System.out.println("Nhap ngay hoa don: ");
        NgayHoaDon = sc.next();
        System.out.println("Nhap ten khach hang: ");
        TenKhachHang = sc.next();
        System.out.println("Nhap ma phong: ");
        MaPhong = sc.next();
        System.out.println("Nhap don gia: ");
        DonGia = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "HoaDon [DonGia=" + DonGia + ", MaHoaDon=" + MaHoaDon + ", MaPhong=" + MaPhong + ", NgayHoaDon="
                + NgayHoaDon + ", TenKhachHang=" + TenKhachHang + "]";
    }

}
