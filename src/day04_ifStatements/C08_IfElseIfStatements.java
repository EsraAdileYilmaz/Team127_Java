package day04_ifStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {

        // SORU:Ogrenciden notunu alip
        //      notu 50'den buyukse gectin, deilse kaldin yazdiralim
        //      ogrenci 0'dan kucuk veya 100'den buyuk bir not girerse
        //      "gecersiz not" yazdiralim.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not=scanner.nextDouble();

        if(not<0 || not>100){ //Girilen not aralik disi
            System.out.println("Gecersiz not girdiniz");
        }else if(not>= 50){
            System.out.println("Sinifi gectiniz");
        }else {
            System.out.println("Malesef kaldiniz");
        }


    }
}
