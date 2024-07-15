package day10_methodOlusturma_methodOverloading;

public class C03_AsalSayiBulma {
    public static void main(String[] args) {

        // SORU: Verilen pozitif bir tamsayinin
        //       asal olup olmadigini kontol edip
        //       asal ise true, asal degil ise false yazdiran bir method olusturun


        // method call'u methodun ismi ile yapariz

        asalMiYazdir(56);//false  (yani asal deil)
        asalMiYazdir(87); // false  (yani asal deil)
        asalMiYazdir(47); // true  (yani asal sayi)

    }

    public static void asalMiYazdir(int sayi){

        // bu soruyu flag yontemi ile cozelim

        boolean flag=true;
        for (int i = 2; i < sayi; i++) { // asal oldugunu bulmak icin 2'den bolmeye baslar. sonra sirasiyla 3,4,5... diye devam eder

            if( sayi % i == 0){
                flag= false;
                break;//bolunen ilk sayiyi bulduktan sonra durdur gerisini kontrol etme.
            }

        }
        System.out.println(flag);
    }
}
