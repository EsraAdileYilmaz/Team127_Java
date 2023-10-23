package day27_abstractClasses_interfaces;

public class C02_UysalChild extends C01_KuralciParent {


     /*
        Java bir parent class'in
        Child Class'lara belirlenen method'lari
        override etme mecburiyeti koyabilmesi icin
        OZEL BIR KONSEPT hazirlamistir.

        Eger siz parent class'da
        abstract bir method olusturursaniz
        child class'lar parent class'daki abstract method'lari OVERRIDE ETMEK ZORUNDA olur
     */

    //child class tum abstract class'lari override etti.
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public int method5() {
        return 0;
    }



}
