package day29_exceptions_garbageCollector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_EcrireText {

    public static void main(String[] args) throws IOException {

        FileInputStream fis=new FileInputStream("src/day29_exceptions_garbageCollector/text exceptions");

        int k=0;
        while((k= fis.read() ) != (-1)) {
            System.out.print((char) k);
        }//bu kod txt dosyasinin icini okuyup icindeki degerleri bize dondurur.

    }
}
