package domain.conjuntos;

import java.util.Calendar;

import static java.lang.Thread.sleep;

public class MainALConjunto {
    public static void main (String[] args) throws InterruptedException {
        /*
        //Test for 30.000 elements
        Conjunto<Integer> conj = new Conjunto<>();
        long initialTime = (Calendar.getInstance()).getTimeInMillis();
        for(int j=0;j<30000;j++) conj.add(j);
        long finalTime = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Adding 30.000 elements: " + (finalTime-initialTime));

        //Test for 60.000 elements
        Conjunto<Integer> conj2 = new Conjunto<>();
        long initialTime2 = (Calendar.getInstance()).getTimeInMillis();
        for(int j=0;j<60000;j++) conj2.add(j);
        long finalTime2 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Adding 60.000 elements: " + (finalTime2-initialTime2));

        //Test for 90.000 elements
        Conjunto<Integer> conj3 = new Conjunto<>();
        long initialTime3 = (Calendar.getInstance()).getTimeInMillis();
        for(int j=0;j<90000;j++) conj3.add(j);
        long finalTime3 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Adding 90.000 elements: " + (finalTime3-initialTime3));

        //Test for 120.000 elements
        Conjunto<Integer> conj4 = new Conjunto<>();
        long initialTime4 = (Calendar.getInstance()).getTimeInMillis();
        for(int j=0;j<120000;j++) conj4.add(j);
        long finalTime4 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Adding 120.000 elements: " + (finalTime4-initialTime4));
        */

        /*
        //Test for 30.000 elements union
             //Generate another set
             Conjunto<Integer> conj5 = new Conjunto<>();
             for(int j=0;j<30000;j++) conj5.add(j);
             Conjunto<Integer> conj6 = new Conjunto<>();
             for(int j=0;j<30000;j++) conj6.add(j);
        long initialTimeUnion = (Calendar.getInstance()).getTimeInMillis();
        conj5.union(conj6);
        long finalTimeUnion = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Union 30.000 elements: " + (finalTimeUnion-initialTimeUnion));

        //Test for 60.000 elements union
        //Generate another set
            Conjunto<Integer> conj7 = new Conjunto<>();
            for(int j=0;j<60000;j++) conj7.add(j);
            Conjunto<Integer> conj8 = new Conjunto<>();
            for(int j=0;j<60000;j++) conj8.add(j);
        long initialTimeUnion2 = (Calendar.getInstance()).getTimeInMillis();
        conj7.union(conj8);
        long finalTimeUnion2 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Union 60.000 elements: " + (finalTimeUnion2-initialTimeUnion2));

        //Test for 90.000 elements union
        //Generate another set
            Conjunto<Integer> conj9 = new Conjunto<>();
            for(int j=0;j<90000;j++) conj9.add(j);
            Conjunto<Integer> conj10 = new Conjunto<>();
            for(int j=0;j<90000;j++) conj10.add(j);
        long initialTimeUnion3 = (Calendar.getInstance()).getTimeInMillis();
        conj9.union(conj10);
        long finalTimeUnion3 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Union 90.000 elements: " + (finalTimeUnion3-initialTimeUnion3));

        //Test for 120.000 elements union
        //Generate another set
            Conjunto<Integer> conj11 = new Conjunto<>();
            for(int j=0;j<120000;j++) conj11.add(j);
            Conjunto<Integer> conj12 = new Conjunto<>();
            for(int j=0;j<120000;j++) conj12.add(j);
        long initialTimeUnion4 = (Calendar.getInstance()).getTimeInMillis();
        conj11.union(conj12);
        long finalTimeUnion4 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Union 120.000 elements: " + (finalTimeUnion4-initialTimeUnion4));
        */

        /*
        //Test for 30.000 elements intersection
        //Generate another set
            Conjunto<Integer> conj13 = new Conjunto<>();
            for(int j=0;j<30000;j++) conj13.add(j);
            Conjunto<Integer> conj14 = new Conjunto<>();
            for(int j=0;j<30000;j++) conj14.add(j);
        long initialTimeIntersection = (Calendar.getInstance()).getTimeInMillis();
        conj13.intersection(conj14);
        long finalTimeIntersection = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Intersection 30.000 elements: " + (finalTimeIntersection-initialTimeIntersection));

        //Test for 60.000 elements intersection
        //Generate another set
            Conjunto<Integer> conj15 = new Conjunto<>();
            for(int j=0;j<60000;j++) conj15.add(j);
            Conjunto<Integer> conj16 = new Conjunto<>();
            for(int j=0;j<60000;j++) conj16.add(j);
        long initialTimeIntersection2 = (Calendar.getInstance()).getTimeInMillis();
        conj15.intersection(conj16);
        long finalTimeIntersection2 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Intersection 60.000 elements: " + (finalTimeIntersection2-initialTimeIntersection2));

        //Test for 90.000 elements intersection
        //Generate another set
            Conjunto<Integer> conj17 = new Conjunto<>();
            for(int j=0;j<90000;j++) conj17.add(j);
            Conjunto<Integer> conj18 = new Conjunto<>();
            for(int j=0;j<90000;j++) conj18.add(j);
        long initialTimeIntersection3 = (Calendar.getInstance()).getTimeInMillis();
        conj17.intersection(conj18);
        long finalTimeIntersection3 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Intersection 90.000 elements: " + (finalTimeIntersection3-initialTimeIntersection3));

        //Test for 120.000 elements intersection
        //Generate another set
            Conjunto<Integer> conj19 = new Conjunto<>();
            for(int j=0;j<120000;j++) conj19.add(j);
            Conjunto<Integer> conj20 = new Conjunto<>();
            for(int j=0;j<120000;j++) conj20.add(j);
        long initialTimeIntersection4 = (Calendar.getInstance()).getTimeInMillis();
        conj19.intersection(conj20);
        long finalTimeIntersection4 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Intersection 120.000 elements: " + (finalTimeIntersection4-initialTimeIntersection4));
        */

        /*
        //Test for 30.000 elements bool equals

        Conjunto<Integer> conj21 = new Conjunto<>();
        for(int j=0;j<30000;j++) conj21.add(j);
        Conjunto<Integer> conj22 = new Conjunto<>();
        for(int j=0;j<30000;j++) conj22.add(j);
        long initialTimeEquals = (Calendar.getInstance()).getTimeInMillis();
        boolean result=conj21.equals(conj22);
        long finalTimeEquals = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Equals 30.000 elements? " + result + " in time: " + (finalTimeEquals-initialTimeEquals));

        //Test for 60.000 elements bool equals

        Conjunto<Integer> conj23 = new Conjunto<>();
        for(int j=0;j<60000;j++) conj23.add(j);
        Conjunto<Integer> conj24 = new Conjunto<>();
        for(int j=0;j<60000;j++) conj24.add(j);
        long initialTimeEquals2 = (Calendar.getInstance()).getTimeInMillis();
        boolean result2=conj23.equals(conj24);
        long finalTimeEquals2 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Equals 60.000 elements? " + result2 + " in time: " + (finalTimeEquals2-initialTimeEquals2));

        //Test for 90.000 elements bool equals

        Conjunto<Integer> conj25 = new Conjunto<>();
        for(int j=0;j<90000;j++) conj25.add(j);
        Conjunto<Integer> conj26 = new Conjunto<>();
        for(int j=0;j<90000;j++) conj26.add(j);
        long initialTimeEquals3 = (Calendar.getInstance()).getTimeInMillis();
        boolean result3=conj25.equals(conj26);
        long finalTimeEquals3 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Equals 90.000 elements? " + result3 + " in time: " + (finalTimeEquals3-initialTimeEquals3));

        //Test for 120.000 elements bool equals

        Conjunto<Integer> conj27 = new Conjunto<>();
        for(int j=0;j<120000;j++) conj27.add(j);
        Conjunto<Integer> conj28 = new Conjunto<>();
        for(int j=0;j<120000;j++) conj28.add(j);
        long initialTimeEquals4 = (Calendar.getInstance()).getTimeInMillis();
        boolean result4=conj27.equals(conj28);
        long finalTimeEquals4 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Equals 120.000 elements? " + result4 + " in time: " + (finalTimeEquals4-initialTimeEquals4));
         */
        /*
        //Test for 30.000 elements size
        Conjunto<Integer> conj29 = new Conjunto<>();
        for(int j=0;j<30000;j++) conj29.add(j);
        long initialTimeSize = (Calendar.getInstance()).getTimeInMillis();
        int size=conj29.setSize();
        long finalTimeSize = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Size: " + size + " in time: " + (finalTimeSize-initialTimeSize));


        //Test for 60.000 elements size
        Conjunto<Integer> conj30 = new Conjunto<>();
        for(int j=0;j<60000;j++) conj30.add(j);
        long initialTimeSize2 = (Calendar.getInstance()).getTimeInMillis();
        int size2=conj30.setSize();
        long finalTimeSize2 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Size: " + size2 + " in time: " + (finalTimeSize2-initialTimeSize2));

        //Test for 90.000 elements size
        Conjunto<Integer> conj31 = new Conjunto<>();
        for(int j=0;j<90000;j++) conj31.add(j);
        long initialTimeSize3 = (Calendar.getInstance()).getTimeInMillis();
        int size3=conj31.setSize();
        long finalTimeSize3 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Size: " + size3 + " in time: " + (finalTimeSize3-initialTimeSize3));

        //Test for 120.000 elements size
        Conjunto<Integer> conj32 = new Conjunto<>();
        for(int j=0;j<120000;j++) conj32.add(j);
        long initialTimeSize4 = (Calendar.getInstance()).getTimeInMillis();
        int size4=conj32.setSize();
        long finalTimeSize4 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Size: " + size4 + " in time: " + (finalTimeSize4-initialTimeSize4));
        */
         /*


        //Test for 30.000 elements contains
        Conjunto<Integer> conj33 = new Conjunto<>();
        for(int j=0;j<30000;j++) conj33.add(j);
        long initialTimeContains = (Calendar.getInstance()).getTimeInMillis();
        boolean resultContains=conj33.contains(29999);
        long finalTimeContains = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Contains: " + resultContains + " in time: " + (finalTimeContains-initialTimeContains));


        //Test for 60.000 elements contains
        Conjunto<Integer> conj34 = new Conjunto<>();
        for(int j=0;j<60000;j++) conj34.add(j);
        long initialTimeContains2 = (Calendar.getInstance()).getTimeInMillis();
        boolean resultContains2=conj34.contains(59999);
        long finalTimeContains2 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Contains: " + resultContains2 + " in time: " + (finalTimeContains2-initialTimeContains2));

        //Test for 90.000 elements contains
        Conjunto<Integer> conj35 = new Conjunto<>();
        for(int j=0;j<90000;j++) conj35.add(j);
        long initialTimeContains3 = (Calendar.getInstance()).getTimeInMillis();
        boolean resultContains3=conj35.contains(89999);
        long finalTimeContains3 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Contains: " + resultContains3 + " in time: " + (finalTimeContains3-initialTimeContains3));

        //Test for 120.000 elements contains
        Conjunto<Integer> conj36 = new Conjunto<>();
        for(int j=0;j<120000;j++) conj36.add(j);
        long initialTimeContains4= (Calendar.getInstance()).getTimeInMillis();
        boolean resultContains4=conj36.contains(119999);
        long finalTimeContains4 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Contains: " + resultContains4 + " in time: " + (finalTimeContains4-initialTimeContains4));
        */
    }
}
