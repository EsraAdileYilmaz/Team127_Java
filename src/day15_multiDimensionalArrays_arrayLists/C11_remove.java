package day15_multiDimensionalArrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C11_remove {

    public static void main(String[] args) {


        //ArrayList icindeki remove(silinecekObject)  methodunu calistirinca,
        // silinecekObject varsa siler ve bize true dondurur,
        // silinecekObject yoksa silemez ve bize false dondurur.

        List<String> isimler=new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");
        System.out.println(isimler);//[Deniz, Omer, Esra, Hamza, Basak]

        System.out.println(isimler.remove("Esra"));//true verdi. yani sildim diyor
        System.out.println(isimler);//[Deniz, Omer, Hamza, Basak]

        System.out.println(isimler.remove("Ercan"));//false verdi cunku bunu bulamadim ve silemedim
        System.out.println(isimler);//[Deniz, Omer, Hamza, Basak] list degismedi.

        isimler.remove("Omer");
        System.out.println(isimler);//[Deniz, Hamza, Basak]

        System.out.println(isimler.remove(1));//Hamza verdi cunku 1.indextekini sildi
        System.out.println(isimler);//[Deniz, Basak]

        //isimler.remove(5);//IndexOutOfBoundsException

        isimler.add("Ibrahim");
        isimler.add("Ercan");
        isimler.add("Azim");
        System.out.println(isimler);//[Deniz, Basak, Ibrahim, Ercan, Azim]

        List <String> silinecekler=new ArrayList<>();
        silinecekler.add("Basak");
        silinecekler.add("Deniz");
        silinecekler.add("Azim");
        System.out.println(silinecekler);//[Basak, Deniz, Azim]

        System.out.println(isimler.removeAll(silinecekler));//true verdi cunku bu isimleri sildim diyor
        System.out.println(isimler);//[Ibrahim, Ercan]

        List <String> silinecekler2=new ArrayList<>();
        silinecekler2.add("Ercan");
        silinecekler2.add("Gulnur");
        System.out.println(silinecekler2);//[Ercan, Gulnur]

        System.out.println(isimler.removeAll(silinecekler2));//true verdi cunku icinden 1 tane isim sildi
        System.out.println(isimler);//[Ibrahim]

        System.out.println(isimler.removeAll(silinecekler));//false verdi cunku silecek bisey bulamadi
        System.out.println(isimler);//[Ibrahim]





    }
}
