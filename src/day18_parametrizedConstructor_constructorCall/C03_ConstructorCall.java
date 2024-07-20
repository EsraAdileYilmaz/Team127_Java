package day18_parametrizedConstructor_constructorCall;

public class C03_ConstructorCall {

    C03_ConstructorCall(){
        //constructor call= this(parametreler) constructor'daki ilk kod olmalidir.Ilk satirina yazilmalidir
        this("Java");
        //this(5);//Call to 'this()' must be first statement in constructor body
        System.out.println("Parametresiz constructor calisti");
    }

    C03_ConstructorCall(int sayi){

        System.out.println("int parametreli constructor calisti");
    }

    C03_ConstructorCall(String metin){

        //C03_ConstructorCall();//Method call Syntax'i oldugundan java bu isimde method arar
        this(6);//constructor call syntax'i.
                    //constructor call esnasinda constructor adini deil this(istenen parametreler) yazariz.

        System.out.println("String parametreli constructor calisti");
    }

    public static void main(String[] args) {

        C03_ConstructorCall obj1=new C03_ConstructorCall("esra");
        //int parametreli constructor calisti
        //String parametreli constructor calisti

        C03_ConstructorCall obj2=new C03_ConstructorCall();
        //int parametreli constructor calisti
        //String parametreli constructor calisti
        //Parametresiz constructor calisti
    }
}
