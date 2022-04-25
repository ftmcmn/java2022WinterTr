package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        java pss by value bir proglama dilidir
        yani, bir primitive veriable i argument olarak bir methoda
        yollarsaniz java o veriable i degil degerini(value)
         o methoda aktarir(pass)
         */

        double etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {

        etiketFiyati=etiketFiyati*0.90;
        System.out.println("sizin icin %10 indirimli fiyat :" + etiketFiyati);
    }
}
