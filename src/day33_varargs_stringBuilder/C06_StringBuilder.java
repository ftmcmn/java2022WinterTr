package day33_varargs_stringBuilder;

public class C06_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("prize dikkat");

        System.out.println(sb1.insert(12," edin."));

        String str="hayatta cok guzel seyler var";
        System.out.println(sb1);

        System.out.println(sb1.reverse()); //.nidetakkid ezirp

    }
}
