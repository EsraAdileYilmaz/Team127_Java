package day35_maps_lesQuestions;

import java.util.Map;
import java.util.TreeMap;

public class C01_TreeMap {

    public static void main(String[] args) {

        /*
        1)put(k,v) methodu key ve value eklememizi saglar.
        2)descendingMap() methodu key'leri sondan basa dogru tersten siralar.
        3)lowerKey() methodu kendinden onceki key'i dondurur.
        4)floorKey() methodu key varsa key'i,key yoksa onceki key'i dondurur.

         */

        // Bir TreeMap objesi olustururken,
        // Data turu(Data type) olarak Map secersek,
        // biz bir TreeMap olustursak da tum Map'lerle ayni ortak ozelliklere sahip olur.

        Map<String,Integer> harfler1=new TreeMap<>();
        TreeMap<String,Integer> harfler=new TreeMap<>();
        harfler.put("B",20);
        harfler.put("P",2);
        harfler.put("S",25);
        harfler.put("F",10);
        harfler.put("Y",12);
        System.out.println(harfler);//{B=20, F=10, P=2, S=25, Y=12} harflere gore yani key'lere gore sirali oldu

        System.out.println(harfler.descendingMap());//{Y=12, S=25, P=2, F=10, B=20}
        // bu method treeMap'de kalici degisiklik YAPAMAZ.
        // harfler = harfler.descendingMap(); treeMap dogal sirali olacagindan,
        //                                    descendingMap() methodu ile siralamayi kabul etmez.

        System.out.println(harfler.lowerKey("S"));//P
        System.out.println(harfler.lowerKey("K"));//F
        //F (K key'i yok ancak olsaydi kendinden onceki hangisi olurdu? ise onu donduruyor)
        System.out.println(harfler.lowerKey("A"));//null
        //cunku A key'i yok ve kendinden once de bir key yok.

        System.out.println(harfler.lowerEntry("D")); // B=20
        System.out.println(harfler.floorEntry("P")); // P=2


        System.out.println(harfler.floorKey("S"));//S
        System.out.println(harfler.floorKey("K"));//F
        System.out.println(harfler.floorKey("P"));//P
        System.out.println(harfler.floorKey("A"));//null

        /*
        lower() girilen key'den kucuk olan en buyuk key'i verir
        floor() matematikdeki asagi yuvarla gibidir,
        verilen key varsa onu, key yoksa ondan kucuk olan en buyuk key'i verir.
         */

        System.out.println(harfler.higherKey("G")); // P
        System.out.println(harfler.higherKey("S")); // Y
        System.out.println(harfler.higherKey("Y")); // null

        System.out.println(harfler.ceilingKey("G")); // P
        System.out.println(harfler.ceilingKey("S")); // S
        System.out.println(harfler.ceilingKey("Z")); // null

        System.out.println(harfler.pollLastEntry()); // Y=12

        System.out.println(harfler); // {B=20, F=10, P=2, S=25}

        System.out.println(harfler.pollFirstEntry()); // B=20

        System.out.println(harfler); //  {F=10, P=2, S=25}

        harfler.put("C",24);
        harfler.put("I",4);
        harfler.put("U",12);

        System.out.println(harfler); // {C=24, F=10, I=4, P=2, S=25, U=12}

        System.out.println(harfler.headMap("P")); // {C=24, F=10, I=4}
        System.out.println(harfler.headMap("M")); // {C=24, F=10, I=4}

        System.out.println(harfler.headMap("P",true)); // {C=24, F=10, I=4, P=2}
        System.out.println(harfler.headMap("M",true)); // {C=24, F=10, I=4}

        System.out.println(harfler.tailMap("I")); // {I=4, P=2, S=25, U=12}
        System.out.println(harfler.tailMap("G")); // {I=4, P=2, S=25, U=12}

        System.out.println(harfler.tailMap("I",false)); // {P=2, S=25, U=12}
        System.out.println(harfler.tailMap("G",false)); // {I=4, P=2, S=25, U=12}


        System.out.println(harfler.firstKey()); // C
        System.out.println(harfler.firstEntry()); // C=24
        System.out.println(harfler.lastKey()); // U
        System.out.println(harfler.lastEntry()); // U=12

        System.out.println(harfler.subMap("D", "L"));// {F=10, I=4}
        System.out.println(harfler.subMap("F","S")); // {F=10, I=4, P=2}
        System.out.println(harfler.subMap("D",true,"L",true)); // {F=10, I=4}
        System.out.println(harfler.subMap("F",true,"S",true));
        //{F=10, I=4, P=2, S=25}

        System.out.println(harfler.clone());//Map'in kopyasini donduruyor




    }
}
