package day27_abstractClasses_interfaces;

public class C07_ConcreteChildClass extends C06_AbstractParent{

    /*
    Bir abstract zincirden sonra gelen ILK CONCRETE CLASS,
    abstract KALAN TUM METHOD'lari implement ETMEK ZORUNDADIR.
    */

    /*
    GP'deki method1() parent'ta concrete class'a hale donustu.
    GP'de abstract method2() ve abstract method3() kaldi.

    Parent'ta ise abstract method5() ve abstract method6() kaldi.
    Kalan bu methodlar bu class tarafindan implement edilip ,
    concrete method'lara donusturulmek ZORUNDADIR.
     */


    @Override
    public void method2() {// GP'deki abstract method2() burada concretelestirildi

    }

    @Override
    public void method3() {// GP'deki abstract method3() burada concretelestirildi

    }

    @Override
    public int method5() {//Parent'taki abstract method5() burada concretelestirildi

        return 0;
    }

    @Override
    public String method6() {//Parent'taki abstract method6() burada concretelestirildi

        return null;
    }



}
