package day04_ifStatements;

public class C01_BagimsizIfCumleleri {
    public static void main(String[] args) {

        /*
        Bir sayi araligi verilmisse &&, aralik disi verilmisse || kullaniriz.
        Ornegin:sayi>=10 && sayi<100   2 basamakli sayilar icin
                sayi>=10 || sayi<100   2 basamakli olmayan sayilar icin kullanilir.
         */

          /*
            if(SART)=> SART =BOOLEAN OLMAK ZORUNDA.
            Bagimsiz if cumleleri kodun geriye kalani ile ilgilenmez
            sadece kendi sartina odaklanir,
            birden fazla bagimsiz if cumlesi varsa
            butun if body'lerini calistiran durumlar olabilecegi gibi
            hicbir if body'sinin calismayacagi durumlar da olabilir.

         */


        int a=123;
        int b=44;

        //a b'den buyuk mu?
        if(a>b){
            System.out.println("a b'den buyuk");
        }

        //a cift sayi mi?
        if(a%2 == 0){
            System.out.println("a cift sayi");
        }

        //b 5 ile tam bolunebiliyor mu?
        if(b%5 == 0){
            System.out.println("b 5 ile tam bolunur");
        }

        //a 3 basamakli bir sayi mi?
        if(100<=a && a<=999){
            System.out.println("a sayisi 3 basamakli bir sayidir");
        }

        //a ile b'nin toplami 100'den buyuk mu?
        /*
        Bazen if 'in boolean sarti onceden olusturulmus olabilir.
         */
        boolean sart=a+b> 100;
        System.out.println(sart); //true

        if(sart){
            System.out.println("a ile b'nin toplami 100 den buyuk");
        }

        if(true){
            System.out.println("Bu if body'si her zaman calisir");
        }

        if(false){
            System.out.println("Bu if body'si hicbir zaman calismaz");
        }

    }
}
