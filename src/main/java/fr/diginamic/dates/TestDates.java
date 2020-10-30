package fr.diginamic.dates;

import java.util.Date;

public class TestDates {
    public static void main(String[] args) {

        Date maDate = new Date(2020, 10, 30);
        System.out.println(maDate.getDate() + "/" + maDate.getMonth() + "/" + maDate.getYear());

        Date ymdh = new Date(2016, 05, 19, 23, 59, 30);
        System.out.println(ymdh.getYear() + "/" + ymdh.getMonth() + "/" + ymdh.getDate() + " " + ymdh.getHours() + ":" + ymdh.getMinutes() + ":" + ymdh.getSeconds());

        Date now = new Date();
        now.toInstant();
        System.out.println(now.getYear() + "/" + now.getMonth() + "/" + now.getDate()+ " " + now.getHours() + ":" + now.getMinutes() + ":" + now.getSeconds());

    }
}
