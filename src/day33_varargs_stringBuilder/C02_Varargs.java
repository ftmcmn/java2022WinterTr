package day33_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        //parametre olarak bir int
        //ve istediğimiz kadar string alan
        //en uzun kelimenin harf sayisi ile int parametre degerini
        //carpip sonucu yazdiran bir method olusturun

        int sayi=5;
        String str1="zulal";
        String str2="zeynep";
        String str3="ali";

        carpim(sayi,str1,str2,str3);
        //bir metodda varargs disinda parametre kullanacaksak
        //önce diger parametreleri yazip, varargsi en sona yazmaliyiz
        //bu sebeple bir methodda birden fazla varargs olamaz

    }

    private static void carpim(int sayi, String... str) {
        String enUzunStr="";

        for (String each:str
        ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }

        }
        System.out.println("istenen deger : "+sayi*enUzunStr.length());
    }
}
