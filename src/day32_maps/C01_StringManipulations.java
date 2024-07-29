package day32_maps;

import java.util.Arrays;

public class C01_StringManipulations {

    public static void main(String[] args) {

        // SORU:Bir ogrencinin bilgileri arada "-" olarak String bir variable'a atanmistir.
        //      isim-soyisim-sinif-sube-bolum
        //      bu formatta verilen bilgiden, subeyi yazdiran bir method olusturun

        String bilgi = "Ali Can-Yildiz-10-K-Soz";

        //Aradaki ayirac ve siralamasi sabit olmalidir.


        //method call yapalim

        subeYazdir(bilgi);//Ogrenci sube: K

        // SORU:Ogrencinin isim ve soyismini yazdiran bir method olusturun

        //method call yapalim

        isimSoyisimYazdir(bilgi);//Isim Soyisim: Ali Can Yildiz


        //SORU:Ogrencinin bolumunu yazdiran bir method olusturun

        //method call yapalim

        bolumYazdir(bilgi);//Bolum: Soz

    }

    public static void subeYazdir(String bilgi){

        String [] bilgilerArr=bilgi.split("-");
        //String bilgi variable'ini split() methodu ile ayiracindan parcalayip array'e donusturduk.
        System.out.println(Arrays.toString(bilgilerArr));//[Ali Can, Yildiz, 10, K, Soz]

        System.out.println("Ogrenci sube: "+bilgilerArr[3]);//Ogrenci sube: K olarak dondurur

    }

    public static void isimSoyisimYazdir(String bilgi){

        String [] bilgilerArr=bilgi.split("-");
        System.out.println("Isim Soyisim: "+bilgilerArr[0]+" "+bilgilerArr[1]);
    }

    public static void bolumYazdir(String bilgi){

        String [] bilgilerArr= bilgi.split("-");
        System.out.println("Bolum: "+ bilgilerArr[4]);
    }
}
