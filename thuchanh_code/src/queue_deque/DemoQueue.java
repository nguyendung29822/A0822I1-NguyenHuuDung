package queue_deque;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) {
        Queue<String> danhSach = new LinkedList<String>();
        danhSach.offer("NguyenDung");
        danhSach.offer("NguyenVanB");
        danhSach.offer("NguyenVanC");
        danhSach.offer("NguyenVanD");

        while(true){
            String ten = danhSach.poll();
            if(ten==null){
                break;
            }
            System.out.println(ten);
        }

    }
}
