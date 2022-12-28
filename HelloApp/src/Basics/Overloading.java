package Basics;

public class Overloading{

    /**
     *
     * la surcharge, aussi appelée « overloading », 
     * consiste à déclarer, dans une même classe, 
     * deux méthodes ou plusieurs de même nom mais avec Paramètres différents soit auu niveau de type donee ou le nombre de parametre
     */
    static int sum(int n1, int n2) {
        return n1+n2;
    }
    static float sum(float n1, float n2){
        return n1 +n2;
    }
    static float sum(float n1, float n2,float n3){
        return sum(n1,n2)+ n3;
    }

}