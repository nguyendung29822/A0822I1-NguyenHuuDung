package ss14_thuattoan_sapxep.cai_dat_sapxepchen;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int position = i;
            int flag = arr[position];
            while (position > 0 && flag < arr[position - 1]) {
                arr[position] = arr[position - 1];
                position--;
            }
            arr[position] = flag;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {9, 6, 5, 2, 1};
        for (int element : numbers) {
            System.out.println(element + ",");
        }
        System.out.println();
        System.out.println("mang sau khi ắp xếp :");
        insertionSort(numbers);
        for (int element : numbers) {
            System.out.println(element + ",");
        }
        System.out.println();
    }

}
