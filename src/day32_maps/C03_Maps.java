package day32_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_Maps {

    public static void main(String[] args) {

        //Map' e konulacak bilgiler ayni ozellikleri tasimali ve ayni sirada olmalidir.
        //Map index yapisini desteklemez

        Map<Integer,String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        System.out.println(ogrenciMap); //{
                                        // 101=Ali-Can-11-H-MF,
                                        // 102=Veli-Cem-10-K-TM,
                                        // 103=Ali-Cem-11-K-TM,
                                        // 104=Ayse-Can-10-H-MF,
                                        // 105=Sevgi-Cem-11-M-TM,
                                        // 106=Sevgi-Can-10-K-MF
                                        // }

        System.out.println(ogrenciMap.size());//6

        //keyset() methodu Set<Integer> dondurur ve bize key'leri getirir.
        System.out.println(ogrenciMap.keySet());//[101, 102, 103, 104, 105, 106]

        //values() methodu Collection<String> dondurur ve bize value'leri getirir.
        System.out.println(ogrenciMap.values());
        //[
        // Ali-Can-11-H-MF,
        // Veli-Cem-10-K-TM,
        // Ali-Cem-11-K-TM,
        // Ayse-Can-10-H-MF,
        // Sevgi-Cem-11-M-TM,
        // Sevgi-Can-10-K-MF
        // ]

        // SORU: Verilen sube'deki ogrencilerin isim ve soyisimlerini yazdiran bir method olusturun

        //method call yapalim
        MapMethodDepo.subeListesiYazdir(ogrenciMap,"K");




    }
}
