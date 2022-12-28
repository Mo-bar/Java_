package Basics;

/*
 * Dans Call by value, une copie de la variable est passée alors que dans Call by reference,
 *  une variable elle-même est passée. Dans Appel par valeur, 
 * les arguments réels et formels seront créés dans différents
 *  emplacements de mémoire tandis que dans Appel par référence, 
 * les arguments réels et formels seront créés dans le même emplacement mémoire.
 */
public class calledByReffrence {
    static void setArray(int[] x){
        x[0] = 10;
    }

    public static void main(String[] args){
        int ary[] = {1,2,3};
        setArray(ary);
        System.out.println(ary[0]);
    }
}
