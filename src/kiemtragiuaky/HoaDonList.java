package kiemtragiuaky;

public class HoaDonList extends HoaDon {
    private HoaDon hd[] = new HoaDon[999];
    private int CountHoaDon = 0, sum1 = 0;
    private double Average = 0;

    public HoaDonList() {
        for (int i = 0; i < 999; i++) {
            hd[i] = new HoaDon();
        }
    }

    public void ThemHoaDon(int temp) {
        if (temp == 1) {
            hd[CountHoaDon] = new HoaDonTheoGio();
            HoaDonTheoGio hdtg = new HoaDonTheoGio();
            hdtg.nhap();
            hdtg.ThanhTien = hdtg.tinhTien();
            hd[CountHoaDon] = hdtg;
            sum1++;
        }
    }

    public void HienThiHoaDon() {
        for (int i = 0; i < CountHoaDon; i++) {
            System.out.println("So TT" + (i + 1));
            System.out.println(hd[i].toString());
        }
    }

    public void TongSL() {
        System.out.println("Tong so hoa don tinh theo gio la: " + sum1);
    }

    public void TinhTB() {

    }
}
