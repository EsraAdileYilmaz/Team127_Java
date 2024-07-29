package day32_maps;

import java.util.ArrayList;
import java.util.List;

public class C02_StringManipulations {

    public static void main(String[] args) {

        //SORU 1:Ogrenci bilgilerini belirli formatta tutan String'lerden olusan bir listemiz var.
        //     Bu listede bulunan bir isim verdigimizde,
        //     o isme sahip olanlarin isim ve soyisimlerini yazdiran bir method olusturun.

        List<String> ogrenciList = new ArrayList<>();
        ogrenciList.add("Beytullah-Yildiz-10-K-Soz");
        ogrenciList.add("Esra-Yilmaz-11-L-Soz");
        ogrenciList.add("Ercan-Yil-10-M-MF");
        ogrenciList.add("Beytullah-Han-12-K-MF");

        //method call yapalim
        isimSoyisimYazdir(ogrenciList,"esra");//Isim Soyisim: Esra Yilmaz
        isimSoyisimYazdir(ogrenciList,"beytullah");//Isim Soyisim: Beytullah Yildiz
                                                             //Isim Soyisim: Beytullah Han

        //SORU 2: Subesi verilen ogrencilerin isim ve soyisimlerini
        //        yazdiran bir method olusturun.

        //method call yapalim
        subeListesiYazdir(ogrenciList,"m");//Isim Soyisim: Ercan Yil


    }

    public static void subeListesiYazdir(List<String> ogrenciList,String istenenSube){

        String [] bilgilerArr;
        for (String each: ogrenciList
             ) {
            bilgilerArr =each.split("-");// [Beytullah, Yildiz, 10, K, Soz]

            if(bilgilerArr[3].equalsIgnoreCase(istenenSube)){
                System.out.println("Isim Soyisim: "+bilgilerArr[0] + " " + bilgilerArr[1]);
            }
        }
    }

    public static void isimSoyisimYazdir( List<String> ogrenciList,String istenenIsim){

        String ogrenciBilgi;//list'teki herbir bilgiyi bu String'in icine atadik.
        for (int i = 0; i < ogrenciList.size() ; i++) {
            ogrenciBilgi=ogrenciList.get(i);//"Beytullah-Yildiz-10-K-Soz"
            //list'teki herbir elementi(bilgiyi) bu String'in icine atadik.
            String [] bilgilerArr=ogrenciBilgi.split("-");// [Beytullah, Yildiz, 10, K, Soz]
            //String'i ayristirarak array'e donusturduk

            if(bilgilerArr[0].equalsIgnoreCase(istenenIsim)){//bilgilerArr[0]'indaki isim bizim istenenIsimle ayniysa;
                System.out.println("Isim Soyisim: "+ bilgilerArr[0]+" "+bilgilerArr[1]);
            }
        }
    }
}
