package nopbaitap.tuan4.buoi8.bai1;

public class HangThucPhamTestDrive {
    public static void main(String[] args) {
        HangThucPham hangThucPham = new HangThucPham();
        HangThucPham hangThucPham2 = new HangThucPham("TP2","Hao Hao", "3500", "01/03/2022", "08/03/2022");
        hangThucPham.getMaHang();
        System.out.println(hangThucPham);
        
        String ngaySX = "01/03/2022";
        String ngayHH = "08/03/2022";
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");


    }
}
