package quan_ly_phuongtien;

import quan_ly_phuongtien.PhuongTien;

public class XeMay extends PhuongTien {
    private String congSuat;

    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoatXeMay) {
    }

    @Override
    public String toString() {
        return super.toString() + "XeMay{" +
                "congSuat='" + congSuat + '\'' +
                "} ";
    }
}
