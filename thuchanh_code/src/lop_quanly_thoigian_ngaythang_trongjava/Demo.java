package lop_quanly_thoigian_ngaythang_trongjava;

import javax.xml.crypto.Data;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {
        // hàm lấy ra giá trị thời gian hiện tại
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Test");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("trước khi chạy for :" + t1);
        System.out.println("sau khi chạy for :" + t2);
        System.out.println("thời gian :" + (t2 - t1) / 1000 + "s");

        //hàm timeUnit
        System.out.println("3000 năm :" + TimeUnit.DAYS.toSeconds(3000 * 365) + "s");
        System.out.println("25h =" + TimeUnit.HOURS.toSeconds(25) + "s");


        // hàm Date
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d.getDate() + "/" + (d.getYear() + 1900) + "/" + (d.getMonth() + 1));

        // hàm Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));

        c.add(Calendar.HOUR,30);
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));


        // DateFormat
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(d));

        df = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        System.out.println(df.format(d));


    }
}
