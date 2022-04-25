package day30_passByValue;

public class C02_StaticBlocks {

    {
        /*
        static bloklar sadece 1 kere en basta calisir ama
        static olmayan bloklar her obje olusturulurken yeniden calisir


         */
        System.out.println("satatik olmayan blok");
    }
    static {
        System.out.println("statik blok");
    }

    public static void main(String[] args) {
        System.out.println("main method basi");

        C02_StaticBlocks obj1=new C02_StaticBlocks();
        C02_StaticBlocks obj2=new C02_StaticBlocks();

    }
}
