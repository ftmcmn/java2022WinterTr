package day36_inheritance;

public class Memur extends Muhasebe{



    public static void main(String[] args) {


         Memur memur1=new Memur();

         memur1.persNo=1001;
         memur1.isim="ahmet";
         memur1.soyisim="tepecik";
         memur1.adres="ankara";
         memur1.telNo="3125468574";

         memur1.saatUcreti=10;
         memur1.maas= memur1.maasHesapla();
         memur1.statu="memur";
        System.out.println(memur1);

        Memur memur2=new Memur();
        memur2.persNo=1002;
        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();
        System.out.println(memur2);


    }
    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", telNo='" + telNo + '\'' +
                '}';
    }
}
