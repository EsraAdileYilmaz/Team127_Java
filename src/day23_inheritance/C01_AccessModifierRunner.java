package day23_inheritance;

import day22_stringBuilder_accessModifier_encapsulation.C02_AccessModifier;

public class C01_AccessModifierRunner {

    public static void main(String[] args) {

        //Burada ise hem Class degisti ,hemde package degisti.
        //Buyuzden access modifier'i private olanlara,
        //         access modifier'i default olanlara,
        //         access modifier'i protected olanlara erisemiyoruz.


        C02_AccessModifier.marka="Opel";
        C02_AccessModifier.yil=2023;

        //C02_AccessModifier.renk="Kirmizi";
        //C02_AccessModifier.maxHiz=250;

        //C02_AccessModifier.model="Astra";
        //C02_AccessModifier.fiyat=2000;

        //C02_AccessModifier.seriNo= 1234; private oldugu icin baska class'tan kullanilamaz.
        //C02_AccessModifier.km=120000;  private oldugu icin baska class'tan kullanilamaz


        System.out.println(C02_AccessModifier.marka);
        System.out.println(C02_AccessModifier.yil);

        //System.out.println(C02_AccessModifier.renk);
        //System.out.println(C02_AccessModifier.maxHiz);

        //System.out.println(C02_AccessModifier.model);
        //System.out.println(C02_AccessModifier.fiyat);

        //System.out.println(C02_AccessModifier.seriNo);
        //System.out.println(C02_AccessModifier.km);
    }
}
