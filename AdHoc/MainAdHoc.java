package domain.AdHoc;

import java.util.Calendar;

public class MainAdHoc {
    public static void main(String[] args){

        /*
        //Test for 30.000 elements add and union before contains
        //Generate another set
        AdHocSet<Integer> conj13 = new AdHocSet<>();
        for(int j=0;j<30000;j++) conj13.add(j);
        AdHocSet<Integer> conj14 = new AdHocSet<>();
        for(int j=0;j<30000;j++) conj14.add(j);
        conj13.union(conj14);
        conj13.intersection(conj14);
        long initialTimeContains5= (Calendar.getInstance()).getTimeInMillis();
        boolean resultContains5=conj13.contains(29999);
        long finalTimeContains5 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Contains: " + resultContains5 + " in time: " + (finalTimeContains5-initialTimeContains5));


        //Test for 60.000 elements add and union before contains
        //Generate another set
        AdHocSet<Integer> conj15 = new AdHocSet<>();
        for(int j=0;j<60000;j++) conj15.add(j);
        AdHocSet<Integer> conj16 = new AdHocSet<>();
        for(int j=0;j<60000;j++) conj16.add(j);
        conj15.union(conj16);
        conj15.intersection(conj16);
        long initialTimeContains6= (Calendar.getInstance()).getTimeInMillis();
        boolean resultContains6=conj15.contains(59999);
        long finalTimeContains6 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Contains: " + resultContains6 + " in time: " + (finalTimeContains6-initialTimeContains6));


        //Test for 90.000 elements add and union before contains
        //Generate another set
        AdHocSet<Integer> conj17 = new AdHocSet<>();
        for(int j=0;j<90000;j++) conj17.add(j);
        AdHocSet<Integer> conj18 = new AdHocSet<>();
        for(int j=0;j<90000;j++) conj18.add(j);
        conj17.union(conj18);
        conj17.intersection(conj18);
        long initialTimeContains7= (Calendar.getInstance()).getTimeInMillis();
        boolean resultContains7=conj17.contains(89999);
        long finalTimeContains7 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Contains: " + resultContains7 + " in time: " + (finalTimeContains7-initialTimeContains7));


        //Test for 120.000 elements add and union before contains
        //Generate another set
        AdHocSet<Integer> conj19 = new AdHocSet<>();
        for(int j=0;j<120000;j++) conj19.add(j);
        AdHocSet<Integer> conj20 = new AdHocSet<>();
        for(int j=0;j<120000;j++) conj20.add(j);
        conj19.union(conj20);
        conj19.intersection(conj20);
        long initialTimeContains8= (Calendar.getInstance()).getTimeInMillis();
        boolean resultContains8=conj19.contains(119999);
        long finalTimeContains8 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Contains: " + resultContains8 + " in time: " + (finalTimeContains8-initialTimeContains8));
        */

        //Test for 30.000 elements add,union,intersection before bool equals
        /*
        AdHocSet<Integer> conj21 = new AdHocSet<>();
        for(int j=0;j<30000;j++) conj21.add(j);
        AdHocSet<Integer> conj22 = new AdHocSet<>();
        for(int j=0;j<30000;j++) conj22.add(j);
        conj21.intersection(conj22);
        conj21.union(conj22);
        long initialTimeEquals = (Calendar.getInstance()).getTimeInMillis();
        boolean result=conj21.equals(conj22);
        long finalTimeEquals = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Equals 30.000 elements? " + result + " in time: " + (finalTimeEquals-initialTimeEquals));

        //Test for 60.000 elements add,union,intersection before bool equals

        AdHocSet<Integer> conj23 = new AdHocSet<>();
        for(int j=0;j<60000;j++) conj23.add(j);
        AdHocSet<Integer> conj24 = new AdHocSet<>();
        for(int j=0;j<60000;j++) conj24.add(j);
        conj23.intersection(conj24);
        conj23.union(conj24);
        long initialTimeEquals2 = (Calendar.getInstance()).getTimeInMillis();
        boolean result2=conj23.equals(conj24);
        long finalTimeEquals2 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Equals 60.000 elements? " + result2 + " in time: " + (finalTimeEquals2-initialTimeEquals2));

        //Test for 90.000 elements add,union,intersection before bool equals

        AdHocSet<Integer> conj25 = new AdHocSet<>();
        for(int j=0;j<90000;j++) conj25.add(j);
        AdHocSet<Integer> conj26 = new AdHocSet<>();
        for(int j=0;j<90000;j++) conj26.add(j);
        conj25.intersection(conj26);
        conj25.union(conj26);
        long initialTimeEquals3 = (Calendar.getInstance()).getTimeInMillis();
        boolean result3=conj25.equals(conj26);
        long finalTimeEquals3 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Equals 90.000 elements? " + result3 + " in time: " + (finalTimeEquals3-initialTimeEquals3));

        //Test for 120.000 elements add,union,intersection before bool equals

        AdHocSet<Integer> conj27 = new AdHocSet<>();
        for(int j=0;j<120000;j++) conj27.add(j);
        AdHocSet<Integer> conj28 = new AdHocSet<>();
        for(int j=0;j<120000;j++) conj28.add(j);
        conj27.intersection(conj28);
        conj27.union(conj28);
        long initialTimeEquals4 = (Calendar.getInstance()).getTimeInMillis();
        boolean result4=conj27.equals(conj28);
        long finalTimeEquals4 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Equals 120.000 elements? " + result4 + " in time: " + (finalTimeEquals4-initialTimeEquals4));
        */

        //Test for 30.000 elements add,intersection, union before size
        AdHocSet<Integer> conj29 = new AdHocSet<>();
        for(int j=0;j<30000;j++) conj29.add(j);
        AdHocSet<Integer> conj30 = new AdHocSet<>();
        for(int j=0;j<30000;j++) conj30.add(j);
        conj29.intersection(conj30);
        conj29.union(conj30);
        long initialTimeSize = (Calendar.getInstance()).getTimeInMillis();
        int size=conj29.size();
        long finalTimeSize = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Size: " + size + " in time: " + (finalTimeSize-initialTimeSize));

        //Test for 60.000 elements add,intersection, union before size
        AdHocSet<Integer> conj31 = new AdHocSet<>();
        for(int j=0;j<60000;j++) conj31.add(j);
        AdHocSet<Integer> conj32 = new AdHocSet<>();
        for(int j=0;j<60000;j++) conj32.add(j);
        conj31.intersection(conj32);
        conj31.union(conj32);
        long initialTimeSize2 = (Calendar.getInstance()).getTimeInMillis();
        int size2=conj31.size();
        long finalTimeSize2 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Size: " + size2 + " in time: " + (finalTimeSize2-initialTimeSize2));

        //Test for 90.000 elements add,intersection, union before size
        AdHocSet<Integer> conj33 = new AdHocSet<>();
        for(int j=0;j<90000;j++) conj33.add(j);
        AdHocSet<Integer> conj34 = new AdHocSet<>();
        for(int j=0;j<90000;j++) conj34.add(j);
        conj33.intersection(conj34);
        conj33.union(conj34);
        long initialTimeSize3 = (Calendar.getInstance()).getTimeInMillis();
        int size3=conj33.size();
        long finalTimeSize3 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Size: " + size3 + " in time: " + (finalTimeSize3-initialTimeSize3));

        //Test for 120.000 elements add,intersection, union before size
        AdHocSet<Integer> conj35 = new AdHocSet<>();
        for(int j=0;j<120000;j++) conj35.add(j);
        AdHocSet<Integer> conj36 = new AdHocSet<>();
        for(int j=0;j<120000;j++) conj36.add(j);
        conj35.intersection(conj36);
        conj35.union(conj36);
        long initialTimeSize4 = (Calendar.getInstance()).getTimeInMillis();
        int size4=conj35.size();
        long finalTimeSize4 = (Calendar.getInstance()).getTimeInMillis();
        System.out.println("Size: " + size4 + " in time: " + (finalTimeSize4-initialTimeSize4));


    }
}
