package day29_exceptions_garbageCollector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_CheckedExceptions {

    public static void main(String[] args) throws Exception {

        //String str=3; her alti cizili hata exception deildir.try-catch blogu ile duzeltilemez/CTE'dir


        /*
            Eger birden fazla exception olusma ihtimali varsa,
            ve biz try-catch blok yerine throws keyword kullanmak istiyorsak,
            en genis yakalama kapasitesi olan (en ince elek araligi olan)
            parent Exception'i yazmamiz yeterli olacaktir.

            throws Exception=> bunu method declaration'a eklemek su demek:
            ben sikinti olacaginin farkindayim.Sen calismaya devam et.
            Sikinti olursa exception firlat.Ve calismayi durdur.
         */
        FileInputStream fis=new FileInputStream("src/day28_exceptions/text.txt");

        int k=0;
        while((k= fis.read() ) != (-1)) {
            System.out.print((char) k);
        }//bu kod txt dosyasinin icini okuyup icindeki degerleri bize dondurur.

    }
}
