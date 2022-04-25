package day36_inheritance;

public class Fibonacci {
    public static void main(String[] args) {

        int sayi1=0;
        int sayi2=1;
        int sayi3=1;

        if (sayi3<47){
            for (int i = 0; i < 47; i++) {
               sayi3=sayi1+sayi2;
                System.out.println(sayi3);
                sayi1=sayi2;
                sayi2=sayi3;

            }

        }else System.out.println("47den kucuk olmali");

    }
}
