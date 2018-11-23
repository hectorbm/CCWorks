package domain.conjuntos;

public class MainBST {
    public static void main (String[] args){


        int[] a = new int[]{ 1,2,3,4,5,6};

        MainBST.getMediana(a,0,a.length-1);


    }


    public static void getMediana(int[] a,int init,int fin){

        if((fin - init) == 0)
            MainBST.fun(a[init]);
        else if ((fin - init)==1) {
            MainBST.fun(a[(init)]);
            MainBST.fun(a[init + 1]);
        }
        else{
            if((fin - init)%2==1){ //caso pares
                MainBST.fun(a[(fin - init)/2]);
                MainBST.getMediana(a,0,((fin - init)/2)-1);
                MainBST.getMediana(a,((fin - init)/2)+1,a.length-1);
            }
            else{ //caso impares
                MainBST.fun(a[((fin - init)/2)]);
                MainBST.getMediana(a,0,((fin - init)/2)-1);
                MainBST.getMediana(a,((fin - init)/2)+1,a.length-1);
            }

        }

    }
    public static void fun(int s){
        System.out.println(s);
    }

}
