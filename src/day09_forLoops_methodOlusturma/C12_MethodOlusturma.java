package day09_forLoops_methodOlusturma;

public class C12_MethodOlusturma {
    public static void main(String[] args) {



        String str = "Sevim bak kim gelmis ?";

        str.toUpperCase();

        // Method bize bir sonuc donduruyorsa 2 sekilde o sonucu kullanabiliriz.
        // 1)sadece o satirda, sonucu gormek istiyorsaniz, kalici bir degisiklik yapmayacaksaniz
        // direk yazdirabiliriz.
        System.out.println(str.toLowerCase()); // sevim bak kim gelmis ?

        // 2)veya degisikligin kalici olmasini istiyorsak
        // yeni halini kaydedebiliriz.

        String strBuyukharf = str.toUpperCase();

        System.out.println(str); // Sevim bak kim gelmis ?
        System.out.println(strBuyukharf); // SEVIM BAK KIM GELMIS ?


    }
}
