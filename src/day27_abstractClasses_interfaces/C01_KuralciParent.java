package day27_abstractClasses_interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class C01_KuralciParent {//bu class abstract bir class'tir

        /*
        1- bir class'in child class'lari override etmeye zorlayacagi
           method'lari abstract olarak tanimlamasi gerekir.
        2- bir class'in abstract method'lar barindirabilmesi icin
           kendisinin de abstract olarak tanimlanmasi gerekir.
        3- abstract method'lar child class'larin OVERRIDE etmesi icin olusturulur
           dolayisiyla body'ye ihtiyaclari yoktur.
        4- bir abstract class abstract method'lar barindirdigi gibi
           abstract olmayan (concrete) method'lar da bulundurabilir.
           buna partial abstraction denir.
        5- abstract class'da bulunan concrete method'lar
           child class'lar tarafindan overide EDILMEK ZORUNDA DEGILDIR.
        6- abstract class'lar class olduklari icin constructor'lari vardir
           AMA iclerinde abstract method'lar bulundugundan
           abstract class'lardan OBJE OLUSTURULAMAZ.
     */


    public abstract void method1();// abstract bir methoddur.buyuzden body'si yoktur.

    public abstract void method2();// abstract bir methoddur.buyuzden body'si yoktur.

    public abstract void method3();// abstract bir methoddur.buyuzden body'si yoktur.

    public void method4(){ // bu method concrete yani normal bir methoddur.body' si vardir

    }

    public abstract int method5();// abstract bir methoddur.buyuzden body'si yoktur.

    public static void main(String[] args) {

        //C01_KuralciParent obj = new C01_KuralciParent();
        // obj.method1();

        List<String > isimler = new ArrayList<>();
        //constructor kismina ArrayList yerine List yazdigimizda java diyorki List bir abstract class'dir
        //buyuzden obje olusturamazsin.onun icin List'in child class'i olan ArrayList'i yaziyoruz.
    }

}
