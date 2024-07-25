package day28_exceptions;

import day27_abstractClasses_interfaces.I08_Interface;

import java.util.ArrayList;
import java.util.List;

public class C01_ChildOfInterfaces implements I01_InterfaceIstisnaiDurum {
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }


    public static void main(String[] args) {


        System.out.println(I01_InterfaceIstisnaiDurum.methodIstisna2());//44
        //public static int methodIstisna2() methodu static oldugu icin direk interfaceismi ile ulasildi.

        //I01_InterfaceIstisnaiDurum.methodIstisna(); public default void methodIstisna() methodu static olmadigi icin ulasilamaz.

        C01_ChildOfInterfaces obj=new C01_ChildOfInterfaces();
        obj.methodIstisna();//default istisnai method.Obje uzerinden cagirinca static olmayan public default void methodIstisna() method geldi.
        obj.runnerMethod();//default istisnai method

        List<String> liste=new ArrayList<>();
        //List interface'dir ama icinde istisna methodlar da bulunur.
        //biz List'i child'i olan ArrayList uzerinden kullanabiliyoruz.

    }

   public void runnerMethod(){
        methodIstisna();
   }

}
