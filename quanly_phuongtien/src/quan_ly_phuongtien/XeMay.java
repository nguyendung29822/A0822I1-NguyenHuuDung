package quan_ly_phuongtien;

import quan_ly_phuongtien.PhuongTien;

public class XeMay extends PhuongTien {
    private String congSuat;

    public XeMay(String bienKiemSoat, HangSanXuat tenHangSanXuat, int namSanXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }
}
