package ss12_arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> danhSach;

    public ProductManager(ArrayList<Product> danhSach) {
        this.danhSach = danhSach;
    }

    public ProductManager() {
        this.danhSach = new ArrayList<>();
    }

    public void themSanPham(Product p) {
        this.danhSach.add(p);
    }

    public boolean xoaSanPham(Product p) {
        return this.danhSach.remove(p);

    }

    public void inDanhSachSanPham() {
        for (Product p : danhSach) {
            System.out.println(p);
        }
    }

    public void timKiemSanPham(String ten) {
        for (Product p : danhSach) {
            if (p.getTenSanPham().indexOf(ten) >= 0) {
                System.out.println(p);
            }
        }
    }
    public boolean kiemTraMaSP(String codeProduct){
       return this.danhSach.contains(codeProduct);
    }



    public void sapXepTangGiamDanTheoGia() {
        Collections.sort(this.danhSach, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getGiaSanPham() < o2.getGiaSanPham()) {
                    return 1;
                } else if (o1.getGiaSanPham() > o2.getGiaSanPham()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    public void suaSanPham(Product product) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSanPham().equals(product.getMaSanPham())) {
                danhSach.set(i, product);
                break;
            }
        }
    }

}
