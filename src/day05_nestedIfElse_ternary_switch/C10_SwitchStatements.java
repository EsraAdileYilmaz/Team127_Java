package day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C10_SwitchStatements {
    public static void main(String[] args) {

        //SORU: kullanicidan gun numarasini alip
        //      hafta ici veya hafta sonu yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        int gunNo=scanner.nextInt();

        switch (gunNo){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Yanlis gun numarasi girdiniz");
        }

         /* gun isminin bas harfini alin s S
            case s || S :  OLMAZ yanlis yazim sekli
            case s,S : OLMAZ yanlis yazim sekli
            case s :
            case S :
            Yani && veya || kullanilmaz
         */

    }
}
