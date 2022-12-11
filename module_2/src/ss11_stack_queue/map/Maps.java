package ss11_stack_queue.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào 1 chuỗi :");
        String s = scanner.nextLine();
        String[] arrayStr = s.split("");
        Map<String, Integer> map = new HashMap<>();

        for (String s1 : arrayStr) {
            if (map.containsKey(s1)) {
                Integer value = map.get(s1);
                value++;
                map.replace(s1, value);
            } else {
                map.put(s1, 1);
            }

        }
        System.out.println(">>>>>>>>>>>>>>>>");
        System.out.println(map);
    }
}
