package day27_abstractClasses_interfaces;

public class K12_ChildOfInterfaces implements I08_Interface,I10_Interface{

    public void method1(){
        // method1() hem I08 ve hemde I10 da var.
        // her ikisinde olsa da, ikisininde return type'i void oldugundan
        // hangisini implement ettigimizin bir onemi yoktur.
    }

    public void method2(){
        // I08'den aldik
    }

    public void method3(){
        // I10'dan aldik
    }

    public String method4(){
        // I08'den aldik
        return null;
    }
    public int method5(){
        // birden fazla interface'i implement ettigimizde,
        // birden fazla interface'de ayni isimde method varsa,
        // EGER return type'lari ayni ise sorun olmaz,
        // ama return type'lar farkli ise bir karar vermemiz gerekir:
        //  1- ya iki interface'den birini implement etmekten vazgececegiz.
        //  2- veya mumkunse o interface'lerde degistirme yapacagiz.
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(I08_Interface.sayi1); // 20 (burada iki interface'deki sayi1 variable'indan birini sectik.)
        // sayi2 = 30;
        // interface'lerdeki tum variable'lar final oldugundan, sonradan deger atanamaz.

        System.out.println(I10_Interface.isim); // veli Cem
        //burada da iki interface'deki isim variable'indan birini sectik.
    }

}
