package day28_exceptions;

public interface I01_InterfaceIstisnaiDurum {


    /*
        Yillardir devam eden bir projede,
        uzun zamandir kullanilan bir interface'de degisiklik yapilmasi gerektiginde
        bu interface'i gecmiste kullanmis olan tum class'lar
        bu degisiklikten etkilenecek
        ve tum class'larin gozden gecirilmesi ve duzenlenmesi gerekecektir.

        Bu sorunun asilmasi icin
        Java8 ile birlikte bir ISTISNA getirilmistir.

        interface'de olusturulan tum method'lar
        public ve abstract'tir.
        Dolayisiyla method body'si kabul etmez,
        abstract method'lar child class'lar tarafindan override edilmek ZORUNDADIR.

        Eger interface icerisinde bulunan bir method'un
        child class'lar tarafindan implement edilmesini mecburi olmaktan cikarmak istersek,
        method deklarasyonuna static veya default keyword'lerinden birini kullanir
        ve method'a body ekleriz.

        Bu istisna icin 2 farkli keyword belirlenmesinin sebebi=
        erisim yontemlerini ayirmak icindir.
        1-static olarak isaretlenen method'lara interface ismi ile heryerden ulasilabilir.
        2-default olarak isaretlenen method'lara;
            - static ortamlardan ulasmak isterseniz obje olusturmaniz gerekir,
            - static olmayan ortamlardan direk ulasilabilir.

     */

     public default void methodIstisna(){
         System.out.println("default istisnai method");
    }

    public static int methodIstisna2(){
         return 44;
    }

    void method1();
     int method2();
     String method3();
}
