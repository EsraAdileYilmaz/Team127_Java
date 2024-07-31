package day35_maps_lesQuestions;

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
                //yani once 1.satirda 4 bosluk(yildiz-bosluk-yildiz-bosluk),sonra 2.satirda 3 bosluk,sonra 3.satirda 2 bosluk,sonra 4.satirda 1 bosluk,sonra 5.satirda 0 bosluk
                System.out.print(" ");//bosluklari koyacak
            }

            for (int j = 1; j <= i ; j++) { //yildizlar icin= 2.inner loop
                System.out.print("* ");//yildizlari koyacak.1satirda 1 yildiz,i=2 yildiz,i=3 yildiz,i=4 yildiz,i=5 yildiz
            }
            System.out.println("");
        } // en genis satira kadar olan kisim (* * * * *) ust kisim

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
