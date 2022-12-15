package enum_java;

public class Test {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb2 = new ThoiKhoaBieu(Day.Monday,"Toan,Ly,Hoa");
        ThoiKhoaBieu tkb3 = new ThoiKhoaBieu(Day.Sunday,"Van,Su,Dia");
        ThoiKhoaBieu tkb4 = new ThoiKhoaBieu(Day.Thursday,"Gdcd,Toan,Hoa");

        System.out.println(tkb3);

        int x = Month.Thang_mot.SoNgay();
        System.out.println(x);



    }
}
