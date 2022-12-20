package quanlynhanvien_arraylist;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeList employees1 = new EmployeeList();
        System.out.println("---------------------------------------");
        System.out.println("-----------------MENU------------------");
        System.out.println("Please choose function :");
        int choise = 0;
        do {
        System.out.println("1.Thêm nhân viên\n" +
                "2.Xóa nhân viên\n" +
                "3.làm rỗng danh sách\n" +
                "4.Tìm kiếm nhân viên theo tên\n" +
                "5.Kiểm tra mã nhân viên tồn tại hay không ?\n" +
                "6.Chỉnh sửa thông tin nhân viên theo mã nhân viên\n" +
                "7.Kiểm tra nhân viên tồn tại hay không ?\n" +
                "8.Hiển thị danh sách nhân viên\n" +
                "9.Kiểm tra danh sách nhân viên trống hay không ?\n" +
                "0.kết thúc chương trình ");
        choise = scanner.nextInt();
        scanner.nextLine();
        if(choise==1){
            System.out.println("fullName :");
            String fullName = scanner.nextLine();
            System.out.println("employeeCode :");
            String employeeCode = scanner.nextLine();
            System.out.println("myId :");
            String myId = scanner.nextLine();
            System.out.println("birthDay :");
            String birthDay = scanner.nextLine();
            System.out.println("position :");
            String position = scanner.nextLine();
            System.out.println("numberPhone :");
            int numberPhone = scanner.nextInt();
            scanner.nextLine();
            Employee employee = new Employee(fullName,employeeCode,myId,birthDay,position,numberPhone);
            employees1.addEmployee(employee);
        } else if (choise==2) {
            System.out.println("employeeCode :");
            String employeeCode = scanner.nextLine();
            Employee employee = new Employee(employeeCode);
            employees1.deleteEmployee(employee);
        } else if (choise==3) {
            employees1.deleteAll();
            System.out.println(employees1);
        } else if (choise==4) {
            System.out.println("fullName :");
            String fullName = scanner.nextLine();
            System.out.println("result :");
            employees1.searchEmployee(fullName);
        } else if (choise==5) {
            System.out.println("employeeCode :");
            String employeeCode = scanner.nextLine();
            System.out.println("result :"+employees1.checkEmployeeCode(employeeCode));
        } else if (choise==6) {
            System.out.println("employeeCode :");
            String employeeCode = scanner.nextLine();
            Employee employee = new Employee(employeeCode);
            employees1.checkEmployee(employee);
            boolean check = employees1.checkEmployee(employee);
            if(check==false){
                System.out.println("fullName :");
                String fullName = scanner.nextLine();
                System.out.println("myId :");
                String myId = scanner.nextLine();
                System.out.println("birthDay :");
                String birthDay = scanner.nextLine();
                System.out.println("position :");
                String position = scanner.nextLine();
                System.out.println("numberPhone :");
                int numberPhone = scanner.nextInt();
                Employee employee1 = new Employee(fullName,employeeCode,myId,birthDay,position,numberPhone);
                employees1.editInformation(employee1);
            }else{
                System.out.println("does not exist !!");
                break;
            }
        } else if (choise==7) {
            System.out.println("employeeCode :");
            String employeeCode = scanner.nextLine();
            Employee employee = new Employee(employeeCode);
            System.out.println("result :"+employees1.checkEmployee(employee));
        } else if (choise==8 ) {
            System.out.println("list of employee:");
            employees1.displayList();
        } else if (choise==9) {
            System.out.println("result list employee :"+employees1.checkExistList());

        }else{
            System.out.println("End program :");
            break;
        }
        }while (choise!=0);

    }
}
