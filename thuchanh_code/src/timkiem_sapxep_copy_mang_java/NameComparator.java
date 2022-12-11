package timkiem_sapxep_copy_mang_java;

import java.util.Comparator;

public class NameComparator implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien o1,SinhVien o2){
        return o1.getTen().compareTo(o2.getTen());
    }
}
