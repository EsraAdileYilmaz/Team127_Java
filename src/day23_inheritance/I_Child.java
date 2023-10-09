package day23_inheritance;

public class I_Child extends H_Parent{

    public static void main(String[] args) {

        I_Child child1=new I_Child();//kendi class'indan bir obje olusturduk

        //child1.araba (araba variable'i private oldugu icin ulasamadik)
        System.out.println(child1.kasa);
        //burda sariya boyadi cunku kasa variable'i static oldugu icin
        //objeye gerek olmadan ulasilabilir.yani objeye bagli deildir.
        kasa="75";
        System.out.println(kasa);//75


        // default access modifier normalde inheritance icin uygun degildir.
        // ama bu class parent'i ile ayni package'da oldugu icin kullanilabilir.
        // Parent baska package'da olursa,child class
        // parent class'daki default access modifier'a sahip
        // class uyelerine ulasamaz.
        child1.sayi=34;
        System.out.println(child1.adres);//Cankaya
    }
}
