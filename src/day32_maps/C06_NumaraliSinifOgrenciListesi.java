package day32_maps;

import java.util.Map;

public class C06_NumaraliSinifOgrenciListesi {

    public static void main(String[] args) {

        // SORU:Verilen siniftaki ogrencilerin
        //      numara, isim, soyisim ve subelerini yazdiran bir method olusturun.

        Map<Integer,String> ogrenciMap=MapMethodDepo.okulMapDondur();//degerleri hazir aliyoruz

        System.out.println(ogrenciMap.get(103));//Ali-Cem-11-K-TM
        // key'leri bir bir ele alip,
        // o key'e ait value'yu elde ederiz ve inceleriz.
        // sinif uygunsa key ve value'den istenen bolumleri yazdiririz.

        MapMethodDepo.numaraliSinifOgrenciListesiYazdir(ogrenciMap,"11");



    }
}
