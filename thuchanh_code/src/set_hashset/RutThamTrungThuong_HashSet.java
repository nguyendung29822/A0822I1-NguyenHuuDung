package set_hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RutThamTrungThuong_HashSet {
    Set<String> thungPhieuDuThuong = new HashSet<String>();

    public RutThamTrungThuong_HashSet() {
    }
    public boolean themPhieu(String giaTri){
        return this.thungPhieuDuThuong.add(giaTri);
    }
    public boolean xoaPhieu(String giaTri){
        return this.thungPhieuDuThuong.remove(giaTri);
    }
    public boolean kiemTraPhieuTonTai(String giaTri){
        return this.thungPhieuDuThuong.contains(giaTri);
    }
    public void xoaTatCaCacPhieu(){
        this.thungPhieuDuThuong.clear();
    }
    public int laySoLuong(){
        return this.thungPhieuDuThuong.size();
    }
    public String rutThamMotPhieu(){
        String ketQua = "";
        Random rd = new Random();
        int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
        ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
        return ketQua;
    }
    public void inTatCa(){
        System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
    }
}
