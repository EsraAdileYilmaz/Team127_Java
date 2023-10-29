package day33_mapUpdate_entryKullanimi;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C08_NumaraIleOgrenciSilme {

    public static void main(String[] args) {

        //SORU: verilen numaradaki ogrenciyi
        // map'den silelim.

        Map <Integer,String> ogrenciMap= MapMethodDepo.okulMapDondur();

        System.out.println(ogrenciMap.remove(101));//Ali-Can-11-H-MF(101 nolu ogrenciyi tamamen sildi.)
        System.out.println(ogrenciMap.remove(102));//Veli-Cem-10-K-TM(102 nolu ogrenciyi tamamen sildi.)
        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.remove(103, "Ali-Cem-11-K-TM"));//true (key ve value eslesti oyuzden sildi)
        System.out.println(ogrenciMap.remove(104, "Ali-Cem-11-K-TM"));//false (cunku key ve value'su eslesmedi)

        //replace() hic bir kontrol yapmadan verdigimiz degeri yeni deger olarak update eder
        ogrenciMap.replace(104,"Ali-Cem-11-K-TM");

        // replace() eger key ile eski value eslesirse ,verdigimiz yeni value'yu atama yapar.key ayni kalir value degisir.
        ogrenciMap.replace(104,"Ali-Cem-11-K-TM","Ali-Yan-10-S-TM");

        System.out.println(ogrenciMap.containsKey(103));//false (cunku ust saturlarda sildik)
        System.out.println(ogrenciMap.containsKey(107));//true (cunku listemizde hala mevcut)

        System.out.println(ogrenciMap.containsValue("Ali"));//false
        // value'nun icindeki degerlere degil,
        // bir butun olarak value'ya bakar.
        // value'su "Ali" olan yoksa false doner.


        System.out.println(ogrenciMap);




    }
}
