package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C07_NestedForLoops {

    public static void main(String[] args) {


          /*
            Kullanicidan satir ve sutun sayisini alip
            asagidaki gibi *'lardan olusan bir sekil cizdirin
            * * * * *
            * * * * *
            * * * * *

            Eger sekil dikdortgen ise satir ve sutun sayisi ayri ayri alinir
            i= satir sayisi
            j=sutun sayisidir
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir= scanner.nextInt();

        System.out.println("Lutfen sutun sayisini giriniz");
        int sutun=scanner.nextInt();

        for (int i = 1; i <= satir ; i++) { // int i=0 ve int j=0 yaparsam satir ve sutun sayisi 1 fazla oluyor
            for (int j = 1; j <= sutun ; j++) {

                System.out.print("* ");
            }
            System.out.println(""); // her bir satiri ayirmak icin inner loop tan sonra eklenmelidir
        }



    }
}