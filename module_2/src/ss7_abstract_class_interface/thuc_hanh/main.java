package ss7_abstract_class_interface.thuc_hanh;

public class main {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Hang1", "VietNam");
        HangSanXuat h2 = new HangSanXuat("Hang2", "TrungQuoc");
        HangSanXuat h3 = new HangSanXuat("Hang3", "My");

        PhuongTienDiChuyen p1 = new MayBay("May Bay",h3,"Xang");
        PhuongTienDiChuyen p2 = new XeOto("O To",h1,"Xang");
        XeDap p3 = new XeDap("Xe Dap",h2);

        System.out.println("lấy vận tốc :");
        System.out.println("p1 :"+p1.layVanToc());

        System.out.println("cất cánh :");
        ((MayBay)p1).catCanh();


        System.out.println("hạ cánh :");
        ((MayBay)p1).haCanh();









    }
}
