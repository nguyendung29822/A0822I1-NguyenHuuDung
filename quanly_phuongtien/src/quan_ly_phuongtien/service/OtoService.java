package quan_ly_phuongtien.service;

import quan_ly_phuongtien.model.Oto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OtoService implements PhuongTienService<Oto> {
    private ArrayList<Oto> otoArrayList = new ArrayList<>();

    public List<Oto> findAll() {
        return otoArrayList;
    }

    public void create(Oto oto) {
        otoArrayList.add(oto);
    }

    public boolean timKiemTonTaiPhuongTien(String bienKiemSoat) {
        for (int i = 0; i < otoArrayList.size(); i++) {
            if (otoArrayList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                return true;
            }

        }
        return false;
    }

    public void delete(String bienKiemSoat) {
        for (int i = 0; i < otoArrayList.size(); i++) {
            if (otoArrayList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                otoArrayList.remove(i);
                break;
            }
        }
    }

    public List<Oto> timKiemTheoBienKiemSoat(String bienKiemSoat) {
        return otoArrayList.stream().filter(e -> e.getBienKiemSoat().contains(bienKiemSoat)).collect(Collectors.toList());
    }
}
