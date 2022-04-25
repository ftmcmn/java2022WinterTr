package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {


        LocalDate trh = LocalDate.now();
        //objnin olusturuldugu tarihi trhye atar

        LocalDate baskaTrh = LocalDate.of(1988, 9, 8);
        //istedigimiz gun ay yıl degerlerine gore bize obje olusturur

        System.out.println(trh);
        //getli methodlarka tarih ile ilgili detay bilgileri alabiliriz
        System.out.println(trh.getDayOfMonth());
        System.out.println(trh.getDayOfWeek());
        System.out.println(trh.getMonthValue());
        System.out.println(trh.getYear());

        //bir tarihte istedigimiz kadar ileri ve geri gidebiliriz
        System.out.println(trh.minusWeeks(20));
        System.out.println(trh.minusWeeks(5).minusDays(3));

        System.out.println(trh.plusMonths(9).plusDays(10));

        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);

        //tarih dile gore degisir

       //is ile baslayan methodlar boolean sonuclar dondurur
        System.out.println(LocalDate.now().isLeapYear());
        System.out.println(trh.isAfter(baskaTrh));



    }
}
