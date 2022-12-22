package quan_ly_phuongtien;

import quan_ly_phuongtien.PhuongTien;

public class XeTai extends PhuongTien {
    private double trongTai;

    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, String trongTai, double trongTai1) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, trongTai);
        this.trongTai = trongTai1;
    }
}
