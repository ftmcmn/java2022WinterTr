package day34_accessModifier_encapsulation;

public class C03 {

    private  int sayi;
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    @Override
    public String toString() {
        return
                "sayi= " + sayi +
                ", str= " + str + '\'' +
                '}';
    }
}
