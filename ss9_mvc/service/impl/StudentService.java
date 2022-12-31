package ss9_mvc.service.impl;

import ss9_mvc.common.Validate;
import ss9_mvc.model.Student;
import ss9_mvc.service.IStudentService;
import ss9_mvc.util.ReadAndWrite;

import java.util.*;

public class StudentService implements IStudentService {

    private final String STUDENT_FILE ="src\\ss9_mvc\\data\\student.csv";


    @Override
    public void display() {
        // cần phải lấy dữ liệu và hiển thị ra
        List<Student> studentList = ReadAndWrite.readStudentFromCSV(STUDENT_FILE);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println((i+1)+"."+studentList.get(i));
        }
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public void add() {
        List<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập name");
        String name = scanner.nextLine();
        System.out.println("nhập address");
        String address = scanner.nextLine();
       // check tuổi
        int age = 0;
        boolean flag=false;
        do {
            flag=false;
            System.out.println("nhập tuổi");
            try {
                age= Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                flag= true;
            }
        }while (!Validate.checkAge(age)||flag);

        Student student = new Student(id, name, address,age);
        studentList.add(student);
        // ghi file csv
        // ghi tiếp
        ReadAndWrite.writeStudentListToCSV(STUDENT_FILE,studentList,true);


    }

    @Override
    public void delete() {
        display();
        List<Student> studentList = ReadAndWrite.readStudentFromCSV(STUDENT_FILE);
        Scanner scanner = new Scanner(System.in);
        System.out.println("chọn sinh viên muốn xoá");
        int deleteIndex = Integer.parseInt(scanner.nextLine())-1;
        studentList.remove(deleteIndex);
        // ghi đè
        ReadAndWrite.writeStudentListToCSV(STUDENT_FILE,studentList,false);

    }

    @Override
    public void update() {
//        display();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("chọn Student muốn sửa");
//        int index = Integer.parseInt(scanner.nextLine())-1;
//        for (int i = 0; i < students.length; i++) {
//            if (i == index) {
//                System.out.println("chọn trường cần sửa" +
//                        "\n 1. name"+
//                        "\n 2. address"+
//                        "\n 3.back main menu");
//                int choose = Integer.parseInt(scanner.nextLine());
//                switch (choose){
//                    case 1:
//                        // sửa name
//                        System.out.println("nhập tên cần sửa");
//                        String newName = scanner.nextLine();
//                        students[i].setName(newName);
//                        break;
//                    case 2:
//                        // sửa address
//                        System.out.println("nhập địa chỉ cần sửa");
//                        String newAddress = scanner.nextLine();
//                        students[i].setAddress(newAddress);
//                        break;
//                    default:
//                        break;
//                }
//
//                break;
//            }
//        }
    }

    @Override
    public void search() {

    }

    @Override
    public void create(Student student) {

    }
}
