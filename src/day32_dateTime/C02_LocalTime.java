package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);

        //bir islemin ne kadar surede bittigini bulmak istersek
        //

        int sayi = 0;
        for (int i = 0; i < 100000; i++) {
            sayi += i;
        }
        LocalTime timeLoopSonrasi = LocalTime.now();
        System.out.println(timeLoopSonrasi);

        double nano1=time.getNano();
        double nano2=timeLoopSonrasi.getNano();

        System.out.println("islem "+(nano2-nano1)+" nano saniyede bitti");

        // ileri veya geriye gidebiliriz
        System.out.println(time.plusMinutes(1000));

        // istersek zone id kullanarak istedigimiz
        // bolgenin saati icinde obje olusturabiliriz

    }
}