package day24_inheritance_constructorCall;

public class G_GrandParent {

    G_GrandParent(){//parametresiz constructor olusturuldu.

        System.out.println("GP parametresiz");
    }

    G_GrandParent(String str){//String parametreli constructor olusturuldu.

        System.out.println("GP String");
    }

    G_GrandParent(int sayi){//integer parametreli constructor olusturuldu.
        this("b"); //bu class'ta string parametreli cons. varsa oraya git.(cons call)
        System.out.println("GP int ");
    }

    G_GrandParent(boolean bl){//boolean parametreli constructor olusturuldu.

        this(5);//bu class'ta integer parametreli cons.varsa oraya git.(cons call)
        System.out.println("GP boolean");
    }


}
