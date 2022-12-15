package queue_deque;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
    public static void main(String[] args) {
        Queue<String> danhSach = new PriorityQueue<String>();
        danhSach.offer("NguyenVanE");
        danhSach.offer("NguyenVanB");
        danhSach.offer("NguyenVanA");
        danhSach.offer("NguyenVanD");

        while (true) {
            String ten = danhSach.poll();
            if (ten == null) {
                break;
            }
            System.out.println(ten);
        }

    }

}
