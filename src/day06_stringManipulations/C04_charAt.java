package day06_stringManipulations;

public class C04_charAt {
    public static void main(String[] args) {

        //charAt() methodu istenen-parantez icine yazilan indexteki karakteri dondurur.

        String str ="Java gun gectikce guzellesiyor.";

        //Ilk harfini yazdirin
        System.out.println(str.charAt(0)); //J (0. indexteki)
        System.out.println(str.charAt(4)); // 4. indexteki space var

        //str'da 31 karakter var.karakterleri sayarken 1 den baslanir
        //son karakter olan .'nin indeksi 30 olur. Yani index=karakter-1

        //son karakteri yazdirin
        System.out.println(str.charAt(str.length()-1)); // . dir son karakter
        System.out.println(str.charAt(31 -1));

        //sondan 5.karakteri yazdirin
        System.out.println(str.charAt(str.length()-5));// i
        System.out.println(str.charAt(31-5));

        // str'da olmayan bir indexi istersek
        //System.out.println(str.charAt(44)); StringIndexOutOfBoundsException
        //                                    String de verilen index sinirlar disidir


    }
}
