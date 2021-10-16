package week01day04;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat forming = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("a mai dátum: " +  forming.format(date));
    }
}
