import java.text.*;
import java.util.*;

public class MyTime{
    public static void main(String[] args) {
        DateFormat parse = new SimpleDateFormat("hh:mm:ssa");
        DateFormat format = new SimpleDateFormat("HH:mm:ss");

        try {

            Date date = parse.parse("10:30:54PM");
            String res = format.format(date);
            System.out.println("success");
            System.out.println(res);
            
        } catch (ParseException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}