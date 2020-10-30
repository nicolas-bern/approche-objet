package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {

        Calendar myCalend = new GregorianCalendar(2016, Calendar.MAY, 19, 23, 59, 30);
        Date today = Calendar.getInstance().getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        SimpleDateFormat sdf2 = new SimpleDateFormat("YYY/MM/dd HH:mm:ss");



        System.out.println(sdf.format(myCalend.getTime()));
        System.out.println(sdf2.format(today.getTime()));


    }
}
