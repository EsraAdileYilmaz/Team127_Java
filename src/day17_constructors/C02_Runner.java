package day17_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Runner {

    public static void main(String[] args) {

        /*

        Constructor: Bir class'tan obje olusturmak istedigimizde o objeye
        olusturuldugu class'daki variable ve methodlarla ilgili ilk atamayi
        (initialize) yapan yapidir.


         */


        C01 obj =new C01(); //C01 class'indan bir obje olusturdum.
        //C01 class'indaki tum variable'lara ve methodlara bu obje yardimiyla ulasabilirim.

        System.out.println(obj.sayi);

        //Bana rastgele bir sayi lazim.
        obj.rastgeleSayiUret(); //Bugunku sansli sayi: 66 (her seferinde farkli bir sayi verir.)


        //Bugun ne pisirsem?
        obj.bugunNePisireyim();//Bugunun yemek teklifi : Cacik (her seferinde farkli bir yemek teklifi verir.)

        Scanner scanner=new Scanner(System.in); //burda scanner class'indan bir obje olusturduk.

        String str=new String("Java candir.");// burda String class'indan bir obje olusturduk.
        // ve bu obje sayesinde hazirlanmis hazir methodlari kullanabiliriz.

        List <Integer> sayilar=new ArrayList<>();


               C01   obj2   =   new     C01();
        //C01 :Class adi
        //obj2 :obje adi
        //= atama isareti
        //new: keyword (obje olustururken mutlaka kullanilmali.)
        //C01() : CONSTRUCTOR iste bu C01 class'indan obje olusturan ve o class'taki tum ozellikleri getiren yapidir.





    }
}
