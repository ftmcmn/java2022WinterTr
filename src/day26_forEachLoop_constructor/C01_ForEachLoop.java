package day26_forEachLoop_constructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        int arr[]={2,4,6,8,11};

        //elementleri forloop ile yazdiralim

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println("");

        for (int each: arr
             ) {
            System.out.print(each + " ");

        }
    }
}
