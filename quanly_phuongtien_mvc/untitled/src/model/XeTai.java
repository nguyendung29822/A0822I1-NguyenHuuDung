package model;

public class XeTai extends PhuongTien{
    protected double trongTai;

    public XeTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai=" + trongTai +
                ", bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
                ", namSanXuat='" + namSanXuat + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                "} " + super.toString();
    }
}
