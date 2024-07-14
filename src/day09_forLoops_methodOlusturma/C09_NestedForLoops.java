package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C09_NestedForLoops {
    public static void main(String[] args) {


          /*
            Kullanicidan satir sayisini alip
            asagidaki gibi bir sekil cizdirin
            1
            1 2
            1 2 3
            1 2 3 4

            Eger ucgensel bir sekil cizdirilecekse sadece satir sayisi yeterlidir
            cunku sutun sayisi ,satir sayisinin i degerine esittir.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir= scanner.nextInt();

        // ucgen sekiller icin de nested for loop kullanilir.
        // diktortgenden farki, sutun nosuna ihtiyacimiz yoktur.
        // her satirdaki sutun sayisi o satirin nosu ile aynidir.


        for (int i = 1; i <= satir ; i++) {//satir
            for (int j = 1; j <= i ; j++) {//satir=sutun buyuzden j<=i olur

                System.out.print(j +" ");
            }

            System.out.println("");
        }











    }
}
