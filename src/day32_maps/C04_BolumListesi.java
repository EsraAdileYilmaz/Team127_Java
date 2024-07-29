package day32_maps;

import java.util.Map;

public class C04_BolumListesi {

    public static void main(String[] args) {

        // SORU:Verilen bir ogrenci map'inde
        //      istenen bolumdeki ogrencilerin sinif, sube, isim, soyisim'lerini yazdiran
        //      bir method olusturun.

        Map <Integer,String> ogrenciMap=MapMethodDepo.okulMapDondur();//method call ile gelen Map'i bu class'taki Map <Integer,String> ogrenciMap icine kaydettik.
        System.out.println(ogrenciMap);//{101=Ali-Can-11-H-MF,
                                       // 102=Veli-Cem-10-K-TM,
                                       // 103=Ali-Cem-11-K-TM,
                                       // 104=Ayse-Can-10-H-MF,
                                       // 105=Sevgi-Cem-11-M-TM,
                                       // 106=Sevgi-Can-10-K-MF,
                                       // 107=Esra-Han-11-M-SOZ,
                                       // 108=Azim-Kan-12-L-SOZ,
                                       // 109=Ercan-Fan-12-H-MF,
                                       // 110=Azim-Kayisi-11-K-TM}


        //method call
        MapMethodDepo.bolumListesiYazdir(ogrenciMap,"TM");
        //=======TM bolumu ogrenci listesi=========
        //10 K Veli Cem
        //11 K Ali Cem
        //11 M Sevgi Cem
        //11 K Azim Kayisi

    }
}
