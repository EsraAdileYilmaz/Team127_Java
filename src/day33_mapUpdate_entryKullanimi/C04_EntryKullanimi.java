package day33_mapUpdate_entryKullanimi;

import day32_maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C04_EntryKullanimi {

    public static void main(String[] args) {

        /*
        1)entrySet() methodu ile Map listesi entry'e cevrilir.
        2)getKey() methodu ile key'ler elde edilir.
        3)getValue() methodu ile value'ler elde edilir.
        4)setValue() methodu ile value'ler update edilir.
        5)remove(Object key) methodu ile value'yu siler ve sildigi value'yu dondurur.
        6)remove(Object key,Object value) methodu ile key-value eslesirse siler ve boolean bir sonuc dondurur
        7)replace(Integer key,String value) methodu value'de hic bir kontrol yapmadan verdigimiz degeri yeni deger olarak update eder
        8)replace(Integer key,String oldvalue,String newvalue) methodu ile key-value eslesirse verdigimiz degeri yeni deger olarak update eder
        9)containsKey() methodu ile (verilen key'i icerir mi?) sorusuna cvp olur
        10)containsValue() methodu ile (verilen value'yu icerir mi?) sorusuna cvp olur
         */

        Map<Integer,String> ogrenciMap= MapMethodDepo.okulMapDondur();
        Set<Map.Entry<Integer,String>> entrySeti =ogrenciMap.entrySet();
        //Set Entry'lerden olusacak,Entry'ler de Integer,String'lerden olusacak.

        System.out.println(entrySeti);
        //[101=Ali-Can-11-H-MF,
        // 102=Veli-Cem-10-K-TM,
        // 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Cem-11-M-TM,
        // 106=Sevgi-Can-10-K-MF,
        // 107=Esra-Han-11-M-SOZ,
        // 108=Azim-Kan-12-L-SOZ,
        // 109=Ercan-Fan-12-H-MF,
        // 110=Azim-Kayisi-11-K-TM] *** map'le farki map={} yerine entry=[] ile liste olusuyor.

        for ( Map.Entry<Integer,String> eachEntry:entrySeti
             ) {
            eachEntry.setValue("hacklendi");//setValue() Map'i otomatik olarak update eder.
            //herbir each'in value'sunu hacklendi diye kalici degistir

        }
        System.out.println(entrySeti);
        //[101=hacklendi,
        // 102=hacklendi,
        // 103=hacklendi,
        // 104=hacklendi,
        // 105=hacklendi,
        // 106=hacklendi,
        // 107=hacklendi,
        // 108=hacklendi,
        // 109=hacklendi,
        // 110=hacklendi]

    }
}
