package model;

public class XeMay extends PhuongTien{
    protected String congSuat;

    public XeMay(String congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congSuat='" + congSuat + '\'' +
                ", bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
                ", namSanXuat='" + namSanXuat + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                "} " + super.toString();
    }
}
