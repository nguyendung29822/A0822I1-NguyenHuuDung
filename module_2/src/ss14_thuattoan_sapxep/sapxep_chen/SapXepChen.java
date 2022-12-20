package ss14_thuattoan_sapxep.sapxep_chen;

public class SapXepChen {
    public void insertionSort(int arr[]) {
        int valueToInsert;
        int holePosition;
        int i;
        // lap qua tat ca cac so
        for (i = 1; i < arr.length; i++) {
            //chon mot gia tri de chen
            valueToInsert = arr[i];
            //lua chon vi tri de chen
            holePosition = i;
            //kiem tra xem so lien truoc co lon hon gia tri dc chen khong
            while (holePosition > 0 && arr[holePosition - 1] > valueToInsert) {
                arr[holePosition] = arr[holePosition - 1];
                holePosition--;
                System.out.println("di chuyen phan tu :" + arr[holePosition]);
            }
            if (holePosition != i) {
                System.out.println("chen phan tu :" + valueToInsert + ",tai vi tri" + holePosition);
                //chen phan tu tai vi tri chen
                arr[holePosition] = valueToInsert;
            }
            System.out.println("vong lap thu" + i);
            display(arr);
        }
    }
    public void display(int arr[]){
        int i;
        System.out.println("[");
        // duyet qua tat ca cac phan tu
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]+"");
        }
        System.out.println("]");
    }

}
