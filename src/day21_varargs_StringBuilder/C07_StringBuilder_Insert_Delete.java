package day21_varargs_StringBuilder;

public class C07_StringBuilder_Insert_Delete {

    public static void main(String[] args) {

        /*
        append() methodu ile sonuna eleman ekleme yapilabilir.
        insert() methodu ile istenen indexe eleman eklenebilir.
        delete() methodu ile istenen indexteki eleman silinebilir.
        deleteCharAt() methodu ile tek bir karakteri silebiliriz.
        indexOf() methodu ile istenen metnin indexini buluruz.
        lastIndexOf() methodu ile istenen metnin sondan indexini buluruz.
         */

        StringBuilder sb= new StringBuilder("Java Candir");
        sb.append(".");// elemani sona ekler ve kalici olur.cunku mutable class
        System.out.println(sb);// Java Candir.


        String str="Hava cok guzel";
        sb.append(str,5,8);//yukaridaki str'in 5.indexi ile 8. indexi arasini ekle
        System.out.println(sb);// Java Candir.cok


        sb.insert(5,"cok ");//yani sb'nin 5.indexine "cok " u ekle
        System.out.println(sb);// Java cok Candir.cok

        sb.insert(19,str,8,14);//sb'nin 19.indexine, str'in 8.indexi ile 14.indexi arasindaki metni ekle
        System.out.println(sb);// Java cok Candir.cok guzel


        sb.delete(16,25);// sb'nin 16. ve 25. indexinin arasindakileri sil
        System.out.println(sb);// Java cok Candir.


        //sondaki karakteri silin.
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);// Java cok Candir  (. nokta silindi)


        //indexini saymadan "cok " u silin.
        int indexCok=sb.indexOf("cok");// "cok " un indexini bulduk.
        sb.delete(indexCok,indexCok+4);
        // "cok " un icinde 4 karakter bulundugu icin +4 yaparak; 4 karakter sil demis olduk.
        System.out.println(sb);// Java Candir
    }
}
