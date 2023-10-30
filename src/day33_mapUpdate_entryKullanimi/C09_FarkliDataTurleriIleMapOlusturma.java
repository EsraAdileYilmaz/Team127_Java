package day33_mapUpdate_entryKullanimi;

import java.util.HashMap;
import java.util.Map;

public class C09_FarkliDataTurleriIleMapOlusturma {

    public static void main(String[] args) {

         /*
                            {
                  id: 101,
                  title: 'foo',
                  body: 'bar',
                  userId: 1 ,
                  isActive: true ,
                  initial : A,
                }
         */

        Map<String,Object> ornekMap=new HashMap<>();
        //values'leri Object class'indan atadigimiz icin values'leri kullanmak istersek;
        //her seferinde casting islemi yapmamiz gerekir.

        ornekMap.put("id",101);
        ornekMap.put("title","foo");
        ornekMap.put("body","bar");
        ornekMap.put("userId",1);
        ornekMap.put("isActive",true);
        ornekMap.put("initial",'A');

        System.out.println(ornekMap);
        //{initial=A, id=101, title=foo, body=bar, isActive=true, userId=1}

        //SORU:body key'inin value'sunu buyuk harf olarak yazdirin.
        System.out.println(((String)ornekMap.get("body")).toUpperCase());//BAR
        String body=((String)ornekMap.get("body")).toUpperCase();
        //get() methodu Object dondurdugu icin (String)'e casting yapmak ZORUNDAYIZ.
        System.out.println(((String)ornekMap.get("title")).toUpperCase());//FOO

        //SORU:id'yi 1 artir
        System.out.println(ornekMap.get("id"));//101 (once value'nun ne oldugunu int,String vs gormek istiyorum)
        Integer idDeger=(Integer)ornekMap.get("id");
        ornekMap.put("id",idDeger+1);
        System.out.println(ornekMap);//{initial=A, id=102, title=foo, body=bar, isActive=true, userId=1}


        //SORU: initial key'ine ait value bir buyuk harf mi ?
        //isUpperCase() methodu ile (buyuk mu?) sorusuna cvp buluruz.true veya false dondurur
        System.out.println(Character.isUpperCase((Character) ornekMap.get("initial")));
        //value'yu Character'e cevir ve buyuk mu kontrol et.

        //SORU:userId'nin value'sunu 10 artiralim.
        System.out.println(ornekMap.get("userId"));//1 (once value'nun ne oldugunu int,String vs gormek istiyorum)
        Integer userId=(Integer)ornekMap.get("userId");//int oldugu gorulen value'yu int'e cast edilir.
        ornekMap.put("userId",userId+10);
        System.out.println(ornekMap);
        //{initial=A, id=102, title=foo, body=bar, isActive=true, userId=11}




        

    }
}
