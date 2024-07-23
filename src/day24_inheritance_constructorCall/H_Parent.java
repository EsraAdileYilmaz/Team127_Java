package day24_inheritance_constructorCall;

public class H_Parent extends G_GrandParent{


    H_Parent(){//parametresiz constructor olusturuldu.

        System.out.println("P parametresiz");
    }

    H_Parent(String str){//String parametreli constructor olusturuldu
        this();//bu class'ta parametresiz cons. varsa oraya git.(cons call).yani  H_Parent(){} buraya goturur
               //this() const call yapildigi icin super() const call yapilamaz
               //ikisinden biri tercih edilir.
        System.out.println("P String");
    }

    H_Parent(int sayi){//integer parametreli constructor olusturuldu.
        System.out.println("P int");
    }

    H_Parent(boolean bl){//boolean parametreli constructor olusturuldu
        super(false);//parent class'taki boolean parametreli constructor'a cons. call yapildi
        System.out.println("P boolean");
    }

}
