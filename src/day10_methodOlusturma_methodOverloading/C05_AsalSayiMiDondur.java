package day10_methodOlusturma_methodOverloading;

public class C05_AsalSayiMiDondur {

    public static void main(String[] args) {


        //SORU: Verilen pozitif bir tamsayinin
        //      asal sayi olup olmadigini kontrol edip
        //      asal ise true, asal degil ise false donduren
        //      bir method olusturun

        asalMiDondur(37);

        System.out.println(asalMiDondur(37));// true  (direk yazdirma yapildi)

        boolean asalMi=asalMiDondur(67);// bir variable'a atadik
        System.out.println(asalMi); //true  (sonra yazdirdik)



    }

    public static boolean asalMiDondur (int sayi){

        // flag yontemi ile cozelim
        boolean flag=true;//asal sayidir

        for (int i = 2; i < sayi; i++) {

            if(sayi % i ==0){
                flag=false;//asal sayi deildir
                break;
            }
        }
        return flag;
    }
}
