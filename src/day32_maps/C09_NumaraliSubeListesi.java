package day32_maps;

import java.util.Map;

public class C09_NumaraliSubeListesi {

    public static void main(String[] args) {


        /*
        SORU:Verilen subedeki ogrencilerin
        numara, isim, soyisim yazdiran bir method olusturun.
         */

        Map<Integer,String> ogrenciMap=MapMethodDepo.okulMapDondur();

        MapMethodDepo.numaraliSubeListesi(ogrenciMap,"K");
    }
}
