package queue_deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DemoDeque {
    public static void main(String[] args) {
        Deque<String> danhSach = new ArrayDeque<String>();
        danhSach.offer("NguyenDung");
        danhSach.offer("NguyenVanB");
        danhSach.offer("NguyenVanA");
        danhSach.offer("NguyenVanD");
        danhSach.offerLast("assasas");
        danhSach.offerFirst("rtyrty");

        while (true){
            String ten = danhSach.poll();
            if(ten==null){
                break;
            }
            System.out.println(ten);
        }
    }
}
