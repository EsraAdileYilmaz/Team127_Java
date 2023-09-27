package day13_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_Arrays {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip
        //         array’i olusturan ve bize donduren bir method olusturun.


        //method call yapalim. return type'li bir method oldugu icin once kaydedelim.
        //sonra yazdiralim


        String [] kullanicidanAlinanArray=stringArrayOlustur();
        System.out.println(Arrays.toString(kullanicidanAlinanArray));






    }


    public static String[] stringArrayOlustur(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen array'in uzunlugunu giriniz");
        int arrLength= scanner.nextInt();

        String [] kullaniciArrayi=new String[arrLength]; // orn 5 [null, null, null, null, null]

        for (int i = 0; i < kullaniciArrayi.length ; i++) {
            System.out.println("Lutfen array'in kelimelerini giriniz");
           kullaniciArrayi [i]= scanner.next();
        }

        return kullaniciArrayi;

        /*  Ahmed hocanin yaptigi yontem:

                Scanner scanner = new Scanner(System.in);
        System.out.println("Array'in uzunlugunu giriniz");
        int arrLength = scanner.nextInt();
        String[] kullaniciArrayi = new String[arrLength]; // orn 5 [null, null, null, null, null]
        scanner = new Scanner(System.in);
        for (int i = 0; i < kullaniciArrayi.length ; i++) {
            System.out.println("Array'e eklemek icin bir isim soyleyin");
            kullaniciArrayi[i] = scanner.nextLine();
        }
        return kullaniciArrayi;

         */

    }
}
