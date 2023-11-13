package day34_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C06_ComputeMethodlari {

    public static void main(String[] args) {

        Map<String, Integer> harfler=new HashMap<>();

        harfler.put("A",24);
        harfler.put("K",15);
        harfler.put("Y",28);
        harfler.put("C",12);
        System.out.println(harfler);//{A=24, C=12, Y=28, K=15}

        //SORU:A'nin degerini 5 artirin
       Integer valueA=harfler.get("A");
       harfler.put("A",valueA+5);
       System.out.println(harfler);//{A=29, C=12, Y=28, K=15}


        //SORU:// Eger C yoksa degeri 40 olarak ekleyin
        if( ! harfler.containsKey("C")){
            harfler.put("C",40);
        }
        System.out.println(harfler);
        //{A=29, C=12, Y=28, K=15} C zaten vardi oyuzden bir degisiklik olmadi.


        //SORU:Eger Y varsa degerini 2 katina cikarin
        int valueY=harfler.get("Y");
        if(harfler.containsKey("Y")){
            harfler.put("Y",valueY*2);
        }
        System.out.println(harfler);//{A=29, C=12, Y=56, K=15}


        //SORU:A'nin degerini 10 artirin
        harfler.compute("A",(k,v)->v+10);
        System.out.println(harfler);//{A=39, C=12, Y=56, K=15}

        //SORU:X'in degerini 10 artirin
        // harfler.compute("X", (k,v)-> v+10); // NullPointerException
        // girilen key'in var oldugundan emin degilseniz
        // bu method'u kullanmayin.Exception firlatir.


        //SORU:X varsa degerini 10 artirin
        harfler.computeIfPresent("X",(k,v)-> v+10);
        System.out.println(harfler);


        //SORU:K varsa degerini 10 artirin
        harfler.computeIfPresent("K",(k,v)->v+10);
        System.out.println(harfler);//{A=39, C=12, Y=56, K=25}


        //SORU: // X yoksa degeri 10 olarak ekleyin
        //1.yontem
        //harfler.putIfAbsent("X",10);
        //System.out.println(harfler);//{A=39, C=12, X=10, Y=56, K=25}

        //2.yontem
        harfler.computeIfAbsent("X",v->10);
        System.out.println(harfler);//{A=39, C=12, X=10, Y=56, K=25}


    }
}
