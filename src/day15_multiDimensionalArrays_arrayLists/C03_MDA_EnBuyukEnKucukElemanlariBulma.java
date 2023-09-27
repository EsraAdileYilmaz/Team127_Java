package day15_multiDimensionalArrays_arrayLists;

public class C03_MDA_EnBuyukEnKucukElemanlariBulma {

    public static void main(String[] args) {


        // SORU: Verilen bir MDA'de en buyuk ve en kucuk sayilari bulup,
        //        yazdiran bir method olusturun.


        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{2}};



        //method call yapalim.
        enBuyukEnKucukElemaniBul(arr);
        //Arraydeki en kucuk element: 0
        //Arraydeki en buyuk element: 9

    }

    public static void enBuyukEnKucukElemaniBul(int [][] arr){

        int enBuyukEleman=arr [0][0];//0 indexli inner arrayin 0.indexinden kontrole basla
        int enKucukEleman=arr [0][0];//0 indexli inner arrayin 0.indexinden kontrole basla

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if(arr[i][j] > enBuyukEleman){
                    enBuyukEleman= arr[i][j];
                }

                if(arr[i][j] < enKucukEleman){
                    enKucukEleman= arr[i][j];
                }
            }
        }

        //yazdirma isini en distaki for loop 'un }'inden sonra yapalim.
        System.out.println("Arraydeki en kucuk element: "+ enKucukEleman);
        System.out.println("Arraydeki en buyuk element: "+ enBuyukEleman);

    }
}
