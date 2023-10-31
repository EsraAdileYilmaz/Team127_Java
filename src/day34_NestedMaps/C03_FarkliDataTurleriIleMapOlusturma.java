package day34_NestedMaps;

import day32_maps.MapMethodDepo;

import java.util.HashMap;
import java.util.Map;

public class C03_FarkliDataTurleriIleMapOlusturma {

    public static void main(String[] args) {

         /*
            Eger value olarak farkli data turlerinden degerler girilecekse
            Map olusturulurken Map<? , Object> secilebilir

            Eger value data turu olarak Object secilirse
            value'lara erismek istedigimizde
            casting yapmamiz gerekebilir
         */

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
            "additionalneeds" : "wi-fi" }
         */

        Map<String,Object> bookingMap=MapMethodDepo.rezervasyonOlustur("Hasan","Yan",300,
                                                  true,"2023-12-01","2023-12-10","wi-fi");

        System.out.println(bookingMap);
        //{
        // firstname=Hasan,
        // additionalneeds=wi-fi,
        // bookingdates={
        //               checkin=2023-12-01,
        //               checkout=2023-12-10
        //               },
        //totalprice=300,
        // depositpaid=true,
        // lastname=Yan
        // }

        Map<String,Object> bookingMap2=MapMethodDepo.rezervasyonOlustur("Esra","Yilmaz",
                                                       1000,true,"2024-10-12",
                                                       "2024-10-24","breakfast");

        System.out.println(bookingMap2);
        //{
        // firstname=Esra,
        // additionalneeds=breakfast,
        // bookingdates={
        //               checkin=2024-10-12,
        //               checkout=2024-10-24
        //               },
        //totalprice=1000,
        // depositpaid=true,
        // lastname=Yilmaz
        // }

        //SORU:firstname'i yazdirin
        System.out.println(bookingMap2.get("firstname"));//Esra

        //SORU:depositpaid'i yazdirin
        System.out.println(bookingMap2.get("depositpaid"));//true

        //SORU:checkin'i yazdirin
        bookingMap2.get("bookingdates");
        //bu bize bir Map donduruyor.buyuzden bizim bunu casting yaparak sorumlulugu almamiz lazim
        System.out.println(((Map) bookingMap2.get("bookingdates")).get("checkin"));//2024-10-12

        //SORU:checkout'u yazdirin
        System.out.println(((Map) bookingMap2.get("bookingdates")).get("checkout"));//2024-10-24

        //SORU:totalprice'i 300 olarak update edin.
        bookingMap2.put("totalprice",300);//boylece update edilmis oldu

        //SORU:checkin degerini 2023-10-18 olarak update edelim
        bookingMap2.get("bookingdates");//bu bana bir Map dondurur.casting yapmam lazim
        ((Map<String,String>)bookingMap2.get("bookingdates")).put("checkin","2023-10-18");

        System.out.println(bookingMap2);
        //{
        // firstname=Esra,
        // additionalneeds=breakfast,
        // bookingdates=
        //             {
        //             checkin=2023-10-18,
        //             checkout=2024-10-24
        //             },
        //totalprice=300,
        //depositpaid=true,
        //lastname=Yilmaz
        //}







    }
}
