package day29_exceptions_garbageCollector;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exceptions {

    public static void main(String[] args) {

        // SORU:kullanicidan toplanmak uzere sayilar isteyin,
        // kullanici islemi bitirmek icin Q'ya basmalidir,
        // kullanici Q'ya bastiginda,
        // kac sayi girildigini ve toplamin ne oldugunu yazdirin.

        Scanner scanner= new Scanner(System.in);

        double girilenSayi=0;
        double toplam=0;
        int count=0;
        boolean devamMI=true;

        while(devamMI){//true oldugu muddetce devam
            System.out.println("Lutfen toplanmak uzere sayi giriniz," +
                    "\nBitirmek icin Q'ya basiniz.");
            //2 hata ihtimali var.Kullanici=> 1)Sayi yerine karakter girilebilir.2)Q ile baslayan birsey yazabilir.
            try {//girilenSayi sorunsuz oldugunda calisacak blok
                girilenSayi= scanner.nextDouble();
                toplam +=girilenSayi;
                count ++;

            } catch (InputMismatchException e) {//kullanici sayi disinda bir deger girerse
               String sayiOlmayanDeger= scanner.nextLine();//String sectik cunku her turlu degeri icine alabiliyor.
               //kullanicinin girdigi degeri bu variable'in icine kaydedip kodun devam etmesini sagliyoruz.
               if(sayiOlmayanDeger.equalsIgnoreCase("Q")){// Q'ya basildiginda kodu bitir
                  devamMI=false;
               }else{
                   System.out.println("Hatali giris yaptiniz,Sayi girmelisiniz.");
               }

            }
        }

        System.out.println("Girilen "+count+" adet sayinin toplami: "+toplam);


    }
}
