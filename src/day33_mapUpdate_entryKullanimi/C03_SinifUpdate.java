package day33_mapUpdate_entryKullanimi;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C03_SinifUpdate {

    public static void main(String[] args) {

        // SORU:Yil sonunda calistirilmak uzere
        //      tum ogrencileri bir ust sinifa cikartan method olusturun.
        //      12.siniftaki ogrencilerin sinif bilgisi olarak mezun yaziniz.

        Map <Integer,String>  ogrenciMap= MapMethodDepo.okulMapDondur();

        ogrenciMap=MapMethodDepo.yilSonuSinifArtir(ogrenciMap);//cunku her sinifi 1 artiricaz
        //update'ler Map'i degistirir.oyuzden atama yapariz

        System.out.println(ogrenciMap);
        //{101=Ali-Can-12-H-MF,
        // 102=Veli-Cem-11-K-TM,
        // 103=Ali-Cem-12-K-TM,
        // 104=Ayse-Can-11-H-MF,
        // 105=Sevgi-Cem-12-M-TM,
        // 106=Sevgi-Can-11-K-MF,
        // 107=Esra-Han-12-M-SOZ,
        // 108=Azim-Kan-Mezun-L-SOZ,
        // 109=Ercan-Fan-Mezun-H-MF,
        // 110=Azim-Kayisi-12-K-TM}

    }
}
