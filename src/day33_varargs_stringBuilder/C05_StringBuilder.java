package day33_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {
        /*
        compere iki sb'i esit mi diye kontrol etmek icin
        ilk harften baslayarak tum karakterleri karsilastirir
        ayni olan karakterler icin bisey yazdirmaz
        farkli olan ilk karakter icin ascii tablosuna gore
        kac deger geride veya ileride oldugunu yazdirir
        tamamen ayni ise bize sifir dondurur

        bir sb ile bir stringi compare etmek istersek
        java cte verir
         */

        StringBuilder sb1= new StringBuilder("Ali Can");
        StringBuilder sb2= new StringBuilder("Ali Can");

        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2));

        System.out.println(sb1.equals(sb2)); //false

        //System.out.println(str==sb1);//farkli obje oldugu
        // icin java karsilastirma yapmaz

    }
}
