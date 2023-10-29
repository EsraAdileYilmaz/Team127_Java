package day32_maps;

import java.util.Map;

public class C07_VerilenNumaraAraligindakiOgrenciListesi {

    public static void main(String[] args) {

        // SORU:Ogrenci map'inde verilen baslangic ve bitis numaralari (dahil) arasindaki
        // ogrencilerin numara, isim, soyisim'lerini yazdiran bir method olusturun

        Map<Integer,String> ogrenciMap=MapMethodDepo.okulMapDondur();

        MapMethodDepo.numaraAraligindakiOgrenciListesi(ogrenciMap,105,110);



    }
}
