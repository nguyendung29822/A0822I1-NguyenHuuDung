package set_treeset;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RutThamTrungThuong_TreeSet {
    Set<String> thungPhieuDuThuong = new TreeSet<String>();

    public RutThamTrungThuong_TreeSet() {
    }
    public boolean themPhieu(String giaTri){
        return this.thungPhieuDuThuong.add(giaTri);
    }
    public boolean xoaPhieu(String giaTri){
        return this.thungPhieuDuThuong.remove(giaTri);
    }
    public boolean kiemTraMaTonTai(String giaTri){
        return this.thungPhieuDuThuong.contains(giaTri);
    }
    public void xoaTatCaMaDuthuong(){
        this.thungPhieuDuThuong.clear();
    }
    public int soLuongPhieuDuThuong(){
        return this.thungPhieuDuThuong.size();
    }
    public String rutThamMotPhieu(){
        String ketQua = "";
        Random rd = new Random();
        int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
        ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
        return ketQua;
    }
    public void inTatCaMa(){
        System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
    }
}
