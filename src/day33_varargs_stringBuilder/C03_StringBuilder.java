package day33_varargs_stringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder("java cok guzel");
        StringBuilder sb3= new StringBuilder(100);

        System.out.println("sb1 length "+sb1.length());
        System.out.println("sb1 capacity "+sb1.capacity());

        System.out.println("sb2 length "+sb2.length());
        System.out.println("sb2 capacity "+sb2.capacity());

        System.out.println("sb3 length "+sb3.length());
        System.out.println("sb3 capacity "+sb3.capacity());

        //append methodu ile sb'a ekleme yapabiliriz

        sb1.append("java").append(" ").append("cok").append(" ").append("guzel");
        System.out.println("sb1 length "+sb1.length());
        System.out.println("sb1 capacity "+sb1.capacity());

        sb1.append(3);
        System.out.println(sb1);
        sb1.append(true);
        System.out.println(sb1);
        System.out.println("sb1 length "+sb1.length());
        System.out.println("sb1 capacity "+sb1.capacity());

        sb1.append("tum dersler java olsa");
        System.out.println("sb1 length "+sb1.length());
        System.out.println("sb1 capacity "+sb1.capacity());

        sb1.trimToSize();
        //ikisini esitler
        System.out.println("sb1 length "+sb1.length());
        System.out.println("sb1 capacity "+sb1.capacity());
    }
}
