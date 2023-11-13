package day35_maps_lesQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C03_ForLoop {

    public static void main(String[] args) {

        /*
        soru --- Anne, baba ve çocuktan oluşan çekirdek ailenin
                 Süper aile olup olmadığını bulan kodu yazın.
                 isimleri kullanıcıdan isteyin.
                 (Çocuğun ismindeki sessiz harflerin hepsi,
                 anne ve babanın isimlerinde var ise bu aile süper ailedir.
                 (Not: anne ve baba isminden en az bir tane olmalı.).
                 örn1: baba adı = "Halil", anne adı= "Merve", çocuk adı= "Veli" >> Süper aile.
                 ("v" anneden, "l" babadan)
                 örn2: baba adı = "Murat", anne adı= "Songül", çocuk adı= "Mert" >>
                 Süper aile değil. Anneden harf yok.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sirasi ile anne,baba ve cocugun isimlerini giriniz");
        String anne = scanner.nextLine();
        String baba = scanner.nextLine();
        String cocuk= scanner.nextLine();

       //iki isimli olurlarsa isimler arasindaki boslugu silmek ve
        // kucuk-buyuk harf durumu icin;
        String anne1  = anne.toLowerCase().replaceAll("\\s","");
        String baba1  = baba.toLowerCase().replaceAll("\\s","");
        String cocuk1 = cocuk.toLowerCase().replaceAll("\\s","");

       //String isimleri manipule etmek icin split() ile array'e cevirdik;
        String[] anneHarfler = anne1.split("");
        String[] babaHarfler = baba1.split("");
        String[] cocukHarfler = cocuk1.split("");

       //Array'e cevrilen isimleri rahat kullanmak icin List'e ceviricez;
        List<String> anneSessizler = new ArrayList<>();//[]
        List<String> babaSessizler = new ArrayList<>();
        List<String> cocukSessizler = new ArrayList<>();

        //sessiz harfleri karsilastiracagimiz icin sesli harflerden kurtulmamiz gerekiyor.
        String[] sesliHarfler ={"a","e","i","ı","o","ö","u","ü"};//sesli harfler array'i
        //sesli harfler array'ini asList() methodu ile List'e cevirdik.
        List<String> sesliHarflerList = Arrays.asList(sesliHarfler);//[a,"e","i","ı","o","ö","u","ü"]


        for (String each:anneHarfler
        ) {

            if (!sesliHarflerList.contains(each)){//sesli harfler icermiyorsa;
                anneSessizler.add(each);//anne isminin sessiz harflerini anneSessizler list'ine ekle [s,r,d,l]
            }
        }

        for (String each:babaHarfler
        ) {

            if (!sesliHarflerList.contains(each)){//sesli harfler icermiyorsa;
                babaSessizler.add(each);//baba isminin sessiz harflerini babaSessizler list'ine ekle
            }
        }

        for (String each:cocukHarfler
        ) {

            if (!sesliHarflerList.contains(each)){//sesli harfler icermiyorsa;
                cocukSessizler.add(each);//cocuk isminin sessiz harflerini cocukSessizler list'ine ekle
            }
        }

        // cocugun ismindeki harfleri anne ve babanin sessiz harfleri ile karsilastirip
        // ortak harfleri sayalim.

        boolean anneOrtakHarf = false;
        boolean babaOrtakHarf = false;

        String cocukHarf="";
        boolean cocukTumHarfler = true;//cocugun tum harfleri anne veya babada varsa true olcak yoksa false olcak
        boolean cocukHarfKontrol = false;//cocugun bir harfi anne veya babada varsa true olcak

        /*
         List<String> anneSessizler = new ArrayList<>();[srdl]
        List<String> babaSessizler = new ArrayList<>();
        List<String> cocukSessizler = new ArrayList<>();
         */
        for (int i = 0; i < cocukSessizler.size() ; i++) {//cocugun sessiz harfleri List'inin uzunlugunca

            cocukHarf = cocukSessizler.get(i);
            //cocukSessizler list'inden herbir sessiz harfini getir

            if (anneSessizler.contains(cocukHarf)){//annenin sessizleri,cocugun herbir sessiz harfini iceriyorsa
                anneOrtakHarf =true;//anne ile ortak sessiz harf var anneortak++;
                cocukHarfKontrol = true;//yani en az 1 harf anne ile ortak
            }

            if (babaSessizler.contains(cocukHarf)){//babanin sessizleri,cocugun herbir sessiz harfini iceriyorsa
                babaOrtakHarf = true;//
                cocukHarfKontrol = true;//yani en az 1 harf baba ile ortak
            }

            if (!cocukHarfKontrol){ // (cocukHarfKontrol == false) yerine (!cocukHarfKontrol) yaptik
                //yani cocugun herbir harfi anne ve babada yoksa;

                cocukTumHarfler = false;//yani en az 1 harf ortak deil.
            }

            cocukHarfKontrol = false;//loop'ta herbirini tekrarlamasi icin

        }

        // artik anne ve baba isimleri ile ortak sessiz harf olup olmadigini biliyorum,
        // anneOrtakHarf =true  ve babaOrtakHarf = true ise anne babadan harf var demektir


        // artik cocugun her harfinin anne babada olup olmadigini biliyorum
        // cocukTumHarf = false ise tum harfler anne babada yok
        // cocukTumHarf = true ise tum harfler anne babada var


        if (anneOrtakHarf && babaOrtakHarf && cocukTumHarfler){
          //if(anneOrtakHarf==true && babaOrtakHarf==true && cocukHerHarf==true)
            System.out.println("Super aile");
        }else{
            System.out.println("Super aile degil");
        }
    }
}
