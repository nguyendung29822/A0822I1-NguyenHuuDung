package quan_ly_phuongtien;

public class Oto extends PhuongTien {
    private double soChoNgoi;
    private String kieuXe;

    public Oto(String bienKiemSoat, HangSanXuat tenHangSanXuat, int namSanXuat, String chuSoHuu, double soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }
}
