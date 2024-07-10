package day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C09_SwitchStatements {
    public static void main(String[] args) {

        /*
        switch statements if-else lerin alternatifidir.
        ancak uzun if-else ler yerine kullanilir.
         */

        // SORU:Kullanicinin girdigi gun numarasina gore
        //      gun isimlerini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        int gunNo=scanner.nextInt();

        switch(gunNo){ // () icine neye gore karar verecegini girersin
            case 1: // gunNo bak 1 ise pazartesi yazdir vs
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Yanlis gun numarasi girdiniz");
        }


    }
}
