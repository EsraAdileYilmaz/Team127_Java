package day04_ifStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {

        //Soru - Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin,
        //        degilse “Eskenar degil” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        double kenar1=scanner.nextDouble();
        double kenar2=scanner.nextDouble();
        double kenar3=scanner.nextDouble();

        if(kenar1==kenar2 && kenar3==kenar2 && kenar3>0){
            System.out.println("Bu ucgen eskenar ucgendir");
        }else {
            System.out.println("Bu ucgen eskenar ucgen deildir");
        }




    }
}
