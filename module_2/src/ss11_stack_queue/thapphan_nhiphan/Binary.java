package ss11_stack_queue.thapphan_nhiphan;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        nhiPhan(number);
    }
    static void nhiPhan(int number) {
        if (number!=0){
            nhiPhan(number/2);
            System.out.println(number%2);
        }
    }
}
