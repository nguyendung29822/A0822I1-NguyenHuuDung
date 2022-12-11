package timkiem_sapxep_copy_mang_java;



import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(101, "nguyen huu dung", "A08", 8.0);
        SinhVien sv2 = new SinhVien(104, "nguyen van nhan", "A09", 9.0);
        SinhVien sv3 = new SinhVien(103, "nguyen quoc huy", "A10", 10.0);
        SinhVien sv4 = new SinhVien(105, "nguyen quoc huy", "A10", 10.0);


        SinhVien[] sv_1 = new SinhVien[]{sv1, sv2, sv3};

        System.out.println("ban đầu :" + Arrays.toString(sv_1));
        //dùng trực tiếp
        //Arrays.sort(sv_1, Comparator.comparing(SinhVien::getDiemTrungBinh).thenComparing(SinhVien::getHoVaTen));
//        Arrays.sort(sv_1);
        Arrays.sort(sv_1,new NameComparator());
        System.out.println("sau khi sắp sếp :"+Arrays.toString(sv_1));

        // hàm tìm kiếm đối tượng

        System.out.println("tìm kiếm đối tượng :"+Arrays.binarySearch(sv_1,sv4));


    }
}
