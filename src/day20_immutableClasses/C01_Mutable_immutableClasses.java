package day20_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_Mutable_immutableClasses {

    public static void main(String[] args) {

        /*
        Mutable classes=Degistirilebilir class'lardir.(Array'ler,ArrayList'ler)
        Immutable classes=Degistirilemez class'lardir.(String classes,Wrapper classes)

         */

        String s= "Java";

        String str = new String("Java Candir");

        System.out.println(str.toUpperCase());//JAVA CANDIR (str sadece bu satirda degisti orjinalinde hicbir degisiklik olmadi)
        System.out.println(str);//Java Candir (ilk olusturulan str degismedi)

        str.toLowerCase();//eger yazdirirsak sadece bu satirda degisir.

        /*
        Aslinda String'de her atama yaptigimizda,String class'ta yeni bir obje olusuyor
        ve biz atadigimiz degeri yeni objeye atamis oluyoruz.Eski objenin pointer'i
        siliniyor ve bir sure sonra garbage collector'lar yardimiyla bu eski obje
        imha ediliyor.
         */

        // String method'larinin yaptigi degisiklikler sadece o satir icin gecerlidir.
        // Yapilan degisikliklerin kalici olmasini istersek atama yapmaliyiz.

        List <String> isimler= new ArrayList<>();

        isimler.add("Senayda");
        isimler.add("Esra");
        isimler.add("Beytullah");
        System.out.println(isimler);//[Senayda, Esra, Beytullah]

        isimler.set(2,"Asli");
        System.out.println(isimler);//[Senayda, Esra, Asli]

        /*
        Burada da goruldugu uzere ArrayListler mutable classes'dir.Cunku kullanilan
        tum methodlar sonucunda yapilan degisiklikler kalici oluyor.
         */



    }

}
