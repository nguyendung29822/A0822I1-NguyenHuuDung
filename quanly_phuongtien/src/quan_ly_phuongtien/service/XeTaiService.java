package quan_ly_phuongtien.service;

import quan_ly_phuongtien.model.XeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class XeTaiService implements PhuongTienService<XeTai> {
    private ArrayList<XeTai> xeTaiArrayList = new ArrayList<>();
    public List<XeTai> findAll() {
        return xeTaiArrayList;
    }
    public void create(XeTai xeTai){
        xeTaiArrayList.add(xeTai);
    }

    public boolean timKiemTonTaiPhuongTien(String bienKiemSoat) {
        for (int i = 0; i < xeTaiArrayList.size(); i++) {
            if(xeTaiArrayList.get(i).getBienKiemSoat().equals(bienKiemSoat)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void delete(String bienKiemSoat) {
        for (int i = 0; i < xeTaiArrayList.size(); i++) {
            if(xeTaiArrayList.get(i).getBienKiemSoat().equals(bienKiemSoat)){
                xeTaiArrayList.remove(i);
                break;
            }
        }
    }

    @Override
    public List<XeTai> timKiemTheoBienKiemSoat(String bienKiemSoat) {
        return xeTaiArrayList.stream().filter(e->e.getBienKiemSoat().contains(bienKiemSoat)).collect(Collectors.toList());
    }
}
