package day15_multiDimensionalArrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C10_set {

    public static void main(String[] args) {

        /*
        ArrayList' deki get() methodu parantez icine yazilan indexteki elemani dondurur.
        ArrayList' deki set() methodu bir elementi UPDATE (yeni deger atamak) icin kullanilir
        bu methodda eski deger silinip yerine yeni deger atanir.
         */


        List <String> isimler=new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");
        System.out.println(isimler);//[Deniz, Omer, Esra, Hamza, Basak]

        System.out.println(isimler.get(1));//Omer (list'teki 1.indexi getirir)
        System.out.println(isimler.get(2));//Esra
        //System.out.println(isimler.get(8));//IndexOutOfBoundsException

        isimler.add(3,"Azim");
        System.out.println(isimler);//[Deniz, Omer, Esra, Azim, Hamza, Basak]

        isimler.set(3,"Gulnur");
        System.out.println(isimler);//[Deniz, Omer, Esra, Gulnur, Hamza, Basak]


        // Method'larin yaptigi is ile bize döndürdüğü sonuç FARKLI OLABILIR.
        //set() methodu update yaparken sout icinde yazdirirsak neyi update ettigini bize dondurur.

        System.out.println(isimler.set(2,"Yusuf"));//Esra dondurdu cunku Esra'yi sildim demek istiyor burda
        System.out.println(isimler);//[Deniz, Omer, Yusuf, Gulnur, Hamza, Basak]

        System.out.println(isimler.set(0, "Ayca"));//Deniz dondurdu cunku Deniz'i sildim demek istiyor burda
        System.out.println(isimler);//[Ayca, Omer, Yusuf, Gulnur, Hamza, Basak]



    }
}
