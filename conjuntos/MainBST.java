package domain.conjuntos;


import java.util.ArrayList;
import java.util.Calendar;
public class MainBST {
    public static void main (String[] args){

        //Medians arrays

        ArrayList<Integer> arr30000 = new ArrayList<>();
        for (int i=0;i<3000;i++) arr30000.add(i+1);
        ArrayList<Integer> medianas = new ArrayList<>();
        MainBST.mediana(arr30000,medianas);

        ArrayList<Integer> arr60000 = new ArrayList<>();
        for (int i=0;i<6000;i++) arr60000.add(i+1);
        ArrayList<Integer> medianas2 = new ArrayList<>();
        MainBST.mediana(arr60000,medianas2);

        ArrayList<Integer> arr90000 = new ArrayList<>();
        for (int i=0;i<9000;i++) arr90000.add(i+1);
        ArrayList<Integer> medianas3 = new ArrayList<>();
        MainBST.mediana(arr90000,medianas3);

        ArrayList<Integer> arr120000 = new ArrayList<>();
        for (int i=0;i<12000;i++) arr120000.add(i+1);
        ArrayList<Integer> medianas4 = new ArrayList<>();
        MainBST.mediana(arr120000,medianas4);

        //End of medians

        /*
        System.out.println("Adding started");

        //Adding 30.000 to bstSet
        BSTConjunto<Integer> bstSet1 = new BSTConjunto<>();
        long initialTime = (Calendar.getInstance()).getTimeInMillis();
        medianas.forEach(x->bstSet1.add(new Integer(x)));
        long finalTime = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Adding 30.000 elements: " + (finalTime-initialTime));


        //Adding 60.000 to bstSet
        BSTConjunto<Integer> bstSet2 = new BSTConjunto<>();
        long initialTime2 = (Calendar.getInstance()).getTimeInMillis();
        medianas2.forEach(x->bstSet2.add(new Integer(x)));
        long finalTime2 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Adding 60.000 elements: " + (finalTime2-initialTime2));


        //Adding 90.000 to bstSet
        BSTConjunto<Integer> bstSet3 = new BSTConjunto<>();
        long initialTime3 = (Calendar.getInstance()).getTimeInMillis();
        medianas3.forEach(x->bstSet3.add(new Integer(x)));
        long finalTime3 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Adding 90.000 elements: " + (finalTime3-initialTime3));


        //Adding 90.000 to bstSet
        BSTConjunto<Integer> bstSet4 = new BSTConjunto<>();
        long initialTime4 = (Calendar.getInstance()).getTimeInMillis();
        medianas4.forEach(x->bstSet4.add(new Integer(x)));
        long finalTime4 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Adding 120.000 elements: " + (finalTime4-initialTime4));
        */

        /*
        //Union 30.000 elements both Set

        BSTConjunto<Integer> bstSetUnion1 = new BSTConjunto<>();
        medianas.forEach(x->bstSetUnion1.add(new Integer(x)));
        BSTConjunto<Integer> bstSetUnion2 = new BSTConjunto<>();
        medianas.forEach(x->bstSetUnion2.add(new Integer(x)));
        long initialTimeUnion1 = (Calendar.getInstance()).getTimeInMillis();
        bstSetUnion1.union(bstSetUnion2);
        long finalTimeUnion1 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Union 30.000 in time: " + (finalTimeUnion1-initialTimeUnion1));


        //Union 60.000 elements both Set

        BSTConjunto<Integer> bstSetUnion3 = new BSTConjunto<>();
        medianas2.forEach(x->bstSetUnion3.add(new Integer(x)));
        BSTConjunto<Integer> bstSetUnion4 = new BSTConjunto<>();
        medianas2.forEach(x->bstSetUnion4.add(new Integer(x)));
        long initialTimeUnion2 = (Calendar.getInstance()).getTimeInMillis();
        bstSetUnion3.union(bstSetUnion4);
        long finalTimeUnion2 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Union 60.000 in time: " + (finalTimeUnion2-initialTimeUnion2));


        //Union 90.000 elements both Set

        BSTConjunto<Integer> bstSetUnion5 = new BSTConjunto<>();
        medianas3.forEach(x->bstSetUnion5.add(new Integer(x)));
        BSTConjunto<Integer> bstSetUnion6 = new BSTConjunto<>();
        medianas3.forEach(x->bstSetUnion6.add(new Integer(x)));
        long initialTimeUnion3 = (Calendar.getInstance()).getTimeInMillis();
        bstSetUnion5.union(bstSetUnion6);
        long finalTimeUnion3 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Union 90.000 in time: " + (finalTimeUnion3-initialTimeUnion3));

        //Union 120.000 elements both Set

        BSTConjunto<Integer> bstSetUnion7 = new BSTConjunto<>();
        medianas4.forEach(x->bstSetUnion7.add(new Integer(x)));
        BSTConjunto<Integer> bstSetUnion8 = new BSTConjunto<>();
        medianas4.forEach(x->bstSetUnion8.add(new Integer(x)));
        long initialTimeUnion4 = (Calendar.getInstance()).getTimeInMillis();
        bstSetUnion7.union(bstSetUnion8);
        long finalTimeUnion4 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Union 120.000 in time: " + (finalTimeUnion4-initialTimeUnion4));
        */
        /*
        //Intersection 30.000 elements both Set

        BSTConjunto<Integer> bstSetIntersection1 = new BSTConjunto<>();
        medianas.forEach(x->bstSetIntersection1.add(new Integer(x)));
        BSTConjunto<Integer> bstSetIntersection2 = new BSTConjunto<>();
        medianas.forEach(x->bstSetIntersection2.add(new Integer(x)));
        long initialTimeIntersection1 = (Calendar.getInstance()).getTimeInMillis();
        bstSetIntersection1.intersection(bstSetIntersection2);
        long finalTimeIntersection1 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Intersection 3.000 in time: " + (finalTimeIntersection1-initialTimeIntersection1));


        //Intersection 60.000 elements both Set

        BSTConjunto<Integer> bstSetIntersection3 = new BSTConjunto<>();
        medianas2.forEach(x->bstSetIntersection3.add(new Integer(x)));
        BSTConjunto<Integer> bstSetIntersection4 = new BSTConjunto<>();
        medianas2.forEach(x->bstSetIntersection4.add(new Integer(x)));
        long initialTimeIntersection2 = (Calendar.getInstance()).getTimeInMillis();
        bstSetIntersection3.intersection(bstSetIntersection4);
        long finalTimeIntersection2 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Intersection 6.000 in time: " + (finalTimeIntersection2-initialTimeIntersection2));


        //Intersection 90.000 elements both Set

        BSTConjunto<Integer> bstSetIntersection5 = new BSTConjunto<>();
        medianas3.forEach(x->bstSetIntersection5.add(new Integer(x)));
        BSTConjunto<Integer> bstSetIntersection6 = new BSTConjunto<>();
        medianas3.forEach(x->bstSetIntersection6.add(new Integer(x)));
        long initialTimeIntersection3 = (Calendar.getInstance()).getTimeInMillis();
        bstSetIntersection5.intersection(bstSetIntersection6);
        long finalTimeIntersection3 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Intersection 9.000 in time: " + (finalTimeIntersection3-initialTimeIntersection3));


        //Intersection 120.000 elements both Set

        BSTConjunto<Integer> bstSetIntersection7 = new BSTConjunto<>();
        medianas4.forEach(x->bstSetIntersection7.add(new Integer(x)));
        BSTConjunto<Integer> bstSetIntersection8 = new BSTConjunto<>();
        medianas4.forEach(x->bstSetIntersection8.add(new Integer(x)));
        long initialTimeIntersection4 = (Calendar.getInstance()).getTimeInMillis();
        bstSetIntersection7.intersection(bstSetIntersection8);
        long finalTimeIntersection4 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Intersection 12.000 in time: " + (finalTimeIntersection4-initialTimeIntersection4));

        */

        //Equals 30.000 elements both Set

  /*    BSTConjunto<Integer> bstSet1 = new BSTConjunto<>();
        medianas.forEach(x->bstSet1.add(new Integer(x)));
        BSTConjunto<Integer> bstSet2 = new BSTConjunto<>();
        medianas.forEach(x->bstSet2.add(new Integer(x)));
        long initialTime1 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Result: " + bstSet1.equals(bstSet2));
        long finalTime1 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Equals? in time: " + (finalTime1-initialTime1));

        //Equals 60.000 elements both Set

        BSTConjunto<Integer> bstSet3 = new BSTConjunto<>();
        medianas2.forEach(x->bstSet3.add(new Integer(x)));
        BSTConjunto<Integer> bstSet4 = new BSTConjunto<>();
        medianas2.forEach(x->bstSet4.add(new Integer(x)));
        long initialTime2 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Result: " + bstSet3.equals(bstSet4));
        long finalTime2 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Equals? in time: " + (finalTime2-initialTime2));

        //Equals 90.000 elements both Set

        BSTConjunto<Integer> bstSet5 = new BSTConjunto<>();
        medianas3.forEach(x->bstSet5.add(new Integer(x)));
        BSTConjunto<Integer> bstSet6 = new BSTConjunto<>();
        medianas3.forEach(x->bstSet6.add(new Integer(x)));
        long initialTime3 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Result: " + bstSet5.equals(bstSet6));
        long finalTime3 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Equals? in time: " + (finalTime3-initialTime3));

        //Equals 120.000 elements both Set

        BSTConjunto<Integer> bstSet7 = new BSTConjunto<>();
        medianas4.forEach(x->bstSet7.add(new Integer(x)));
        BSTConjunto<Integer> bstSet8 = new BSTConjunto<>();
        medianas4.forEach(x->bstSet8.add(new Integer(x)));
        long initialTime4 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Result: " + bstSet7.equals(bstSet8));
        long finalTime4 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Equals? in time: " + (finalTime4-initialTime4));
        */



    }

    //Aux function to have a balanced tree
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
