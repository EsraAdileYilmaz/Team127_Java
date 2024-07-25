package day26_overriding_polyMorphism;

public class C02_Child extends C01_Parent{

    public void method1(){
        // Bir method'un overriding yapmasi icin
        // parent class'daki method ile
        // ayni SIGNATURE'a sahip olmalidir.
    }

    @Override
    public void method1(String str) {
        //Overriding method'u intelliJ'e olusturtunca; Code=>Generate=>Override methods=>Method sec
        // Overriding method'u intelliJ'e olusturtunca
        // otomatik olarak @Override notasyonu ekliyor.
        // Bu notasyonu kullanmak zorunlu degildir.
        // Ama kullanmanin bir artisi var.
        // @Override notasyonu kullanildiginda parent class'daki
        // overridden method'u takip eder.
        // Eger overridden method silinir veya signature degistirilirse
        // CTE verir

    }

    public void method2() {
        super.method2();
        // Herhangi bir obje icin
        // ya overriding method veya overridden method calisir.
        // EGER her iki methodunda calismasini isterseniz;
        // overriding method'un icine
        // super.overriddenMethod() yazabilirsiniz.
    }
    /*
    public void method3(){

    }
    final keyword kullanildigi class uyesinin DEGISTIRILEMEYECEGINI belirtir.
    overridding ise direk parent class'daki method'u
    degistirerek child class'a uyarlamaktir.

    final method'lar OVERRIDE EDILEMEZLER.
     */

    public static void method4(){
        // static methodlar objeden bagimsizdirlar.
        // static method'lari cagirmak icin obje kullanilmaz.
        // static method'lar OVERRIDE EDILEMEZLER.
        // zaten yanda OK da cikmadi.
    }


    public void method5(){
        // private bir method'a class disindan ulasilamaz.
        // child class'dan da olsa
        // parent'daki private method'a ulasilamadigindan,
        // child class'daki method5 tamamen bagimsiz bir method olur.
        // overriding method olmaz.
    }


}
