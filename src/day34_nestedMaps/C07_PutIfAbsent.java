package day34_nestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C07_PutIfAbsent {

    public static void main(String[] args) {

        //Soru : Verilen bir array’de kullanilan harfleri ve kacar defa kullanildigini yazdirin.
        //String[] input = {"a","b","c","d","e","c","d","b","e","a","c","b","d","a"} ;
        //output : a kullanimi : 3 adet
        //	       b kullanimi : 3 adet
        //	       c kullanimi : 3 adet
        //	       d kullanimi : 3 adet
        //	       e kullanimi : 2 adet

        String[] input = {"a","b","c","d","e","c","d","b","e","a","c","b","d","a"} ;
        Map<String , Integer> kullanimMiktarlariMap = new TreeMap<>();

        for (String each : input) {//verileri array'den aliyoruz

            //each'in getirdigi eleman varsa value'sunu 1 artir.
            kullanimMiktarlariMap.computeIfPresent(each,(k,v)-> v+1);

            //each'in getirdigi eleman yoksa o elemani ekle ve value'sune 1 yaz.
            kullanimMiktarlariMap.putIfAbsent(each,1);


        }

        System.out.println(kullanimMiktarlariMap); // {a=3, b=3, c=3, d=3, e=2}
    }

}
