package controllers;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu() {
        boolean point = true;
        do {
            System.out.println("------MENU------");
            System.out.println("chức năng của hệ thống : " +
                    "\n 1. Employee Management" +
                    "\n 2. Customer Management" +
                    "\n 3. Facility Management" +
                    "\n 4. Booking Management" +
                    "\n 5. Promotion Management" +
                    "\n 6. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("select function");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Employee Management" +
                            "\n 1.Display list employees" +
                            "\n 2.Add new employee" +
                            "\n 3.Edit employee" +
                            "\n 4.Return main menu");
                    break;
                case 2:
                    System.out.println("Customer Management" +
                            "\n 1.Customer Management" +
                            "\n 2.Add new customer" +
                            "\n 3.Edit customer" +
                            "\n 4.Return main menu");
                    break;
                case 3:
                    System.out.println("Facility Management" +
                            "\n 1.Display list facility" +
                            "\n 2.Add new facility" +
                            "\n 3.Display list facility maintenance" +
                            "\n 4.Return main menu");
                    break;
                case 4:
                    System.out.println("Booking Management" +
                            "\n 1.Add new booking" +
                            "\n 2.Display list booking" +
                            "\n 3.Create new constracts" +
                            "\n 4.Display list contracts" +
                            "\n 5.Edit contracts" +
                            "\n 6.Return main menu");
                    break;
                case 5:
                    System.out.println("Promotion Management" +
                            "\n 1.Display list customers use service" +
                            "\n 2.Display list customers get voucher" +
                            "\n 3.Return main menu");
                    break;
                default:
                    point = false;


            }

        } while (point);
    }
}
