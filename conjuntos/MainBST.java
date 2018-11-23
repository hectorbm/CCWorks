package domain.conjuntos;


import java.util.ArrayList;

public class MainBST {
    public static void main (String[] args){

        //Medians arrays

        ArrayList<Integer> arr30000 = new ArrayList<>();
        for (int i=0;i<30000;i++) arr30000.add(i+1);
        ArrayList<Integer> medianas = new ArrayList<>();
        MainBST.mediana(arr30000,medianas);

        ArrayList<Integer> arr60000 = new ArrayList<>();
        for (int i=0;i<60000;i++) arr60000.add(i+1);
        ArrayList<Integer> medianas2 = new ArrayList<>();
        MainBST.mediana(arr60000,medianas2);

        ArrayList<Integer> arr90000 = new ArrayList<>();
        for (int i=0;i<90000;i++) arr90000.add(i+1);
        ArrayList<Integer> medianas3 = new ArrayList<>();
        MainBST.mediana(arr90000,medianas3);

        ArrayList<Integer> arr120000 = new ArrayList<>();
        for (int i=0;i<120000;i++) arr120000.add(i+1);
        ArrayList<Integer> medianas4 = new ArrayList<>();
        MainBST.mediana(arr120000,medianas4);

        //End of medians





    }

    public static void mediana(ArrayList<Integer> arr,ArrayList<Integer> medians){
        if(arr.size()>2){
            medians.add(arr.get(arr.size()/2));
            ArrayList <Integer> arr1 = new ArrayList<>();
            arr1.addAll(arr.subList(0, arr.size()/2));
            ArrayList <Integer> arr2 = new ArrayList<>();
            arr2.addAll(arr.subList((arr.size()/2)+1,arr.size()));
            mediana(arr1,medians);
            mediana(arr2,medians);
        }
        else if(arr.size()==2){
            medians.add(arr.get(0));
            medians.add(arr.get(1));
        }
        else {
            medians.add(arr.get(0));
        }
    }


}
