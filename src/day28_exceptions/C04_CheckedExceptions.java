package day28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        /*
            Checked exceptions daha cok dosya okuma(Output)
            veya dosyaya bilgi kaydetme(Input) ile ilgilidir.
            javada bu islemlere input/output dendiginden
            exception olarak IOException(InputOutputException)
            ve child class'lari olusturulmustur.

         */

        String dosyaYolu="day28_exceptions/text.txt";
        //text.txt dosyasina sag click yap,Copy/Path Referans ,Path From Content Root yapinca dosya yolu kopyalanir

        FileInputStream fis =new FileInputStream(dosyaYolu);//Javanin Dosyayi bulmasi icin.oradan kodlarimiza input edicez.
        // burdaki hata var olan bir hata deil
        // ya dosyayi bulamazsam diyor java.
        // Unhandled exception: java.io.FileNotFoundException

        /*
            Unhandled exception: java.io.FileNotFoundException

            CheckedExceptions kod calismadan riskli olan kodlarda bizi uyarir.CTE gibi altini kirmizi cizer.
            Bu konuda inisiyatif bizdedir.

            1- istersek bu satiri try-catch ile handle eder ve
               exception olussa da yoluna devam etmesini saglariz.
            2- veya exception olustugunda kodun durmasini istiyorsak
               sadece altindaki kirmizi cizginin gitmesini ve calismasini istiyorsak
               method deklarasyonunun yanina (throws FileNotFoundException) yazarak,
               bu riskin farkinda oldugumuzu ve bu method'un
               belirtilen exception'i firlatabilecegini yazariz.
         */



    }

}
