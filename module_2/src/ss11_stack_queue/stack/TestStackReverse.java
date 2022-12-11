package ss11_stack_queue.stack;

import java.util.Scanner;
import java.util.Stack;

public class TestStackReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> number = new Stack<Integer>();
        System.out.println(number.push(1) + "");
        System.out.println(number.push(2) + "");
        System.out.println(number.push(3) + "");
        System.out.println(number.push(4) + "");
        System.out.println(number.push(5) + "");
        System.out.println();
        //đảo ngược mảng number
        System.out.println(number.pop() + "");
        System.out.println(number.pop() + "");
        System.out.println(number.pop() + "");
        System.out.println(number.pop() + "");
        System.out.println(number.pop() + "");
        System.out.println();

        // đảo ngược 1 chuỗi
        Stack<String> stackChuoi = new Stack<String>();
        System.out.println("nhập vào 1 chuỗi :");
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stackChuoi.push(s.charAt(i)+"");
        }
        System.out.println("chuỗi đảo ngược :");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(stackChuoi.pop());
        }
        System.out.println();
    }
}
