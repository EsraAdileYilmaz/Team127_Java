package day34_NestedMaps;

import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.Map;

public class C01_NestedMapOlusturma {

    public static void main(String[] args) {

        //        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        //        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        //        ogrenciMap.put(103,"Ali-Cem-11-K-TM");


        //Key = 101,  Value = "Ali-Can-11-H-MF"
        //Key = 101   Value Map olsun {isim=Ali,soyisim=Can,sinif=11,sube=H,bolum=MF}
        //Key = 102,  Value = "Veli-Cem-10-K-TM"
        //Key = 102   Value Map olsun {isim=Veli,soyisim=Cem,sinif=10,sube=K,bolum=TM}

        //ogrenci Map'i{101=ogrMap101, 102=ogrMap102, 103=ogrMap103}

        Map<Integer, Map<String,String>> ogrenciMap=new HashMap<>();//Outer Map

        //101 numarali ogrenciyi eklemek istersek,once value Map'ini olusturmamiz lazim.
        Map<String,String> ogrMap101=new HashMap<>();
        ogrMap101.put("isim","Ali");//isim=Ali olacak.key=Value oluyor
        ogrMap101.put("soyisim","Can");//key:soyisim, value:Can
        ogrMap101.put("sinif","11");
        ogrMap101.put("sube","H");
        ogrMap101.put("bolum","MF");//boylece 101 nolu ogrenci olusturuldu.

        //ogrMap101 bitince bunu ogrenciMap'e ekleyelim
        ogrenciMap.put(101,ogrMap101);

        //102 numarali ogrenciyi eklemek istersek,once value Map'ini olusturmamiz lazim.
        Map<String,String> ogrMap102=new HashMap<>();
        ogrMap102.put("isim","Veli");//isim=Veli olacak.key=Value oluyor
        ogrMap102.put("soyisim","Cem");
        ogrMap102.put("sinif","10");
        ogrMap102.put("sube","K");
        ogrMap102.put("bolum","TM");//boylece 102 nolu ogrenci olusturuldu.

        //ogrMap102 bitince bunu ogrenciMap'e ekleyelim
        ogrenciMap.put(102,ogrMap102);

        //103 numarali ogrenciyi eklemek istersek,once value Map'ini olusturmamiz lazim.
        Map<String,String> ogrMap103=new HashMap<>();
        ogrMap103.put("isim","Ali");//isim=Ali olacak.key=Value oluyor
        ogrMap103.put("soyisim","Cem");
        ogrMap103.put("sinif","11");
        ogrMap103.put("sube","K");
        ogrMap103.put("bolum","TM");//boylece 103 nolu ogrenci olusturuldu.

        //ogrMap103 bitince bunu ogrenciMap'e ekleyelim
        ogrenciMap.put(103,ogrMap103);

        System.out.println(ogrenciMap);
        //{
        // 101={sinif=11, sube=H, soyisim=Cem, bolum=MF, isim=Ali},
        // 102={sinif=10, sube=K, bolum=TM, isim=Veli},
        // 103={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali}
        // }

        // 102 numarali ogrencinin soyismini yazdirin
        ogrenciMap.get(102);//{sinif=10, sube=K, bolum=TM, isim=Veli}  bunu elde edicez
        System.out.println(ogrenciMap.get(102).get("soyisim"));//Cem

        //103 numarali ogrencinin bolumunu yazdirin.
        System.out.println(ogrenciMap.get(103).get("bolum"));//TM


        //101 numarali ogrencinin souismini BULUT yapin
        ogrenciMap.get(101).put("soyisim","BULUT");//burda put() methodu ile update ettik
        System.out.println(ogrMap101);//{sinif=11, sube=H, soyisim=BULUT, bolum=MF, isim=Ali}
        System.out.println(ogrenciMap.get(101));//{sinif=11, sube=H, soyisim=BULUT, bolum=MF, isim=Ali}


    }
}
