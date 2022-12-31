package taptin_thumuc.main1;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {
    File file;

    public ViDuFile(String tenFile) {
        this.file = new File(tenFile);
    }
    public boolean kiemTraThucThi(){
        // kiểm tra file có thể thực thi hay k ?
        return this.file.canExecute();
    }
    public boolean kiemTraDoc(){
        //kiểm tra file có thể đọc
        return this.file.canRead();
    }
    public boolean kiemTraGhi(){
        //kiểm tra file có thể ghi
        return this.file.canWrite();
    }
    public void inDuongDan(){
        System.out.println(this.file.getAbsolutePath());
    }
    public void inTen(){
        System.out.println(this.file.getName());
    }
    public void kiemTraThuMucHoacTapTin(){
        if(this.file.isDirectory()){
            System.out.println("đây là thu mục");
        }else if(this.file.isFile()){
            System.out.println("đây là tập tin");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon = 0;
        System.out.println("nhập tên FILE :");
        String tenFile = scanner.nextLine();
        ViDuFile pdf = new ViDuFile(tenFile);
        do {
            System.out.println("--------MENU--------");
            System.out.println("1.Kiểm tra file có thể thực thi :");
            System.out.println("2.Kiểm tra file có thể đọc :");
            System.out.println("3.Kiểm tra file có thể ghi :");
            System.out.println("4.In đường dẫn");
            System.out.println("5.In tên file");
            System.out.println("6.Kiểm tra file là thư mục hoặc tập tin :");
            System.out.println("7.In ra danh sách các file con :");
            System.out.println("8.In ra cây thư mục :");
            luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon){
                case 1 :
                    System.out.println(pdf.kiemTraThucThi());
                    break;
                case 2 :
                    System.out.println(pdf.kiemTraDoc());
                    break;
                case 3 :
                    System.out.println(pdf.kiemTraGhi());
                    break;
                case 4 :
                    pdf.inDuongDan();
                    break;
                case 5 :
                    pdf.inTen();
                    break;
                case 6 :
                    pdf.kiemTraThuMucHoacTapTin();
                    break;
                default:
                    break;
            }
        }while (luaChon!=0);


    }
}
