package day35_Maps_GenelTekrar;

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

       //iki isimli olurlarsa isimler arasindaki bosluklari silmek ve
        // kucuk-buyuk harf durumu icin;
        String anneB  = anne.toLowerCase().replaceAll("\\s","");
        String babaB  = baba.toLowerCase().replaceAll("\\s","");
        String cocukB = cocuk.toLowerCase().replaceAll("\\s","");

       //String isimleri manipule etmek icin split() ile array'e cevirdik;
        String[] anneHarfler = anneB.split("");
        String[] babaHarfler = babaB.split("");
        String[] cocukHarfler = cocukB.split("");

       //Array'e cevrilen isimleri rahat kullanmak icin List'e ceviricez;
        List<String> anneSessizler = new ArrayList<>();
        List<String> babaSessizler = new ArrayList<>();
        List<String> cocukSessizler = new ArrayList<>();

        //sessiz harfleri karsilastiracagimiz icin sesli harflerden kurtulmamiz gerekiyor.
        String[] sesliHarfler ={"a","e","i","ı","o","ö","u","ü"};
        List<String> sesliHarflerList = Arrays.asList(sesliHarfler);

        for (String each:anneHarfler
        ) {

            if (!sesliHarflerList.contains(each)){//sesli harfler icermiyorsa
                anneSessizler.add(each);//anne isminin sessiz harflerini list'e ekle
            }
        }

        for (String each:babaHarfler
        ) {

            if (!sesliHarflerList.contains(each)){//sesli harfler icermiyorsa
                babaSessizler.add(each);//baba isminin sessiz harflerini list'e ekle
            }
        }

        for (String each:cocukHarfler
        ) {

            if (!sesliHarflerList.contains(each)){//sesli harfler icermiyorsa
                cocukSessizler.add(each);//cocuk isminin sessiz harflerini list'e ekle
            }
        }

        // cocugun ismindeki harfleri anne ve babanin harfleri ile karsilastirip
        // ortak harfleri sayalim

        boolean anneOrtakHarf = false;
        boolean babaOrtakHarf = false;

        String cocukHarf="";
        boolean cocukHerHarf = true;//cocugun tum harfleri anne veya babada varsa true olcak yoksa false olcak
        boolean cocukHarfKontrol = false;//cocugun bir harfi anne veya babada varsa true olcak

        for (int i = 0; i < cocukSessizler.size() ; i++) {//cocugun sessiz harflerinin uzunlugunca

            cocukHarf = cocukSessizler.get(i);//herbir sessiz harfini getir

            if (anneSessizler.contains(cocukHarf)){//annenin sessizleri,cocugun sessizlerini iceriyorsa
                anneOrtakHarf =true;
                cocukHarfKontrol = true;//yani en az 1 harf anne ile ortak
            }

            if (babaSessizler.contains(cocukHarf)){//babanin sessizleri,cocugun sessizlerini iceriyorsa
                babaOrtakHarf = true;
                cocukHarfKontrol = true;//yani en az 1 harf anne ile ortak
            }

            if (!cocukHarfKontrol){ // (cocukHarfKontrol == false) yerine (!cocukHarfKontrol)
                // if parantezinde true veya false olmali, cocukHarfKontrol zaten boolean
                cocukHerHarf = false;//yani en az 1 harf ortak deil

            }

            cocukHarfKontrol = false;

        }

        // artik anne ve baba isimleri ile ortak sessiz harf olup olmadigini biliyorum,
        // anneOrtakHarf =true  ve babaOrtakHarf = true ise anne babadan harf var demektir


        // artik cocugun her harfinin anne babada olup olmadigini biliyorum
        // cocukHerHarf = false ise tum harfler anne babada yok
        // cocukHerHarf = true ise tum harfler anne babada var


        if (anneOrtakHarf && babaOrtakHarf && cocukHerHarf){
          //(anneOrtakHarf==true && babaOrtakHarf==true && cocukHerHarf==true)
            System.out.println("Super aile");
        }else{
            System.out.println("Super aile degil");
        }
    }
}
