package ss1_Introduction.bai_tap;

public class DocSoThanhChu {
    private static String motChuSo(int n){
        switch (n){
            case 1:
            return ("một");
            case 2:
                return ("hai");
            case 3:
                return ("ba");
            case 4:
                return ("bốn");
            case 5:
                return ("năm");
            case 6:
                return ("sáu");
            case 7:
                return ("bảy");
            case 8:
                return ("tám");
            case 9:
                return ("chín");
        }
        return "mười";
    }
    private static String haiChuSo(int n){
        String ketQua = null;
        int hangChuc = n/10;
        int hangDonVi = n%10;
        if(hangDonVi>0){
            switch (hangChuc){
                case 2:

            }
        }
    }
}
