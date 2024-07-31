package day35_maps_lesQuestions;

import java.util.Map;
import java.util.TreeMap;

public class C01_TreeMap {

    public static void main(String[] args) {

        /*
        TreeMap'le gelen methodlar;
        1)put(k,v) methodu key ve value eklememizi saglar.
        2)descendingMap() methodu key'leri sondan basa dogru tersten siralar.Ters sirali yapar
        3)lowerKey() methodu kendinden onceki key'i dondurur.
        4)floorKey() methodu key varsa key'i,key yoksa onceki key'i dondurur.(Asagi yuvarla demektir)
        5)lowerEntry() methodu key varsa key=value'yu, key yoksa kendinden onceki key=value'sunu verir.
        6)floorEntry() methodu key varsa key=value'yu, key yoksa kendinden onceki key=value'sunu verir.
        7)higherKey() methodu kendinden sonraki key'i dondurur.
        8)ceilingKey() methodu key varsa key'i,key yoksa sonraki key'i dondurur.(Yukari yuvarla demektir)
        9)pollLastEntry() methodu son en buyuk key'i siler ve getirir
        10)pollFirstEntry() methodu ilk key'i siler ve getirir
        11)headMap() methodu icine yazilan key'e kadar olan key'leri dondurur.Icine yazilan key dahil degildir
        12)headMap(key,boolean) methodu ise icine yazilan key dahil oncekilerin tamamini dondurur
        13)tailMap() methodu yazilan key dahil sonraki key'leri dondurur
        14)tailMap(key,boolean) methodu boolean'a false yazarsak ilk key'i dahil etmez
        15)firstKey() methodu ilk key'i bize dondurur
        16)firstEntry() methodu ilk key=value'yu bize dondurur
        17)lastKey() methodu son key'i bize dondurur
        18)lastEntry() methodu son key=value'yu bize dondurur
        19)subMap(key,key) methodu ilk key=value dahil son key=value haric arasindakileri getirir
        20)subMap(key,boolean,key,boolean) methodu yazilan key=value dahil olsun mu olmasin mi boolean olarak karar verilir.
        21)clone() Map'in bir kopyasini dondurur
         */

        // Bir TreeMap objesi olustururken,
        // Data turu(Data type) olarak Map secersek,
        // biz bir TreeMap olustursak da tum Map'lerle ayni ortak ozelliklere sahip olur.

        Map<String,Integer> harfler1=new TreeMap<>();//Normal Map'le ayni ozelliklere sahip olur

        TreeMap<String,Integer> harfler=new TreeMap<>();//Data turu ve constructor child'dan(TreeMap<>()) oldugu icin cok farkli methodlar geldi
        harfler.put("B",20);
        harfler.put("P",2);
        harfler.put("S",25);
        harfler.put("F",10);
        harfler.put("Y",12);
        System.out.println(harfler);//{B=20, F=10, P=2, S=25, Y=12} harflere gore yani key'lere gore sirali oldu

        System.out.println(harfler.descendingMap());//{Y=12, S=25, P=2, F=10, B=20}
        // bu method treeMap'de kalici degisiklik YAPAMAZ.
        // harfler = harfler.descendingMap(); treeMap dogal sirali olacagindan,
        //                                    descendingMap() methodu ile yapilan tersten siralamayi kabul etmez.

        System.out.println(harfler.lowerKey("S"));//P yani S'den bir kucuk olan key'i getirir
        System.out.println(harfler.lowerKey("K"));//F (K key'i yok ancak olsaydi kendinden onceki hangisi olurdu? ise onu donduruyor)
        System.out.println(harfler.lowerKey("A"));//null (cunku A key'i yok ve kendinden once de bir key yok.)

        System.out.println(harfler.lowerEntry("D")); // B=20
        System.out.println(harfler.floorEntry("P")); // P=2


        System.out.println(harfler.floorKey("S"));//S
        System.out.println(harfler.floorKey("K"));//F
        System.out.println(harfler.floorKey("P"));//P
        System.out.println(harfler.floorKey("A"));//null (A'dan kucuk bir key olmadigi icin null verir)

        /*
        lower() girilen key'den kucuk olan,ilk buyuk key'i verir.
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
        System.out.println(harfler.subMap("F",true,"S",true));// {F=10, I=4, P=2, S=25}


        System.out.println(harfler.clone());//Map'in kopyasini donduruyor




    }
}
