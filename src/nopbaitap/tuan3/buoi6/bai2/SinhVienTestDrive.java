package nopbaitap.tuan3.buoi6.bai2;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        sinhVien.setId(2004110036);
        sinhVien.setName("Vo Van Thai");
        sinhVien.setDLT(8);
        sinhVien.setDTH(4);
        System.out.println("MSSV: "+sinhVien.getId());
        System.out.println("Name: "+sinhVien.getName());
        System.out.println("DTB: "+sinhVien.DTB());
    }
}
