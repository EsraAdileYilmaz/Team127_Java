package day36_lesQuestions;

public class C06_StringdekiSayilariBulma {

    public static void main(String[] args) {

        //SORU: verilen bir metindeki rakamlarin toplamini yazdiran bir method olusturun
        // ornek : input = Istanbul1453.  output = 13

        String input="Istanbul1453.";

        //method call yapalim
       metindekiSayilarToplami(input);



    }

    public static void metindekiSayilarToplami(String metin){

        /*//1.COZUM YOLU:
        String str="Istanbul1453";
        str=str.replaceAll("\\D","");
        int toplam=0;
        int sayi=Integer.parseInt(str);//String'i int'a cevirdim.
        while(sayi != 0){//girilenSayi 0'a esit olmadigi muddetce

            toplam += sayi %10;
            sayi /=10;
        }

        System.out.println("Girilen sayinin rakamlari toplami: "+ toplam);
        */

        //2.COZUM YOLU:

         // Character wrapper class'indan method'lar kullanabilirim.
         int toplam = 0;
        char karakter;

        for (int i = 0; i <metin.length() ; i++) {

            karakter = metin.charAt(i);//metindeki herbir karakteri aldik.

            if (Character.isDigit(karakter)){//charAt(i) ile gelen karakter digit(rakam) ise

                toplam += Character.getNumericValue(karakter);//o rakamin degerini ekle
                //getNumericValue() methodu bize karakterin temsil ettigi int degeri dondurur.
            }
        }
        System.out.println("Metindeki sayilarin toplami : " + toplam);





    }
}
