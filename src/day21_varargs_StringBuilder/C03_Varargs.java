package day21_varargs_StringBuilder;

public class C03_Varargs {

    // SORU:Bir int ve istenen kadar String parametre alip,
    //      String parametre sayisi ile int sayinin carpimini yazdiran
    //      bir method olusturun.



    public static void main(String[] args) {
        //soruda (int * string adedi) isteniyor.

        islemYap(5,"a","b","c");// 5*3 adet string =15
        islemYap(2,"a");// 2*1 adet string =2
        islemYap(5);// 5*0 adet string =0
        islemYap(3,"","","","","");//  3*5 adet string =15

    }

    public static void islemYap(int sayi,String... strings){
        //(String...) array gibi davranir ve array methodlari kullanilir. String [] strings olusacak
        System.out.println(sayi* strings.length);
    }
}
