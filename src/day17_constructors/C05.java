package day17_constructors;

public class C05 {

    //default constructor ile ayni islevi yapan
    //gorunur bir constructor olusturalim.
    C05(){
        System.out.println("Merhaba, ben constructor.");
    }
    // Bu constructor gorunur oldugu icin
    //buna default constructor degil
    //PARAMETRESIZ CONSTRUCTOR denir.
    //Default constructorlarin body'si bos olur.
    //Parametresiz constructorlarin body'sine kod ekleyebiliriz.

    int sayi =0;
    String str;

    public void method1(){

        System.out.println("C05 method1 calisti");
    }

    public void C05(){
        //Bu bir methoddur. Method isimleri kucuk harfle baslamalidir.
        //Ama kural deil convention(genel kabul) dir.
        //Bir kod blogunun return type'i(void,int vs) varsa methoddur.


        /*
        public asd(){

        }

        c05(){

        }
        Invalid method declaration;return type required
        Ismi class adi ile ayni deil, olsa olsa method olabilir
        ama method icin return type yazilmalidir.
         */
    }
}
