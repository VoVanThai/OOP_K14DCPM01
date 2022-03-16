package kiemtragiuaky;

public class HoaDonTheoGio extends HoaDon {
    private double SoGioThue, ThanhTien;

    public HoaDonTheoGio() {
        super();
        this.SoGioThue = 0;
    }

    public double getSoGioThue() {
        return SoGioThue;
    }

    public void setSoGioThue(double soGioThue) {
        SoGioThue = soGioThue;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhap so gio thue phong: ");
        SoGioThue = sc.nextDouble();
    }

    public double tinhTien() {
        if (this.SoGioThue > 24 && this.SoGioThue < 30) {
            this.SoGioThue = 24;
        } else if (this.SoGioThue > 30) {
            System.out.println("Hay dung hoa don theo ngay!");
        }
        return this.ThanhTien = this.SoGioThue * this.DonGia;
    }

    @Override
    public String toString() {
        return "HoaDonTheoGio [SoGioThue=" + SoGioThue + ", ThanhTien=" + ThanhTien + "]";
    }

}
