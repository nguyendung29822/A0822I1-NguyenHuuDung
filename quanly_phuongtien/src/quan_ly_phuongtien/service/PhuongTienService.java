package quan_ly_phuongtien.service;

import java.util.List;

public interface PhuongTienService<E> {
    List<E> findAll();
    void create(E e);
    boolean timKiemTonTaiPhuongTien(String bienKiemSoat);
    void delete(String bienKiemSoat);
    List<E> timKiemTheoBienKiemSoat(String bienKiemSoat);
}
