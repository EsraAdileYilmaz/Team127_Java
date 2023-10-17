package day03_wrapperClasses_mathematiqs;

public class C05_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        int a = 20 ;
        // a'nin degerini yazdirin
        // sonra a'nin degerini 1 artir ve olusturacaginiz b variable'ina yeni degeri atayin
        System.out.println("a : " + a); //a=20
        a += 1; // veya a++;
        int b = a ;
        System.out.println( "islem sonunda a : " + a + ", b : " + b);// a:21 ,b:21


        a = 20;
        // a'nin degerini b'ye atayin
        // sonra a'nin degerini 1 artirin
        b = a ;
        a += 1 ; // veya a++;
        System.out.println( "islem sonunda a : " + a + ", b : " + b); //a:21 ,b:20


        System.out.println("=========================");
        // bu anlatilan sadece ++ (1 artirma)veya -- (1 azaltma) seklindeki kullanim icindir
        a = 20 ;
        b = a++ ;
        System.out.println( "a++ islem sonunda a : " + a + ", b : " + b); //a:21 ,b:20

        a=20;
        b= ++a;
        System.out.println( "++a islem sonunda a : " + a + ", b : " + b);//a:21 ,b:21

        int c = 40;
        System.out.println( "c++ ile yazdirinca : " + c++); //c:40 yazdirir
        System.out.println("c++ ile bir alt satirda c'nin degeri : " + c);//c:41 olur,yazdirir

        c = 40;
        System.out.println( "++c ile yazdirinca : " + ++c); //c:41 olur ve yazdirir
        System.out.println("++c ile bir alt satirda c'nin degeri : " + c);//c:41 dir

    }
}
