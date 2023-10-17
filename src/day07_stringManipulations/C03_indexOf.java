package day07_stringManipulations;

import java.util.Scanner;

public class C03_indexOf {
    public static void main(String[] args) {

        // SORU:Verilen bir cumlede
        //      aranan bir metin icin asagidaki cumlelerden
        //      uygun olani yazdiracak bir program yaziniz
        // - Cumle aranan metni icermiyor
        // - Cumlede aranan metin sadece 1 kere kullanilmis
        // - Cumlede aranan metin sadece 2 kere kullanilmis
        // - Cumlede aranan metin 2'den fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen aranan metni giriniz");
        String metin = scanner.nextLine();

        int ilkIndex = 0;
        int ikinciIndex = 0;
        int ucuncuIndex = 0 ;
        ilkIndex = cumle.indexOf(metin); // -1 veya int=kullanilan index no verir

        if (ilkIndex == -1){ //yani aranan metin hic yoksa
            System.out.println("Cumle aranan metni icermiyor");
        } else if ((ikinciIndex = cumle.indexOf(metin,ilkIndex+1)) == -1) { // mutlaka kullanilmis ama kac defa bilmiyoruz
            // ilk index -1 degil, ikinci index -1 olabilir. yani ikinci kez metni icermeyebilir
            System.out.println("Cumlede aranan metin sadece 1 kere kullanilmis");
        }else{
            // ilk index -1 degil, ikinciIndex -1 degil.yani 2.kez aranan metin cumlede var
            // simdiki sorumuz sadece 2 tane mi var, yoksa 2'den fazla mi ?
            ucuncuIndex = cumle.indexOf(metin,ikinciIndex+1);
            // ucuncuIndex == -1 veya bir index no verir
            if (ucuncuIndex == -1){
                // ilk index -1 degil, ikinciIndex -1 degil ama ucuncuIndex -1
                //yani 3. kez cumle icinde aranan metin yoksa
                System.out.println("Cumlede aranan metin sadece 2 kere kullanilmis");
            }else{
                // ilk index -1 degil, ikinciIndex -1 degil, ucuncuIndex -1 degil
                //yani 3. kez cumle icinde aranan metin vardir
                System.out.println("Cumlede aranan metin 2'den fazla kullanilmis");
            }

        }
    }
}

