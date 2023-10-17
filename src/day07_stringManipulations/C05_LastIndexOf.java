package day07_stringManipulations;

import java.util.Scanner;

public class C05_LastIndexOf {
    public static void main(String[] args) {

        // SORU:Verilen bir cumlede
        //      aranan bir metin icin asagidaki cumlelerden
        //      uygun olani yazdiracak bir program yaziniz
        // - Cumle aranan metni icermiyor
        // - Cumlede aranan metin sadece 1 kere kullanilmis
        // - Cumlede aranan metin sadece 1'den fazla kullanilmis

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scanner.nextLine();

        System.out.println("Lutfen aranan metni giriniz");
        String metin = scanner.nextLine();

        //1. YOL
        if(cumle.indexOf(metin) ==-1){
            System.out.println("Cumle aranan metni icermiyor");
        } else if (cumle.indexOf(metin) == cumle.lastIndexOf(metin)) {
            System.out.println("Cumlede aranan metin sadece 1 kere kullanilmis");
        }else{ //1 'den fazla kez varsa
            System.out.println("Cumlede aranan metin sadece 1'den fazla kullanilmis");
        }

        //2.YOL

        int ilkIndex = cumle.indexOf(metin); // -1 veya index no
        int sonIndex = cumle.lastIndexOf(metin); // -1 veya index no
        if (ilkIndex == -1){
            System.out.println("Cumle aranan metni icermiyor");
        } else if (ilkIndex == sonIndex) {
            System.out.println("Cumlede aranan metin sadece 1 kere kullanilmis");
        }else{
            System.out.println("Cumlede aranan metin sadece 1'den fazla kullanilmis");
        }



    }
}
