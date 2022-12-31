package quan_ly_phuongtien;

import quan_ly_phuongtien.PhuongTien;

public class XeTai extends PhuongTien {
    private double trongTai;


    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoatXeTai) {
    }

    @Override
    public String toString() {
        return "XeTai[" + super.toString() +
                "trongTai=" + trongTai +
                "] ";
    }
}
