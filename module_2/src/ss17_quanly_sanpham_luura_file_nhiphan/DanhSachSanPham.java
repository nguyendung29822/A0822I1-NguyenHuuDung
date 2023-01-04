package ss17_quanly_sanpham_luura_file_nhiphan;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DanhSachSanPham {
    private static ArrayList<SanPham> danhSach;

    public DanhSachSanPham(ArrayList<SanPham> danhSach) {
        this.danhSach = danhSach;
    }

    public ArrayList<SanPham> getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(ArrayList<SanPham> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSanPham() {
        this.danhSach = new ArrayList<SanPham>();
    }

    public void themSanPham(SanPham sanPham) {
        this.danhSach.add(sanPham);
    }

    public void hienThiDanhSachSanPham() {
        for (SanPham sanpham : danhSach) {
            System.out.println(sanpham);
        }
    }

    public void timKiemSanPham(String maID) {
        for (SanPham sanpham : danhSach) {
            if (sanpham.getMaSanPham().indexOf(maID) >= 0) {
                System.out.println(sanpham);
            }
        }
    }

    public static void ghiFileNhiPhan(String pathFile, ArrayList<SanPham> sanPhamList) {
        File file = new File(pathFile);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(sanPhamList);
            System.out.println("luu file thanh cong!!");
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("loi k tim thay file");
        } catch (IOException e) {
            System.out.println("loi doc file");
        }
    }

    public static ArrayList<SanPham> docFileNhiPhan(String pathFile) {
        ArrayList<SanPham> sanPhamList = new ArrayList<>();
        File file = new File(pathFile);
        try {
            if (file.length() > 0) {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                sanPhamList = (ArrayList<SanPham>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        danhSach = sanPhamList;
        return danhSach;
    }

}
