package day08_stringManipulations_forLoop;

import java.util.Scanner;

public class C04_replaceAll {
    public static void main(String[] args) {

        // SORU:Kullanicidan isim soyisim ve kart numarasini alip
        //      asagidaki sekilde yazdirin
        //      Isim soyisim  : S***** G****
        //      Kart No : 1234 **** **** ****


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scanner.nextLine();

        System.out.println("Lutfen kart numaranizi giriniz");
        String kartNo=scanner.nextLine();

        // kullanicinin girdigi orjinal degerleri korumak icin
        // yeni variable'lar olusturmaliyiz

        String yildizIsim=isim.substring(0,1).toUpperCase() +
                isim.substring(1).replaceAll("\\w" ,"*");

        String yildizSoyisim=soyisim.substring(0,1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\w" ,"*");

        String yildizKartNo=kartNo.substring(0,4)+ " **** **** ****";

        System.out.println("Isim soyisim : " + yildizIsim +" "+yildizSoyisim + "\nKart No :" +
                yildizKartNo);


    }
}
