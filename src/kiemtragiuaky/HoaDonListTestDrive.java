package kiemtragiuaky;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class HoaDonListTestDrive {
    public static void main(String[] args) {
        HoaDonList hdl = new HoaDonList();
        Scanner sc = new Scanner(System.in);
        int x;

        do {
            System.out.println("------------------Menu--------------");
            System.out.println("1/Them hoa don theo gio");
            System.out.println("2/Them hoa don theo ngay");
            System.out.println("3/Hien thi danh sach hoa don");
            System.out.println("4/Tong so luong tung loai phong ");
            System.out.println("5/Tinh trung binh tien phong");
            System.out.println("0/Thoat.");
            System.out.println("Nhap lua chon cua ban!");
            x = sc.nextInt();
            switch(x) {
                case 1 : hdl.ThemHoaDon(1);     break;
                case 2: hdl.ThemHoaDon(2);;   break;
                case 3: hdl.HienThiHoaDon();    break;
                case 4: hdl.TongSL();     break;
                case 5: hdl.TinhTB();     break;

            }
        }

    }
}
