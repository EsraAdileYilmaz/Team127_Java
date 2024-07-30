package day32_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodDepo {

    /*
        Map kompleks bilgiler barindirabilir.
        Ne kadar cok bilgi barindirirsa, bilgilere erismek o kadar islem gerektirebilir.
        Ama temel olarak Map <Key , Value> dan olusur.

        value bir cok bilgi barindiran bir String ise;
        bilgilere ulasmak icin split() methodu ile String'i array'e ceviririz.

        1- Eger sadece value'dan bilgiler istenirse;
           - ogrenciMap.values() ile value'ler bir Collection'a kaydedilir
           - sonra Collection'daki String'ler for-each loop ile ele alinip
           - split() methodu ile array'e cevrilir
           - ve ISTENEN SARTLARA uyan value'lardan ISTENEN BILGILER kullanilir

        2- Eger key ve value birlikte istenirse;
            - ogrenciMap.keySet() ile key'lere ulasilir ve key'ler bir Set'e kaydedilir.
            - for each loop ile key'ler elden gecirilir.
            - sadece key degil, ogrenciMap.get(each) ile value'lere ulasilir
            - value split() methodu ile array'e cevrilir.
            - ve ISTENEN SARTLARA uyan value'lardan ISTENEN BILGILER kullanilir.

     */

    // SORU:verilen sube'deki ogrencilerin isim ve soyisimlerini yazdiran bir method olusturun

    public static void subeListesiYazdir(Map<Integer,String> ogrenciMap, String istenenSube){

        //once values'leri elde etmek gerekiyor.
        Collection<String> valueCollection=ogrenciMap.values();//values() Collection dondurdugu icin Collection'a atadik
        System.out.println(valueCollection);
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF]

        String [] valueArr;//split()le olusan verileri atamak icin array olusturduk
        System.out.println("========"+istenenSube + " subesi ogrenci Listesi"+"======");

        for (String each:valueCollection
             ) {// each ==> "Ali-Can-11-H-MF"
            valueArr=each.split("-");// [Ali, Can, 11, H, MF]
            if(valueArr[3].equalsIgnoreCase(istenenSube)){
                System.out.println("Isim soyisim: "+valueArr[0]+" "+valueArr[1]);
            }

        }


    }
    //Asagidaki method okul listesini iceren bir Map'tir.
    public static Map<Integer, String> okulMapDondur() {
        //Genel kullanilan ogrenci listesi
        Map<Integer,String> ogrenciMap= new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
        ogrenciMap.put(108,"Azim-Kan-12-L-SOZ");
        ogrenciMap.put(109,"Ercan-Fan-12-H-MF");
        ogrenciMap.put(110,"Azim-Kayisi-11-K-TM");

        return ogrenciMap;

    }

    // SORU:Verilen bir ogrenci map'inde istenen bolumdeki ogrencilerin sinif, sube, isim, soyisim'lerini yazdiran bir method olusturun.

    public static void bolumListesiYazdir(Map<Integer, String> ogrenciMap, String istenenBolum) {
        // istenen bolumdeki ogrencilerin sinif, sube, isim, soyisim'lerini yazdiran

        Collection<String> valueCollection=ogrenciMap.values();
        String [] valueArr;
        System.out.println("======="+ istenenBolum + " bolumu ogrenci listesi=========");

        for (String each:valueCollection
             ) {//each ==> "Esra-Han-11-M-SOZ"
           valueArr=each.split("-");//each'in getirdigi herbir String'i parcalayip valueArr'in icine aticam
            // [Ali, Can, 11, H, MF]
            if(valueArr[4].equalsIgnoreCase(istenenBolum)){

                System.out.println(valueArr[2]+" "+valueArr[3]+" "+valueArr[0]+" "+valueArr[1]);
            }


        }
    }

    // SORU:Ogrenci map'inde istenen soyisimdeki ogrencilerin
    //      sinif, sube, isim, soyisim bilgilerini yazdiran bir method olusturun

    public static void soyisimdenOgrenciBulma(Map<Integer, String> ogrenciMap, String istenenSoyisim) {
        // sinif, sube, isim, soyisim bilgilerini yazdiran bir method olusturun

        Collection<String> valueCollection=ogrenciMap.values();
        String [] valueArr;
        System.out.println("=======" + istenenSoyisim+" soyismindeki ogrenci listesi =========");

        for (String each:valueCollection
             ) {// each ==> "Azim-Kayisi-11-K-TM"
            valueArr=each.split("-");

            if(valueArr[1].equalsIgnoreCase(istenenSoyisim)){
                System.out.println(valueArr[2]+" "+valueArr[3]+" "+valueArr[0]+" "+valueArr[1]);
            }
        }
    }

    // SORU:Verilen siniftaki ogrencilerin
    //      numara, isim, soyisim ve subelerini yazdiran bir method olusturun.
    public static void numaraliSinifOgrenciListesiYazdir(Map<Integer, String> ogrenciMap, String sinifNo) {

        // numara, isim, soyisim ve subelerini yazdiran bir method olusturun.
        Set<Integer> keySeti =ogrenciMap.keySet();//keyleri elde ediyoruz ve Set'e atiyoruz
        // [101, 102, 103, 104, 105, 106, 107, 108, 109, 110]

        String valueEach;//keylerin getirdigi bilgileri(value'leri) icine atayacagiz.
        String [] valueArr;

        System.out.println("======= Numarali "+ sinifNo + ". sinif listesi ========");
        for (Integer each:keySeti
             ) {// each ==> key'leri getirecek 101 ...
            valueEach=ogrenciMap.get(each);// "Azim-Kayisi-11-K-TM" (each'in getirdigi bilgiler buraya atanir)
            valueArr=valueEach.split("-");

            if(valueArr[2].equals(sinifNo)){
                System.out.println(each+" "+valueArr[0]+" "+valueArr[1]+" "+valueArr[3]);
            }
        }
    }

    // SORU:Ogrenci map'inde verilen baslangic ve bitis numaralari (dahil) arasindaki
    //      ogrencilerin numara, isim, soyisim'lerini yazdiran bir method olusturun

    public static void numaraAraligindakiOgrenciListesi(Map<Integer, String> ogrenciMap, int baslangicNo , int bitisNo) {

        // ogrencilerin numara, isim, soyisim'lerini yazdiran bir method olusturun
        Set<Integer> keySeti=ogrenciMap.keySet();
        //[101, 102, 103, 104, 105, 106, 107, 108, 109, 110]
        String valueEach;//her bir key'in value'sunu koyuyoruz
        String [] valueArr;
        int sayac=0;

        for (Integer each:keySeti
             ) {//each ==> 101
            if(baslangicNo<=each && each <=bitisNo){

                valueEach=ogrenciMap.get(each);//her bir each'in getirdigi bilgiler(values'ler) buraya atanir.
                valueArr=valueEach.split("-");
                System.out.println(each+" "+valueArr[0]+" "+valueArr[1]);
                sayac++;
            }

        }
        if(sayac==0){//yani aralik disinda bir key verilirse;
            System.out.println("Verilen aralikta ogrenci bulunmamaktadir");
        }
    }


    // SORU:Ogrenci numarasi verilen elemanin,
    //      soyismini, verilen yeni deger olarak update edin.
    public static Map<Integer, String> numaraIleSoyisimUpdate(Map<Integer, String> ogrenciMap, int ogrenciNo, String yeniSoyisim) {

        //1)once istenen ogrenci numarasina ait value'u alalim.
        //Ali-Cem-11-K-TM

        String ogrenciValue=ogrenciMap.get(ogrenciNo);//ogrenciNo'nun bilgilerini getirecek.


        //2)split() methodu ile datayi manipule edilebilir hale getirelim.
        //[Ali, Cem, 11, K, TM]

        String [] ogrenciValueArr=ogrenciValue.split("-");//gelen bilgileri rahat kullanmak icin array'e cevirdik.

        //3)array'in 1.index'indeki soyismi yeniSoyisim olarak update edelim.
        //[Ali, Celik, 11, K, TM]
        ogrenciValueArr[1] =yeniSoyisim;

        //4)array'deki elemanlari, Map'e donusturmek icin yeniden value formatina sokmamiz lazim.
        //String olarak "Ali-Celik-11-K-TM" toplama yoluyla elde ederiz.

        String yeniValue=ogrenciValueArr[0]+"-"+
                         ogrenciValueArr[1]+"-"+
                         ogrenciValueArr[2]+"-"+
                         ogrenciValueArr[3]+"-"+
                         ogrenciValueArr[4];


        //5)elimizde key var(ogrenciNo),elimizde yeniValue de var
        ogrenciMap.put(ogrenciNo,yeniValue);


        return ogrenciMap;
    }


    // SORU:ogrenci map'inden verilen bir sube'deki
    //      tum ogrencilerin subesini verilen yeniSube yapan bir method olusturun.
    public static Map<Integer, String> subedekiOgrencileriTasi(Map<Integer, String> ogrenciMap, String eskiSube, String yeniSube) {

        //1)Hangi ogrenci numarasinin subesi degisecek bilmedigimden
        //once keySet() ile tum key'leri alalim.
        //[101, 102, 103, 104, 105, 106, 107, 108, 109, 110]

        Set<Integer> keySeti=ogrenciMap.keySet();

        //2)for-each loop ile her key'e ait value'yu ele alalim
        //Ali-Cem-11-K-TM

        String [] valueArr;

        for (Integer each: keySeti
             ) {//each'in getirdigi herbir key'in value'sune ulasmaliyim.
            //3)Value'deki bilgileri kullanabilmek icin split() ile array'e cevirelim.
            //[Ali, Cem, 11, K, TM]
            valueArr=ogrenciMap.get(each).split("-");//ogrenciMap.get(each) burasi bize String value dondurur.Bunu split() ile parcalayip array'e atariz

            //4)array[3]'e bakip istenen eskiSube degerine esit ise
            //yeni Sube olarak update edelim.[Ali, Cem, 11, C, TM]
            if(valueArr[3].equalsIgnoreCase(eskiSube)){
                valueArr[3]=yeniSube;
            }
            //5)Map'i update edebilmek icin,
            //array'i value formatina uygun String'e donusturelim.

            String yeniValue=valueArr[0]+"-"+
                             valueArr[1]+"-"+
                             valueArr[2]+"-"+
                             valueArr[3]+"-"+
                             valueArr[4];

            //6)key ve yeni value'yu kullanarak
            //Map'i update edelim.

            ogrenciMap.put(each,yeniValue);
        }
        return ogrenciMap;
    }


    // SORU:Yil sonunda calistirilmak uzere
    //      tum ogrencileri bir ust sinifa cikartan method olusturun.
    //      12.siniftaki ogrencilerin sinif bilgisi olarak mezun yaziniz.
    public static Map<Integer, String> yilSonuSinifArtir(Map<Integer, String> ogrenciMap) {

        //1)Hangi ogrenci numarasinin subesi degisecek bilmedigimden
        //once keySet() ile tum key'leri alalim.
        //[101, 102, 103, 104, 105, 106, 107, 108, 109, 110]
       Set<Integer> keySeti= ogrenciMap.keySet();

       String [] valueArr;
        //2)for-each loop ile her key'e ait value'yu ele alalim
        //Ali-Cem-11-K-TM
        for (Integer each: keySeti
             ) {
            //3)Value'deki bilgileri kullanabilmek icin split() ile array'e cevirelim.
            //[Ali, Cem, 11, K, TM]
            valueArr=ogrenciMap.get(each).split("-");

            //4)array(valueArr)'deki her bir sinif bilgisini 1 artirmam lazim
            switch (valueArr[2]){
                case "9":
                    valueArr[2]="10";
                    break;
                case "10":
                    valueArr[2]="11";
                    break;
                case "11":
                    valueArr[2]="12";
                    break;
                case "12":
                    valueArr[2]="Mezun";
                    break;
                default:
                    valueArr[2]=null;
            }
            //5)Map'i update edebilmek icin,
            //array'i value formatina uygun String'e donusturelim.
            String yeniValue=valueArr[0]+"-"+
                             valueArr[1]+"-"+
                             valueArr[2]+"-"+
                             valueArr[3]+"-"+
                             valueArr[4];

            ogrenciMap.put(each,yeniValue);
        }


        return ogrenciMap;
    }


    // SORU:Verilen sinif ve sube bilgisi ile,
    //      sinif listesini numara,isim,soyisim olarak yazdiran bir method olusturun.
    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        //numara,isim,soyisim= key+value
       Set<Map.Entry<Integer,String>> entrySeti =ogrenciMap.entrySet();//Map'i entrySet() ile entry'e cevirdik

       //entry'leri elden gecirip (for-each loop ile),
       //sinif ve sube bilgisi istenen degere esit olanlari yazdiralim.

        String eachValue;
        String [] valueArr;
        System.out.println("====="+sinif+"/"+sube+" sinif listesi =====");

        for (Map.Entry<Integer,String> eachEntry: entrySeti
             ) {//eachEntry=>110=Azim-Kayisi-11-K-TM  (key ve value'yu beraber getirdi)
            eachValue=eachEntry.getValue();//herbir value elde edilir=> "Azim-Kayisi-11-K-TM"
            valueArr=eachValue.split("-");//[Ali, Cem, 11, C, TM]

            //SORU:verilen sinif ve sube bilgisi ile dedigi icin
            if(valueArr[2].equals(sinif) && valueArr[3].equalsIgnoreCase(sube)){
                //sinif listesini numara,isim,soyisim olarak yazdirin
                System.out.println(eachEntry+" "+valueArr[0]+" "+valueArr[1]);
                //System.out.println(eachEntry.getKey() + " " + valueArr[0] +" " +valueArr[1]); ahmet hoca boyle yapmis
            }
        }


    }


    // SORU:Tum listeyi gozden gecirerek,
    //      isimleri ilk harfi buyuk, sonraki harfler kucuk olacak sekilde
    //      update eden bir method olusturun.
    public static Map<Integer, String> isimDuzenle(Map<Integer, String> ogrenciMap) {

        //1)Bir entrySeti olusturalim
        Set<Map.Entry<Integer,String>> entrySeti=ogrenciMap.entrySet();
        /*
        Collection<String> values=ogrenciMap.values(); +
        Set<Integer> keyler=ogrenciMap.keySet();
        = Set<Map.Entry<Integer,String>> keyValues=ogrenciMap.entrySet();
        Mapte 2 ayri adimda yapilan islem Set<Map.Entry<Integer,String>>  ile tek adimda yapiliyor
         */

        String eachValue;
        String [] valueArr;
        String isim;
        //2)Her bir entry'i ele almak icin for-each kullanalim
        for (Map.Entry<Integer,String> eachEntry:entrySeti
             ) {//herbir entry=key+value'yu aldik
            //3)her bir entry'deki value'yu alalim
            eachValue=eachEntry.getValue();//"Ali-Can-11-H-MF"

            //4)value'yu degistirebilmek icin array yapalim
            valueArr=eachValue.split("-");

            //5)array[0] da bulunan isim bilgisini istenen formata getirelim
            isim=valueArr[0];
            valueArr[0]=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
            // valueArr[0]=valueArr[0].substring(0,1).toUpperCase()+valueArr[0].substring(1).toLowerCase(); variable olarak atamazsak boyle yapabiliriz

            //6)Map'i update edebilmek icin array'i String olarak birlestirelim.Boylece Map'in formatina donusturmus oluyoruz
            String yeniValue=valueArr[0]+"-"+
                             valueArr[1]+"-"+
                             valueArr[2]+"-"+
                             valueArr[3]+"-"+
                             valueArr[4];


            //7)setValue() methodu ile guncellenen value'yu update edelim.
            eachEntry.setValue(yeniValue);//Her bir eachEntry'i setValue() methodu ile kalici olarak update etmis oluyoruz

        }


        return ogrenciMap;
    }


    // SORU:okulMap'deki tum soyisimleri buyuk harf yapan bir method olusturun
    public static Map<Integer, String> soyisimleriBuyukHarfyap(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer,String>> entrySeti=ogrenciMap.entrySet();

        String eachValue;
        String [] valueArr;

        //her bir entry'i ele almak icin for-each kullanalim
        for (Map.Entry<Integer,String> eachEntry:entrySeti
        ) {
            //her bir entry'deki value'yu alalim
            eachValue=eachEntry.getValue();

            //value'yu degistirebilmek icin array yapalim
            valueArr=eachValue.split("-"); //[Ali, Cem, 11, C, TM]

            //array[1] de bulunan soyisim bilgisini istenen formata getirelim
            valueArr[1]=valueArr[1].toUpperCase();

            //Map'i update edebilmek icin array'i String olarak birlestirelim
            String yeniValue=valueArr[0]+"-"+
                             valueArr[1]+"-"+
                             valueArr[2]+"-"+
                             valueArr[3]+"-"+
                             valueArr[4];


            //setValue() methodu ile guncellenen value'yu update edelim.
            eachEntry.setValue(yeniValue);

        }


        return ogrenciMap;
    }

    public static void isimdenOgrenciBulma(Map<Integer, String> ogrenciMap, String istenenIsim) {

        //values'leri al/ornek "Ali-Can-11-H-MF"
        Collection<String> valueCollection=ogrenciMap.values();

        //aldigim values'leri parcalayip icine koyacagim array olustur
        String [] valueArr;
        System.out.println("========"+istenenIsim + "  ogrenci Listesi"+"======");
        //herbir value'yu alalim
        for (String each: valueCollection
             ) {
            //array'e atama yapmak icin herbir value parcala
            valueArr=each.split("-");//[Ali, Can, 11, H, MF]

            //sartini yaz
            if(valueArr[0].equalsIgnoreCase(istenenIsim)){
                //soyisim, sinif, sube, bilgilerini yazdiran bir method olusturun.
                System.out.println(valueArr[1]+" "+valueArr[2]+" "+valueArr[3]);
            }
        }
    }

    public static void numaraliSubeListesi(Map<Integer, String> ogrenciMap, String istenenSube) {

        //key'leri al.ornek:[101, 102, 103, 104, 105, 106, 107, 108, 109, 110]
        Set<Integer> keySeti=ogrenciMap.keySet();

        //key'lerin value'lerini atayacagim String variable olustur
        String valueEach;
        //Stringi array'e cevirince atayacgim array olustur
        String [] valueArr;
        System.out.println("========"+istenenSube + " subesi ogrenci Listesi"+"======");

        //her bir key'e ulas esra
        for (Integer each :keySeti
             ) {
            //her bir value'ye ulas
            valueEach=ogrenciMap.get(each);//get(Object key).....(value)String "Ali-Cem-11-K-MF"
            //her bir value parcala
            valueArr=valueEach.split("-");//[Ali, Can, 11, H, MF]

            //Verilen subedeki ogrencilerin =Ali-Can-11-H-MF
            if(valueArr[3].equalsIgnoreCase(istenenSube)){
                //numara, isim, soyisim yazdiran bir method olusturun
                System.out.println(each+" "+ valueArr[0]+" "+valueArr[1]);

            }
        }

    }


    //Nested Map
    public static Map<String, Object> rezervasyonOlustur(String firstname, String lastname, int totalprice ,
                                                         boolean depositpaid, String checkin,
                                                         String checkout, String additionalneeds) {

          /*
           {
            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2023-07-21",
                   "checkout" : "2023-08-10"
                      },
            "additionalneeds" : "wi-fi"
             }
         */

        Map<String,Object> rezervasyonMap =new HashMap<>();//outer Map
        rezervasyonMap.put("firstname",firstname);
        rezervasyonMap.put("lastname",lastname);
        rezervasyonMap.put("totalprice",totalprice);
        rezervasyonMap.put("depositpaid",depositpaid);

        Map<String,String> innerMap=new HashMap<>();//inner Map'taki degerlere ulasmak icin yeni bir Map yaptik
        innerMap.put("checkin",checkin);
        innerMap.put("checkout",checkout);

        rezervasyonMap.put("bookingdates",innerMap);//value'sune Map olarak ekledik
        rezervasyonMap.put("additionalneeds",additionalneeds);
        //boylece tum data girislerini rezervasyon Map'ine yapmis olduk.

        return rezervasyonMap;


    }
}
