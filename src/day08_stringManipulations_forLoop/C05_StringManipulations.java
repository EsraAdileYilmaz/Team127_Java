package day08_stringManipulations_forLoop;

import java.util.Scanner;

public class C05_StringManipulations {
    public static void main(String[] args) {

        //Soru      : Kullanicidan bir cumle alin
        //          - cumlede ev geciyorsa, "home home sweet home" yazdirin
        //          - cumlede is geciyorsa, "calismak guzeldir"
        //          - ikisini de iceriyorsa "Hem ev lazim hem is"
        //          - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scanner.nextLine();

        String yeniCumle=cumle.toLowerCase();//kullanicinin girdigi degeri degistirmemek icin yeni bir variable olusturuyoruz.

        if(yeniCumle.contains("is") && yeniCumle.contains("ev")){
            System.out.println("Hem ev lazim hem is");
        } else if (yeniCumle.contains("ev")) {
            System.out.println("home home sweet home");
        }else if(yeniCumle.contains("is")){
            System.out.println("calismak guzeldir");
        }else{
            System.out.println("cok calisman lazim");
        }


    }
}
