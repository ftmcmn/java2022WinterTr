package day25_lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {

        //verilen bir arrayden istenen elementi silip
        //kalanları yeni bir array olarak yazdıran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=8;



        istenmeyenElementiSilYazdir(arr,istenmeyenEleman);
    }

    public static void istenmeyenElementiSilYazdir(int[] arr, int istenmeyenEleman) {
       //istenmeyen element sayisini bul
       
       int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==istenmeyenEleman){
                sayac++;
            }
            
        }
        //yeni array olustur
        int arrYeni[]=new int[arr.length-sayac];

        //eski arrayden uygun elementleri yeniye tasi
        int index=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]!=istenmeyenEleman){
                arrYeni[index]=arr[i];
                index++;
            }

        }
        //listeyi yazdirma
        System.out.println(Arrays.toString(arrYeni));

    }
}
