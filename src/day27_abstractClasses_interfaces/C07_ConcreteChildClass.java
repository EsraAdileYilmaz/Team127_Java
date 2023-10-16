package day27_abstractClasses_interfaces;

public class C07_ConcreteChildClass extends C06_AbstractParent{

    /*
    Bir abstract zincirden sonra gelen ILK CONCRETE CLASS

    abstract KALAN TUM METHOD'lari implement ETMEK ZORUNDADIR
    */

    /*
    GP'deki method1() parent'ta concrete hale donustu.
    GP'de abstract method2() ve abstract method3() kaldi.

    Parent'ta ise abstract method5() ve abstract method6() kaldi.
    bunlar bu class tarafindan implement edilip concrete hale donusturulmek ZORUNDADIR.
     */


    @Override
    public void method2() {// GP'de abstract method2()

    }

    @Override
    public void method3() {// GP'de abstract method3()

    }

    @Override
    public int method5() {//Parent'ta abstract method5()
        return 0;
    }

    @Override
    public String method6() {//Parent'ta abstract method6()
        return null;
    }



}
