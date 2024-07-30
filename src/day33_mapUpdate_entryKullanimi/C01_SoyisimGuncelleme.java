package day33_mapUpdate_entryKullanimi;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C01_SoyisimGuncelleme {

    public static void main(String[] args) {

        // SORU:Ogrenci numarasi verilen elemanin,
        //      soyismini, verilen yeni deger olarak update edin.

        Map<Integer,String> ogrenciMap= MapMethodDepo.okulMapDondur();
        ogrenciMap=MapMethodDepo.numaraIleSoyisimUpdate(ogrenciMap,103,"Celik");//Yani 103 nolu ogrenciyi bulup soyadini celik yapicak
        //update etmis halini kalici hale getirmek icin ogrenciMap'ine atama yaptik.update'ler Map'i degistirir.oyuzden atama yapariz
        System.out.println(ogrenciMap.get(103));//Ali-Celik-11-K-TM


        ogrenciMap=MapMethodDepo.numaraIleSoyisimUpdate(ogrenciMap,105,"Kanki");
        System.out.println(ogrenciMap.get(105));//Sevgi-Kanki-11-M-TM



    }
}
