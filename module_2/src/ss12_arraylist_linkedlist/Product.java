package ss12_arraylist_linkedlist;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private String tenSanPham;
    private String hangSanXuat;
    private String maSanPham;
    private double giaSanPham;

    public Product(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public Product(String tenSanPham, String hangSanXuat, String maSanPham, double giaSanPham) {
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.maSanPham = maSanPham;
        this.giaSanPham = giaSanPham;
    }

    public Product() {}

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    @Override
    public String toString() {
        return "Product{" +
                "tenSanPham='" + tenSanPham + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", maSanPham='" + maSanPham + '\'' +
                ", giaSanPham=" + giaSanPham +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.maSanPham.compareTo(o.maSanPham);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(product.giaSanPham, giaSanPham);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenSanPham, hangSanXuat, maSanPham, giaSanPham);
    }
}
