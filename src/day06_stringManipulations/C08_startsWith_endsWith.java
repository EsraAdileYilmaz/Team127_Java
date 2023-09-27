package day06_stringManipulations;

public class C08_startsWith_endsWith {
    public static void main(String[] args) {

        //startsWith() methodu= ile mi baslar? sorusuna cevaptir
        //endswith() methodu=ile mi biter? sorusuna cevaptir.

        String str = "Java candir.";

        System.out.println(str.contains("a")); // true a icerir mi?
        System.out.println(str.startsWith("a")); // false a ile mi baslar?
        System.out.println(str.endsWith("a")); // false a ile mi biter?
        System.out.println(str.startsWith("Java candir.")); // true
        System.out.println(str.endsWith("Java candir.")); // true
        System.out.println(str.endsWith("candir")); // false
        System.out.println(str.startsWith("")); // true
        System.out.println(str.endsWith("")); // true
        System.out.println(str.startsWith("java")); // false

    }
}
