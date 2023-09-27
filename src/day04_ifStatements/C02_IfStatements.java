package day04_ifStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {


        // Soru - Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //         ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        double kenar1=scanner.nextDouble();
        double kenar2=scanner.nextDouble();
        double kenar3=scanner.nextDouble();

        if(kenar1==kenar2 && kenar1==kenar3 && kenar1>0){
            System.out.println("Verilen kenar uzunluklari Eskenar ucgen olusturur");
        }

        /*
         Java 2'li karsilastirmalari kabul eder,
        daha fazla karsilastirmaya ihtiyac varsa,
        mantiksal operatorler kullanilarak (&& veya || )
        sartlar ayri ayri yazilip, birlestirilir.
         */

    }
}
