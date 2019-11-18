package app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale locale = new Locale("fr");
        String pattern = "EEEE, dd MMMM yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale);
        System.out.println(simpleDateFormat.format(new Date()));
    }
}