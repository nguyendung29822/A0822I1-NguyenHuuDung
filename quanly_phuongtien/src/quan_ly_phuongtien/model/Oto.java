package quan_ly_phuongtien.model;

import quan_ly_phuongtien.util.SuDungLienTuc;

public class Oto extends PhuongTien {
    private double soChoNgoi;
    private String kieuXe;

    public Oto(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Oto(String bienKiemSoatXeOto, HangSanXuat tenHangSanXuat1, int namHangSanXuat, String chuSoHuu, int soChoNgoi, SuDungLienTuc.KieuXe kieuXe) {
    }

//    public Oto(String bKS, HangSanXuat tenHangSanXuat1, int namHangSanXuat, String chuSoHuu, int soChoNgoi, SuDungLienTuc.KieuXe valueOf) {
//    }

    @Override
    public String toString() {
        return "Oto{" +
                "soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                "} " + super.toString();
    }
}
