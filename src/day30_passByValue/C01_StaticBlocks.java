package day30_passByValue;

import day29_staticKeyword.C01_Static;

public class C01_StaticBlocks {

    static {
        //static blok class ilk calismaya basladıgında devreye girer
        //ve claasın calismasi icin gerekli on hazırlıklar
        // icin kaullanilir
        //yazıldıgı satirin bir onemi yoktur
        //class icinde istenen yerde yazilabilir
        //biredn fazla olursa bloklar yukardan asagı calisir
        System.out.println("static blok calisti");
    }
    static {
        System.out.println("static blok2 calisti");
    }
    C01_StaticBlocks(){
        System.out.println("constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_StaticBlocks obj1;
        new C01_StaticBlocks();
        System.out.println("main method sonu");

    }
}
