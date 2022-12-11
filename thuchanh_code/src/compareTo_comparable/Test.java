package compareTo_comparable;

public class Test {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(111,"Nguyen Van A","15b",7.5);
        SinhVien sv2 = new SinhVien(121,"Nguyen Van B","15c",8.0);
        SinhVien sv3 = new SinhVien(113,"Nguyen Van C","15a",9.0);

        System.out.println(sv1.compareTo(sv2));
        System.out.println(sv2.compareTo(sv1));
        System.out.println(sv1.compareTo(sv3));


    }
}
