package day36_lesQuestions;

import java.util.Scanner;

public class C01_whileLoop {

    public static void main(String[] args) {


        //SORU=Kullanıcı adı "admin", şifre "p12" olarak belirlenmiştir.
        //Kullanıcıdan kullanıcı adı ve şifre girmesi istenmelidir.
        //Kullanıcı "Kullanıcı adınızı ve şifrenizi giriniz" mesajını görmelidir.
        //Eğer kullanıcı doğru bilgileri girerse,
        // "Hesabınızdasınız!" mesajını almalıdır.
        //Aksi halde, kullanıcı "Kullanıcı adınızı ve şifrenizi giriniz" mesajını 3 kez görmelidir.
        //3 kez yanlış giriş yapılması durumunda, "Hesabınız bloke edilmiştir" mesajını almalıdır.

        Scanner scanner=new Scanner(System.in);
        String kullaniciAdi="admin";
        String kullaniciSifre="p12";

        int sayac=0;//3 kez girme ile sinirlamak icin sayacla kontrol etmeliyiz.
        boolean sifreDogrumu=false;//flag yontemi
        do{
            System.out.println("Lutfen kullanici adinizi giriniz");
            String girilenAd=scanner.nextLine();
            System.out.println("Lutfen kullanici sifrenizi giriniz");
            String girilenSifre= scanner.nextLine();
            sayac++;//cunku tum veriler burda bir kez girilmis oluyor.

            if(girilenAd.equals(kullaniciAdi) && girilenSifre.equals(kullaniciSifre)){
                System.out.println("Hesabınızdasınız!");
                sifreDogrumu=true;
            } else if (sayac >=3) {//2 kez daha girme islemi yapabilir
                System.out.println("Hesabınız bloke edilmiştir");
                break;
            }

        }while( ! sifreDogrumu);//boolean sifreDogrumu=false yaptigimiz icin
                                // while loop parantezinin ici true oldugunda devam eder.
                               //biz ilk atamamizi false yaptigimiz icin=> (!false)=true olur.
                               // biz sifreDogruMu ==> false iken devam etmesini istiyoruz.

    }

}
