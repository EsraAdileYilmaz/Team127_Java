package day23_inheritance;

import day22_stringBuilder_accessModifier_encapsulation.C02_AccessModifier;

public class C02_AccessModifierChildRunner extends C02_AccessModifier {
    //day22 package'nin icindeki C02 class'i parent class secildi.
    //C02_AccessModifierChildRunner class'ini extends keywordu ile day22 packege'nin C02_AccessModifier class'inin child class'i yapiyoruz.
    //C02_AccessModifierChildRunner= Child
    //C02_AccessModifier = Parent

    public static void main(String[] args) {

        //Bu class'i C02_AccessModifier class'inin child'i yapinca;
        // access modifier'i protected olanlara erisebiliyoruz.
        // Ayrica access modifier'i public olanlara erisebiliyoruz.


        C02_AccessModifier.marka="Opel";
        C02_AccessModifier.yil=2023;

        C02_AccessModifier.renk="Kirmizi";
        C02_AccessModifier.maxHiz=250;

        //C02_AccessModifier.model="Astra";
        //C02_AccessModifier.fiyat=2000;

        //C02_AccessModifier.seriNo= 1234; private oldugu icin kendi class'inin disindan kullanilamaz.
        //C02_AccessModifier.km=120000;  private oldugu icin kendi class'inin disindan kullanilamaz.


        System.out.println(C02_AccessModifier.marka);
        System.out.println(C02_AccessModifier.yil);

        System.out.println(C02_AccessModifier.renk);
        System.out.println(C02_AccessModifier.maxHiz);

        //System.out.println(C02_AccessModifier.model);
        //System.out.println(C02_AccessModifier.fiyat);

        //System.out.println(C02_AccessModifier.seriNo);
        //System.out.println(C02_AccessModifier.km);
    }
}
