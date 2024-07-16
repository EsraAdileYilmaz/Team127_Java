package day11_whileLoop_doWhileLoop;

public class C02_WhileLoop {

    public static void main(String[] args) {

      // 1'den 10'a kadar olan sayilari yazdirin

        for (int i = 1; i <= 10; i++) {
            System.out.print(i +" ");
        }


        System.out.println("");// islemler birbirine karismasin diye yapiyoruz


        /*
        while(){

               }
        while loop yapisi boyle olusturulur.
        while loop'da
         - loop icinde kullanilacak baslangic variable'i loop'un disinda olusturulur,
         - bitis sarti,() parantez icine yazilir
         - artis/azalis yontemini(loop un icinde yazilir) manuel olarak bizim yazmamiz gereklidir
         */

        // ayni soruyu while loop ile yapalim

        int sayi=1;
        while(sayi<= 10){
            System.out.println(sayi +" ");
            sayi ++;
        }

        // for loop ile yapilabilecek bir islemi,
        // for loop ile yapmak tercih edilir
        /*
            Tekrar sayisi bilinmeyen,dongu sayisi bilinmeyen islemlerde for loop yerine
            while loop tercih edilir.
         */


    }
}
