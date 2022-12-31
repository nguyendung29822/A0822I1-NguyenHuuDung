package ss16_text_file.doc_file;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    protected ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }
    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }
    public void inDanhSachSinhVien(){
        for (SinhVien sinhvien:danhSach) {
            System.out.println(sinhvien);
        }
    }
    public boolean kiemTraDanhSachRong(){
        return this.danhSach.isEmpty();
    }
    public int laySoLuongSinhVien(){
        return this.danhSach.size();
    }
    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }
    public boolean kiemTraSinhVienTonTai(SinhVien sv){
        return this.danhSach.contains(sv);
    }
    public void xoaSinhVien(SinhVien sv){
        this.danhSach.remove(sv);
    }
    public void timKiemSinhVien(String ten){
        for (SinhVien sv:danhSach) {
            if(sv.getHoVaTen().indexOf(ten)>=0) {
                System.out.println(sv);
            }
        }
    }
    public void suaThongTin(SinhVien maSV){
        for (int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getMaID().equals(maSV.getMaID())){
                danhSach.set(i,maSV);
            }
        }
    }
    public void sapXepGiamDanTheoDiem(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getDiemTB()<o2.getDiemTB()) {
                    return 1;
                } else if (o1.getDiemTB()>o2.getDiemTB()) {
                    return -1;
                }else{
                    return 0;
                }
            }
        });
    }

}
