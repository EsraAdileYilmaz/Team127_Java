package day25_inheritanceDataTypes_overriding;

import day24_inheritance_constructorCall.E_Toyota;

public class F_Kuslar extends E_Hayvanlar {

    protected void kanat(){

        System.out.println("kanatlidirlar");
    }

    protected void solunum(){

        System.out.println("akcigerle nefes alirlar");
    }

    protected void gaga(){

        System.out.println("gagalari vardir");
    }

    protected void cogalma(){

        System.out.println("yumurtayla cogalirlar");
    }
}
