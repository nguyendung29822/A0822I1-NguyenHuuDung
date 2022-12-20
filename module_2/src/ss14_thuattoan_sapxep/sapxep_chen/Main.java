package ss14_thuattoan_sapxep.sapxep_chen;

public class Main {
    public static void main(String[] args) {
        // khoi tao mang arr
        int arr[] = {3,5,4,6,9,8,2,0};
        SapXepChen sapXepChen = new SapXepChen();
        System.out.println("du lieu dau vao :");
        sapXepChen.display(arr);
        System.out.println("-------------------");
        sapXepChen.insertionSort(arr);
        System.out.println("-------------------");
        System.out.println("mang sau sap xep chen :");
        sapXepChen.display(arr);

    }
}
