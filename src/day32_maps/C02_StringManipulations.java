package day32_maps;

import java.util.ArrayList;
import java.util.List;

public class C02_StringManipulations {

    public static void main(String[] args) {

        //SORU:Ogrenci bilgilerini belirli formatta tutan String'lerden olusan bir listemiz var.
        // Bu listeden isim verdigimizde,
        // o isme sahip olanlarin isim ve soyisimlerini yazdiran bir method olusturun.

        List<String> ogrenciList = new ArrayList<>();
        ogrenciList.add("Beytullah-Yildiz-10-K-Soz");
        ogrenciList.add("Esra-Yilmaz-11-L-Soz");
        ogrenciList.add("Ercan-Yil-10-M-MF");
        ogrenciList.add("Beytullah-Han-12-K-MF");

        //method call yapalim
       isimSoyisimYazdir(ogrenciList,"esra");//Isim Soyisim: Esra Yilmaz
        isimSoyisimYazdir(ogrenciList,"beytullah");//Isim Soyisim: Beytullah Yildiz
                                                             //Isim Soyisim: Beytullah Han


        //method call yapalim
        subeListesiYazdir(ogrenciList,"L");




    }

    public static void subeListesiYazdir(List<String> ogrenciList,String istenenSube){

        String [] bilgilerArr;
        for (String each: ogrenciList
             ) {
            bilgilerArr =each.split("-");// [Beytullah, Yildiz, 10, K, Soz]

            if(bilgilerArr[3].equalsIgnoreCase(istenenSube)){
                System.out.println(bilgilerArr[0] + " " + bilgilerArr[1]);
            }
        }
    }

    public static void isimSoyisimYazdir( List<String> ogrenciList,String istenenIsim){

        String ogrenciBilgi;//list'teki herbir bilgiyi bir String'in icine atayalim.
        for (int i = 0; i < ogrenciList.size() ; i++) {
            ogrenciBilgi=ogrenciList.get(i);//"Beytullah-Yildiz-10-K-Soz"
            //list'teki herbir bilgiyi bir String'in icine atayalim.
            String [] bilgilerArr=ogrenciBilgi.split("-");// [Beytullah, Yildiz, 10, K, Soz]
            //String'i array'e donusturduk

            if(bilgilerArr[0].equalsIgnoreCase(istenenIsim)){
                System.out.println("Isim Soyisim: "+ bilgilerArr[0]+" "+bilgilerArr[1]);
            }
        }
    }
}
