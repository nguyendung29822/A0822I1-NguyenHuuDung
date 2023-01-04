package service;

import model.HangSanXuat;

import java.util.ArrayList;
import java.util.List;

public class HangSanXuatService {
    private ArrayList<HangSanXuat> hangSanXuatArrayList = new ArrayList<>();

    public HangSanXuatService() {
        hangSanXuatArrayList.add(new HangSanXuat("HD", "HonDa", "JaPan"));
        hangSanXuatArrayList.add(new HangSanXuat("KI", "KiA", "Korea"));
        hangSanXuatArrayList.add(new HangSanXuat("AU", "AuDi", "Germany"));
    }
    public List<HangSanXuat> findAll(){
        return hangSanXuatArrayList;
    }
    public HangSanXuat timKiemTheoTen(String ten){
        for (int i = 0; i < hangSanXuatArrayList.size(); i++) {
            if(hangSanXuatArrayList.get(i).getTenHangSanXuat().equals(ten)){
                return hangSanXuatArrayList.get(i);
            }
        }
        return null;
    }
}
