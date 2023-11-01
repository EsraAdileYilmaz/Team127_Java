package day35_Maps_GenelTekrar;

public class C02_ForLoop {

    public static void main(String[] args) {

         /*
       Yıldızlar (*) ile baklava deseni oluşturabileceğiniz bir kod yazınız.
       Sonuç böyle olmalıdır;

              *
             * *
            * * *
           * * * *
          * * * * *
           * * * *
            * * *
             * *
              *


          şeklini konsola yazdiriniz.
     */

        int enGenisSatir = 5;

        for (int i = 1; i <= enGenisSatir ; i++) {//outer loop, ustteki ucgen icin

            for (int j =1 ; j <= enGenisSatir-i ; j++) { //bastaki bosluklar icin= 1.inner loop
                //yani once 4 bosluk,sonra 3 bosluk,sonra 2 bosluk,sonra 1 bosluk,sonra 0 bosluk
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) { //yildizlar icin= 2.inner loop
                System.out.print("* ");
            }
            System.out.println("");
        } // en genis satira kadar olan kisim (* * * * *)

        for (int i = enGenisSatir-1; i >=1 ; i--) {//outer loop, alttaki ucgen icin,4 yildizdan baslicaz
            for (int j = 1; j <=enGenisSatir-i ; j++) {//bastaki bosluklar icin= 1.inner loop,bosluk artarak gidiyor
                System.out.print(" ");//1 bosluk,2bosluk,3bosluk,4bosluk
            }

            for (int j = 1; j <=i ; j++) {//yildizlar icin= 2.inner loop
                System.out.print("* ");//4yildiz,3yildiz,2yildiz,1yildiz
            }

            System.out.println("");
        }

    }
}
