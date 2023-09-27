package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_remove {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");

        List <String> silinecekler2=new ArrayList<>();
        silinecekler2.add("Deniz");
        silinecekler2.add("Gulnur");

        System.out.println(isimler.remove(2));//Esra
        System.out.println(isimler);//[Deniz, Omer, Hamza, Basak]

        System.out.println(isimler.remove("Hamza"));//true yani Hamza'yi sildim
        System.out.println(isimler);//[Deniz, Omer, Basak]

        System.out.println(isimler.removeAll(silinecekler2));//true yani Deniz'i sildi/ isimlerde degisiklik olursa true
        System.out.println(isimler);//[Omer, Basak]

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(8);
        System.out.println(sayilar);//[3, 2, 8]

        // Eger List sayilardan olusuyorsa
        // remove(2) yazdigimizda 2'nin element mi yoksa index mi olacagini netlestirmek gerekir.
        // Java bu durumu netlestirmek icin,
        // sayilardan olusan list'lerde yazilan sayiyi INDEX olarak kabul eder.

        System.out.println(sayilar.remove(2));//8 yani 2.indexteki 8'i sildi
        System.out.println(sayilar);//[3, 2]

        // Eger biz obje olan 2'yi silmek istiyorsak ve index'ini bilmiyorsak
        // Once silmek istedigimiz elementi bir obje (non-primitive) olarak tanimlamaliyiz.
        //Yani bir variable olarak atayabiliriz.

        Integer silinecekSayi =2;
        System.out.println(sayilar.remove(silinecekSayi));//true
        System.out.println(sayilar);//[3]

        sayilar.clear();// Bu method list'in icindekileri komple siler.
        System.out.println(sayilar);//[] bos bir list olusur



    }
}
