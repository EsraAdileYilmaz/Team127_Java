package day33_mapUpdate_entryKullanimi;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C05_EntryIleSinifListesiYazdirma {

    public static void main(String[] args) {

        // SORU:verilen sinif ve sube bilgisi ile,
        // sinif listesini numara,isim,soyisim olarak yazdiran bir method olusturun.

        Map<Integer,String> ogrenciMap= MapMethodDepo.okulMapDondur();

        String sinif="11";
        String sube="M";

        MapMethodDepo.sinifListesiYazdirma(ogrenciMap,sinif,sube);
        //yazdiran(void) bir method oldugu icin atama yapmaya gerek yok.


    }
}
