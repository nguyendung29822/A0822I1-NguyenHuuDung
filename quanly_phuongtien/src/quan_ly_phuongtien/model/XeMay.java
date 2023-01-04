package quan_ly_phuongtien.model;

public class XeMay extends PhuongTien {
    private String congSuat;

    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoatXeMay, HangSanXuat tenHangSanXuat1, int namHangSanXuat, String chuSoHuu, Double congSuat) {
    }

//    public XeMay(String bKS, HangSanXuat tenHangSanXuat1, int namHangSanXuat, String chuSoHuu, Double congSuat) {
//    }

    @Override
    public String toString() {
        return super.toString() + "XeMay{" +
                "congSuat='" + congSuat + '\'' +
                "} ";
    }
}
