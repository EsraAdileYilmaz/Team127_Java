package day12_scope;

public class C02_Scope_LocalVariables {

      /*
        scope=kapsam
        Variable scope=variable'a nereden ulasilabildigi,nereden kullanilabildigini gosterir.
        Method scope=methodun kapsami ,nereden baslar nerede biter.
        Kod blogu=Methodlar,loop donguleri birer kod blogudur.

        Bir method veya kod blogu icerisinde olusturulan variable'lara LOCAL VARIABLE denir
        ve local variable'larin scope'u icerisinde olusturulduklari kod blogudur.

        Bir method icindeki variable'lar sadece o method icinde kullanilirlar.Class
        icindeki diger methodlarda KULLANILAMAZ.

        Loop'lar da bagimsiz kod bloklaridir.
        Loop icerisinde olusturulan variable'larin scope'u
        icerisinde olusturulduklari kod blogu olan loop ile sinirlidir.
        Yani loop icerisinde olusturulan local variable'lar
        loop disinda KULLANILAMAZ.
         */




    public static void main(String[] args) {

        int sayi = 20;
        // System.out.println(str);
        // System.out.println(bl);

        String s= "Hava";


        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            String str = "Java";
            str += i ;//Java kelimesinin sonuna sayilari ekler
            s+=i;

        }

        // System.out.println(str); loop un icinde
        // System.out.println(i); loop un icinde
        System.out.println(s);

    }
    public static void staticMethod(){
        // System.out.println(sayi);
        String str = "Java";
        // System.out.println(bl);
    }


    public void staticOlmayanMethod(){
        // System.out.println(sayi);
        // str= "Tava";
        boolean bl =true;
    }


}
