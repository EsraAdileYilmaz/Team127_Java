package day03_wrapperClasses_mathematiqs;

public class C06_Concatenation {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Kolaydir";
        String s3 = " ";
        String s4 = "";
        int a = 4;
        int b = 3;


        // sadece verilen variable'lari kullanarak asagida istenen metinleri yazdirin

        // Java Kolaydir 12
        System.out.println(s1+s3+s2+s3+a*b);

        // Java7Kolaydir
        System.out.println(s1+(a+b) +s2);

        // 43Java
        System.out.println(s4+a+b+s1);
        System.out.println(a+(b+s1));


        // 7 Java Kolaydir
        System.out.println((a+b)+s3+s1+s3+s2);

    }
}
