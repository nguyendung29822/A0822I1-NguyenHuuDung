package quanly_sinhvien_sudung_arrraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
    }

    public void inDanhSachSinhVien() {
        for (SinhVien sinhvien : danhSach) {
            System.out.println(sinhvien);
        }
    }

    public boolean kiemTraDanhSachRong() {
        return this.danhSach.isEmpty();
    }

    public int laySoLuongSinhVien() {
        return this.danhSach.size();
    }

    public void lamRongDanhSach() {
        this.danhSach.removeAll(danhSach);
    }

    public boolean kiemTraSinhVienTonTai(SinhVien sv) {
        return this.danhSach.contains(sv);
    }

    public boolean xoaSinhVien(SinhVien sv) {
        return this.danhSach.remove(sv);
    }

    public void timKiemSinhVien(String ten) {
        for (SinhVien sinhvien : danhSach) {
            if (sinhvien.getHoVaTen().indexOf(ten) >= 0) {
                System.out.println(sinhvien);
            }
        }
    }

    public void suaThongtin(SinhVien maSV) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaID().equals(maSV.getMaID())) {
                danhSach.set(i, maSV);
            }
        }
    }

    public boolean kiemTraMaSV(String maSV) {
        return this.danhSach.contains(maSV);
    }

    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getDiemTB() < sv2.getDiemTB()) {
                    return 1;
                } else if (sv1.getDiemTB() > sv2.getDiemTB()) {
                    return -1;
                } else {
                    return 0;

                }
            }
        });
    }


}
