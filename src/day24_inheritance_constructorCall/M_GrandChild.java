package day24_inheritance_constructorCall;

public class M_GrandChild extends K_Child{

    int sayi = 100;
    int yas = 23;

    String mahalle = "Birlik";
    String memleket = "Ankara";
    String arkadas = "Reyhan";

    public  void method1(){
        System.out.println("GC method1");
    }
    public  void method3(){
        System.out.println("GC method3");
    }
    public  void method4(){
        System.out.println("GC method4");
    }

    public void runnerMethod(){
        int sayi = 5;
        int sansliSayi= 44;

        System.out.println(sayi); // 5 bu scope daki sayi.Yani runnerMethod() icindeki sayi
        System.out.println(this.sayi); // 100 bu class'taki sayi.Class level de arar
        System.out.println(super.sayi); // 25 parent'taki sayiyi getirir. int sayi = 25;

        System.out.println(sinif); // 8
        System.out.println(isim); // Ali Can
        System.out.println(yas); // 23
        System.out.println(tel); // 5552353535

        System.out.println(this.sinif); // 8
        System.out.println(this.mahalle); // Birlik
        System.out.println(this.adres); // Cankaya
        this.method1(); // GC method1

        System.out.println(super.sinif); // 8
        System.out.println(super.isim); // Ali Can
        System.out.println(super.memleket); // Konya

        System.out.println(sansliSayi); // 44
        // System.out.println(this.sansliSayi); //Class level ve parentlarda sansliSayi olmadigi icin CTE verdi
        // System.out.println(super.sansliSayi);//parentlarda sansliSayi olmadigi icin CTE verdi

        System.out.println(arkadas); // Reyhan
        System.out.println(this.arkadas); // Reyhan
        //System.out.println(super.arkadas);//parentlarda arkadas olmadigi icin CTE verdi

        method2();//Parent method2
        this.method2(); // Parent method2
        super.method2(); // Parent method2

        method3(); // GC method3
        this.method3(); // GC method3
        super.method3() ; // Child method3
    }
    public static void main(String[] args) {
        /*
            Java bir variable'in degerini bulmak icin
            sirasiyla;
            1- icinde oldugumuz scope'a
            2- icinde oldugumuz class'in class level'ina
            3- parent'lara bakar.

           * Ama biz siralamaya uymadan
            direk class level'daki degerlere ulasmak istersek
            this.variableIsmi kullaniriz.

            * Ayrica yine siralamaya uymadan
            direk parentlar'taki degerlere ulasmak istersek
            super.variableIsmi kullaniriz.
         */

        M_GrandChild obj = new M_GrandChild();
        obj.runnerMethod();//runnerMethod() method call var.

    }


}
