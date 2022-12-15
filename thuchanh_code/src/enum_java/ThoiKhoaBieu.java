package enum_java;

public class ThoiKhoaBieu {
    private Day thu;
    private String CacMonHoc;

    public ThoiKhoaBieu(Day thu, String cacMonHoc) {
        this.thu = thu;
        CacMonHoc = cacMonHoc;
    }

    public Day getThu() {
        return thu;
    }

    public void setThu(Day thu) {
        this.thu = thu;
    }

    public String getCacMonHoc() {
        return CacMonHoc;
    }

    public void setCacMonHoc(String cacMonHoc) {
        CacMonHoc = cacMonHoc;
    }

    @Override
    public String toString() {
        return "ThoiKhoaBieu{" +
                "thu=" + thu +
                ", CacMonHoc='" + CacMonHoc + '\'' +
                '}';
    }
}
