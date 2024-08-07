package day24_inheritance_constructorCall;

public class I_Child extends H_Parent{

    I_Child(){//bu class'ta parametresiz cons olusturuldu

        System.out.println("C parametresiz");
    }

    I_Child(String str){//bu class'ta string parametreli cons olusturuldu
        super(5);//parent class'taki int parametreli constructor'a cons. call yapildi
        System.out.println("C String");
    }

    I_Child(int sayi){//bu class'ta int parametreli cons olusturuldu
        super("a");//parent class'taki string parametreli constructor'a cons. call yapildi
        System.out.println("C int");
    }

    I_Child(boolean bl){//bu class'ta boolean parametreli cons olusturuldu
        super(true);//parent class'taki boolean parametreli constructor'a cons. call yapildi
        System.out.println("C boolean");
    }

    public static void main(String[] args) {

        I_Child child4= new I_Child(true);
        //GP String
        //GP int
        //GP boolean
        //P boolean
        //C boolean

        I_Child child3 = new I_Child(3);
        //GP parametresiz
        //P parametresiz
        //P String
        //C int


        I_Child child2 = new I_Child("ali");
        //GP parametresiz
        //P int
        //C String


        I_Child child1 = new I_Child();
        //GP parametresiz
        //P parametresiz
        //C parametresiz


    }
    /*
         Biz bir class'da gorunur bir constructor olusturdugumuzda
        default constructor'in silindigi
        GIBI,
        eger extends kullanan bir class'daki
        herhangi bir constructor'in ilk satirina
        gorunur bir constructor call yazarsak(or: super(5) gibi)
        Java default super() constructor call'u siler.

     */
}
