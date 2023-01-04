package quan_ly_phuongtien.service;

import quan_ly_phuongtien.model.HangSanXuat;

import java.util.ArrayList;
import java.util.List;

public class HangSanXuatService {
    private ArrayList<HangSanXuat> hangSanXuatArrayList = new ArrayList<>();
    public HangSanXuatService(){
        hangSanXuatArrayList.add(new HangSanXuat("HD","HonDa","japan"));
        hangSanXuatArrayList.add(new HangSanXuat("KI","KIA","Korea"));
        hangSanXuatArrayList.add(new HangSanXuat("AU","AUDI","Germany"));
    }
    public List<HangSanXuat> findAll(){
        return hangSanXuatArrayList;
    }
    public HangSanXuat timKiemTheoTen(String tenHangSanXuat){
        for (int i = 0; i < hangSanXuatArrayList.size(); i++) {
            if(hangSanXuatArrayList.get(i).getTenHangSanXuat().equals(tenHangSanXuat)){
                return hangSanXuatArrayList.get(i);
            }
        }
        return null;
    }
}
