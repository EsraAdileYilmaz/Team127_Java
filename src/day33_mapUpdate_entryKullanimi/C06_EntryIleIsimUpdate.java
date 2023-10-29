package day33_mapUpdate_entryKullanimi;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C06_EntryIleIsimUpdate {

    public static void main(String[] args) {

        // SORU:Tum listeyi gozden gecirerek,
        // isimleri ilk harfi buyuk, sonraki harfler kucuk olacak sekilde
        // update eden bir method olusturun.

        Map <Integer,String> ogrenciMap= MapMethodDepo.okulMapDondur();

        ogrenciMap=MapMethodDepo.isimDuzenle(ogrenciMap);
        //tum ogrencilerin ismini duzenleyecek ve bize map dondurecek.Map'i degistirecek.

        //update'ler Map'i degistirir.oyuzden atama yapariz

        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-H-MF,
        // 102=Veli-Cem-10-K-TM,
        // 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Cem-11-M-TM,
        // 106=Sevgi-Can-10-K-MF,
        // 107=Esra-Han-11-M-SOZ,
        // 108=Azim-Kan-12-L-SOZ,
        // 109=Ercan-Fan-12-H-MF,
        // 110=Azim-Kayisi-11-K-TM}
    }
}
