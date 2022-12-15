package stack;

import java.util.Scanner;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<String>();
        //stackChuoi.push("giá trị") => đưa giá trị vào stack
        //stackChuoi.pop() => lấy giá trị ra, xóa khỏi stack
        //stackChuoi.peek() => lấy giá trị ra nhưng không xóa
        //stackChuoi.clear() => xóa tất cả các phần tử trong stack
        //stackChuoi.contains("gái trị") => xác định giá trị có tồn tại trong stack hay không
        //stackChuoi.size() => độ lớn của stack


        // ví dụ đảo ngược chuỗi
        System.out.println("nhập vào chuỗi :");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stackChuoi.push(s.charAt(i)+"");
        }
        System.out.println("chuỗi đảo ngược là :");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(stackChuoi.pop());
        }
        System.out.println();
        // ví dụ chuyển từ hệ thập phân sang hệ nhị phân
        Stack<String> stackSoDu = new Stack<String>();
        System.out.println("nhập 1 số nguyên dương từ bàn phím");
        int x = sc.nextInt();
        while (x>0){
            int soDu = x%2;
            System.out.println(soDu);
            stackSoDu.push(soDu+"");
            x = x/2;
        }
        System.out.println("số nhị phân là :");
        int n = stackSoDu.size();
        for (int i = 0; i < n; i++) {
            System.out.println(stackSoDu.pop());
        }
    }
}
