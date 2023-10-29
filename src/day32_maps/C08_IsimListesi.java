package day32_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class C08_IsimListesi {

    public static void main(String[] args) {

        // SORU:ogrenci map'inde istenen isimdeki ogrencilerin
        // soyisim, sinif, sube, bilgilerini yazdiran bir method olusturun.

      /* Map<Integer,String> ogrenciMap=new TreeMap<>();
      ogrenciMap.put(102,"Ayca-Ovali-11-M-MF");
       */


        Map<Integer,String> ogrenciMap=MapMethodDepo.okulMapDondur();

        MapMethodDepo.isimdenOgrenciBulma(ogrenciMap,"Azim");



    }
}
