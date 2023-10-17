package day07_stringManipulations;

public class C06_isEmpty_isBlank {
    public static void main(String[] args) {

        //isEmpty() methodu=str'in ici bos mu? sorusunun cevabidir
        //isBlank() methodu=str'in icinde sadece space'ler mi var? sorusunu cevaplar.

        String str1 = "";
        String str2 = "     ";
        String str3 = "Java";
        System.out.println(str2.isBlank()); // true    space'lerden mi olusuyor ?
        System.out.println(str2.isEmpty()); // false   bos mu ? cunku icinde space ler var.
        System.out.println(str1.isBlank()); // true    hiclik te isBlank() methoduna dahil
        System.out.println(str1.isEmpty()); // true    hiclik=bosluk
        System.out.println(str3.isBlank()); // false
        System.out.println(str3.isEmpty()); // false
    }
}
