package ss16_text_file.doc_file;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien> {
    protected String maID;
    protected String hoVaTen;
    protected String namSinh;
    protected double diemTB;

    public SinhVien(String maID, String hoVaTen, String namSinh, double diemTB) {
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

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
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
                ", namSinh='" + namSinh + '\'' +
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
        return Objects.equals(maID, sinhVien.maID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maID, hoVaTen, namSinh, diemTB);
    }
}
