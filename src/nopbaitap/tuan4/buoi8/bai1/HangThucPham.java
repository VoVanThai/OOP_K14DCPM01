package nopbaitap.tuan4.buoi8.bai1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {
    private String maHang; 
    private String tenHang; 
    private double donGia;
    private Date ngaySX;
    private Date ngayHH;

    private void setMaHang(String maHang) {
        if(maHang != null){
            this.maHang = maHang;
        } else {
            System.out.println("Ma hang khong duoc rong");
        }
    }

    public String getMaHang() {
        return maHang;
    }

    public HangThucPham(){
        
    }

    public void setNgayHH(Date ngayHH) {
        if(ngayHH.after(ngaySX)){
            this.ngayHH = ngayHH;
        } else {
            System.out.println("Ngay het han phai sau ngay san xuat");
        }
    }

    public HangThucPham(String maHang){
        this.setMaHang(maHang);
    }

    

    @Override
    public String toString() {
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        return "HangThucPham [donGia=" + donGia + ", maHang=" + maHang + ", ngayHH=" + ngayVietNam.format(ngayHH) + ", ngaySX=" + ngayVietNam.format(ngaySX)
                + ", tenHang=" + tenHang + "]";
    }

    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySX, Date ngayHH) {
        this.setMaHang(maHang);
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
        this.setNgayHH(ngayHH);
    }

    public boolean kiemTraHSD(){
        boolean isHetHan = false;
        Date 


    }

}


