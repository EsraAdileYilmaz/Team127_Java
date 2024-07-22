package day21_varargs_StringBuilder;

public class C08_StringBuilder_StringMethods {

    public static void main(String[] args) {


        /*
            StringBuilder ile bazi String method'lari da kullanilabilir.
            Return'u String veya char donduren method'lar
            StringBuilder'da kalici degisiklik YAPMAZLAR.

            Bazi String method'lari ise StringBuilder'da yoktur.
            String methodlari StringBuilder ile kullanmak istersek;
            sb.toString() ile once String'e cevirmeliyiz, sonra istenen String method'u kullanilabilir.
            Boyle yapilan degisiklikler StringBuilder'da kalici degisiklik YAPMAZ.

            substring() methodu tek index verilirse verilen indexi ve sonrasini komple yazdirir.
            substring() methodu iki index verilirse ilk index dahil son index haric arasini dondurur.
            setCharAt() methodu ile verilen indexe istenen karakter update edilir.
         */

        StringBuilder sb= new StringBuilder("Java");
        System.out.println(sb.substring(2));// va
        System.out.println(sb);// Java (yapilan degisiklik kalici OLMADI.)


        System.out.println(sb.charAt(2));// v
        System.out.println(sb);// Java (yapilan degisiklik kalici OLMADI.)


        // void olan setCharAt() kalici degisiklik yapar
        sb.setCharAt(0,'H');// 0.indexteki J'yi H ile update et. kalici olur
        System.out.println(sb);// Hava


        // sb "a" iceriyor mu?
        System.out.println(sb.toString().contains("a"));// true
        // burada once toString() methodu ile String'e cevirdik.
        //sonra String methodu olan contains() methodunu kullandik.Bu durumda da KALICI OLMAZ.





    }
}
