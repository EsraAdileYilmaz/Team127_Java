package day33_mapUpdate_entryKullanimi;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C01_SoyisimGuncelleme {

    public static void main(String[] args) {

        // SORU:ogrenci numarasi verilen elemanin,
        // soyismini, verilen yeni deger olarak update edin.

        Map<Integer,String> ogrenciMap= MapMethodDepo.okulMapDondur();
        ogrenciMap=MapMethodDepo.numaraIleSoyisimUpdate(ogrenciMap,103,"Celik");
        //update etmis halini kalici hale getirdik.update'ler Map'i degistirir.oyuzden atama yapariz
        System.out.println(ogrenciMap.get(103));//Ali-Celik-11-K-TM


        ogrenciMap=MapMethodDepo.numaraIleSoyisimUpdate(ogrenciMap,105,"Kanki");
        System.out.println(ogrenciMap.get(105));//Sevgi-Kanki-11-M-TM



    }
}
