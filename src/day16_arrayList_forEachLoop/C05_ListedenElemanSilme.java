package day16_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_ListedenElemanSilme {

    public static void main(String[] args) {

        //Soru 3- Verilen String bir listede
        //        istenmeyen harf iceren elementleri silip,
        //        kalan kismini list olarak bize donduren bir method olusturun.


        /*
            Listenin elemanlarini index ile kontrol edip
            silmemiz isteniyorsa,
            silme islemi yaptigimizda aradan bir element cikarilacagi icin,
            index bir elemani atlar.

            Bunu engellemek icin;
                1- silme yapinca i bir azaltilabilir,
                2- verilen listede silme yapilmaz. Yeni bir liste olusturulup
                  silinmeyecek elemanlar yeni listeye eklenebilir.
         */

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");
        isimler.add("Ayca");
        isimler.add("Mehmet");

        String silinecekHarf = "a";


        //method call yapalim
        System.out.println(istenmeyenleriSil(isimler, silinecekHarf));//[Deniz, Omer, Mehmet] 1.method
        System.out.println(silinmeyeceklerList(isimler,silinecekHarf));//[Deniz, Omer, Mehmet] 2.method

    }
    public  static List<String> istenmeyenleriSil(List<String> isimler,String silinecekHarf){

        for (int i = 0; i <isimler.size() ; i++) {

            if( isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())){//buldugu tum a'lari getirecek

                isimler.remove(isimler.get(i)); //icinde tum A bulunanlari silecek
                i--;//elementi silince bir oncekinden tekrar kontrol etmesi icin indexi 1 azaltiyoruz
            }
        }

        return isimler;


    }

    public  static List<String> silinmeyeceklerList(List<String> isimler,String silinecekHarf){

        List<String> silinmeyeceklerListesi = new ArrayList<>();

        for (int i = 0; i < isimler.size() ; i++) {
            if (!isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())){//isimler listesindeki elementlerden silinecek harfi icermeyeni
                silinmeyeceklerListesi.add(isimler.get(i));                          //silinmeyeceklerListesi'ne ekle
            }

        }

        return silinmeyeceklerListesi;
    }
}
