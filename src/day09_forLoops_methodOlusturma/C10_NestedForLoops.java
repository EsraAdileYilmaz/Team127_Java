package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C10_NestedForLoops {
    public static void main(String[] args) {


         /*
            Kullanicidan satir sayisini alip
            asagidaki gibi *'lardan olusan bir sekil cizdirin
            *
            * *
            * * *
            * * * *
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir=scanner.nextInt();

        for (int i = 1; i <= satir; i++) { // satir verir ve int=1 den baslar

            for (int j = 1; j <= i; j++) { // sutun verir int=1 den baslar ve sutun=i dir

                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
