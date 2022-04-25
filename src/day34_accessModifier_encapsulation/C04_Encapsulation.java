package day34_accessModifier_encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {

        /* bir variable ı encapsule etmek icin
        1- access modifier i private yapariz
        2- okuma ve yazma ozelliklerini kullanmasini istedigimiz gibi
           sinirlayabiliriz
           -eger sadece okunmasini istiyorsak getter
           -sadece deger girilebilsin istenirse setter
           metodlarini olustururuz

           bir variable icin hem getter hem setter olusturusaniz o veriable
           public olmus gibi hem okuyup hemde yazilmasini saglayabilirsiniz
          */


        C03 obj= new C03();

        System.out.println(obj.getSayi());

        obj.setStr("java");

        System.out.println(obj.getStr());

        System.out.println(obj);

        System.out.println('a'+" "+'b'+" "+'c');
        System.out.println('a'+'b');


    }
}
