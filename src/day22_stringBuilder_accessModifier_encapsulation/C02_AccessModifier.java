package day22_stringBuilder_accessModifier_encapsulation;

public class C02_AccessModifier {

    /*
     Access modifier'leri en genisten en dar kapsamliya gore siralarsak;
     public access mod. >protected access mod. >default access mod. >private access mod.

     Gorunur bir access modifier yoksa DEFAULT Access Modifier GECERLIDIR
     */

    public static String marka="Toyota";// access modifier==> public
    public static int yil;// access modifier==> public

    protected static String renk;// access modifier==> protected
    protected static int maxHiz;// access modifier==> protected


    static String model;// default deger = null   access modifier ==> default

    static int fiyat;//default deger = 0  access modifier ==> default

    private static String seriNo;// default deger = null   access modifier ==> private
    private static int km;//default deger = 0  access modifier ==> private

    public static void main(String[] args) {

    }





}
