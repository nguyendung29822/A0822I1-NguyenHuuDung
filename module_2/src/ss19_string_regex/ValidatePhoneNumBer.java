package ss19_string_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumBer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("mời nhập vào số điện thoại :");
            String str = scanner.nextLine();
            System.out.println(checkRegex(str));
            if(checkRegex(str)==true){
                System.out.println("SDT đúng định dạng!!!");
            }else{
                System.out.println("không tồn tại");
            }
        }
    }
    public static boolean checkRegex(String string){
        String regex = "^(0|\\+84)\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
