package enum_java;

public enum Month {
    Thang_mot(31),
    Thang_hai(28),
    Thang_ba(30),
    Thang_tu(30),
    Thang_nam(31),
    Thang_sau(30),
    Thang_bay(29),
    Thang_tam(30),
    Thang_chin(31),
    Thang_muoi(31),
    Thang_muoi_mot(30),
    Thang_muoi_hai(31);

    private final int soNgay;

    Month(int soNgay) {
        this.soNgay = soNgay;
    }
    public int SoNgay(){
        return soNgay;
    }
}
