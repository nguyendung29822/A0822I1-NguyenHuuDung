package quan_ly_phuongtien.service;

import quan_ly_phuongtien.model.XeMay;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class XeMayService implements PhuongTienService<XeMay> {
    private ArrayList<XeMay> xeMayArrayList = new ArrayList<>();

    public List<XeMay> findAll() {
        return xeMayArrayList;
    }

    public void create(XeMay xeMay) {
        xeMayArrayList.add(xeMay);
    }

    @Override
    public boolean timKiemTonTaiPhuongTien(String bienKiemSoat) {
        for (int i = 0; i < xeMayArrayList.size(); i++) {
            if (xeMayArrayList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                return true;
            }
        }
        return false;
    }
    public void delete(String bienKiemSoat){
        for (int i = 0; i < xeMayArrayList.size(); i++) {
            if(xeMayArrayList.get(i).getBienKiemSoat().equals(bienKiemSoat)){
                xeMayArrayList.remove(i);
                break;
            }
        }
    }

    @Override
    public List<XeMay> timKiemTheoBienKiemSoat(String bienKiemSoat) {
        return xeMayArrayList.stream().filter(e->e.getBienKiemSoat().contains(bienKiemSoat)).collect(Collectors.toList());
    }
}
