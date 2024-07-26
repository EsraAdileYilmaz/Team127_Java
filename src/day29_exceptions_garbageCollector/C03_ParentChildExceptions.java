package day29_exceptions_garbageCollector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ParentChildExceptions {

    public static void main(String[] args) {

        /*
        Birden fazla exception olusma ihtimali varsa
        ve bu exception'lar arasinda Parent-Child iliskisi olursa
        once Child ,sonra Parent yazilmalidir.
        Yani 1.catch (Child exception)
        2.catch (Parent exception) yazilmalidir.

        Tersi yapilirsa yani once Parent yazilirsa
        Parent exception'in yakalama kapasitesi daha fazla
        oldugundan tum olasi exception'lari yakalayacak
        ve alttaki child exception'a is kalmayacaktir.
        Boyle yazarsak java altini cizer
        ve duzeltmemizi ister.

         Exception > IOException > FileNotFoundException
         */


        try {//sorunsuz dosyayi bulursa icindekileri yazdir
            FileInputStream fis=new FileInputStream("src/day28_exceptions/text.txt");

            int k=0;
            while((k= fis.read() ) != (-1)) {
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {

            System.out.println("Dosya yolu yanlis");
        } catch (IOException e) {//Ikinci catch eklemek icin "Add catch clause(s)" tiklanir

            System.out.println("Dosya okunamiyor");
        }


    }
}
