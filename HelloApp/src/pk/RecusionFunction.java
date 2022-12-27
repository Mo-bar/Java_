package pk;

public class RecusionFunction {

    /*
     * La récursivité c'est  une fonction s'appelle elle-même jusqu'à atteindre une condition d'arrêt ou cas de base.
     */
    static int factorial(int n){
        if(n == 1 || n == 0) return n; // cas de bas 
        return n* factorial(n-1);
    }
}
