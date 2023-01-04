package taptin_thumuc.doc_object_tutaptin;

import java.io.Serializable;
import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>, Serializable {
    private String maID;
    private String hoVaTen;
    private int namSinh;
    private double diemTB;

    public SinhVien(String maID, String hoVaTen, int namSinh, double diemTB) {
        this.maID = maID;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
    }

    public SinhVien(String maID) {
        this.maID = maID;
    }

    public String getMaID() {
        return maID;
    }

    public void setMaID(String maID) {
        this.maID = maID;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maID='" + maID + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", namSinh=" + namSinh +
                ", diemTB=" + diemTB +
                '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maID.compareTo(o.maID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return  Objects.equals(maID, sinhVien.maID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maID, hoVaTen, namSinh, diemTB);
    }
}
