package day31_collections;

import java.util.HashSet;
import java.util.Set;

public class C02_Set {

    public static void main(String[] args) {

        Set <String> harfler= new HashSet<>();//Set unique degerler icerir ve index yapisi yoktur.
        System.out.println(harfler.hashCode());// 0 (set'in ici bosken)

        harfler.add("B");
        harfler.add("Ali");
        System.out.println(harfler.hashCode());//65984





    }
}
