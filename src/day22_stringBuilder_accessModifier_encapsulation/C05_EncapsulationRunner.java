package day22_stringBuilder_accessModifier_encapsulation;

public class C05_EncapsulationRunner {

    public static void main(String[] args) {

        C04_Encapsulation obj= new C04_Encapsulation();// bir obje olusturduk
        //Bu sayede diger classlardaki variable'lara ulasabiliriz.

        System.out.println(obj.getGorulebilsin());//Bu variable gorulebilir ama degistirilemez
        //getGorulebilsin methodunu sout ile gorebilirim.
        //Ancak methoda deger atanamadigi icin yeni deger atayamam.

        obj.setDegerAtanabilsin("Ali");
        //bu methodun return'u void oldugu icin yeni deger atayabilirsin.
        //ama goremezsin, atadigin degeri yazdiramazsin.

        //obj.setDegerAtanabilsin("esra").sout  (yazdirmayi kabul etmiyor.)
        //Bizim argument olarak yazdigimiz degerleri atama yapiyor.
        //Ama bizim gormemize izin vermiyor.



        obj.gorulebilirVeDegerAtanabilir ="Deneme";
        System.out.println(obj.gorulebilirVeDegerAtanabilir);//Deneme


        //getter and setter methodundan once
        //obj.sayi=20; sayi variable'i private oldugu icin  deger atanamaz
        //System.out.println(obj.sayi); sayi variable'i private oldugu icin yazdirilamaz

        obj.setSayi(20);
        System.out.println(obj.getSayi());// 20



    }
}
