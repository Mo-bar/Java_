package DataStructure.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _ArrayList extends ArrayList {
    /**
     ** ArrayList : 
     * La classe ArrayList est classe utilise pour stocker à des données de type objets
     * ArrayList<Object> list = new ArrayList<Object>(int Capacity);
     * variableType object = new ObjectType;
     * 
     * La classe ArrayList accepte uniquement les types donnees Object, Elle n'accepet plus les primitifs type de donnees
     * comme 'int', 'float' etc.
     * 
     * pour les utilise. on doit specifier un equivalent s'appel en Java 'Wrapper class' par exemple 
     * on utilise : 
     *      - Integer pour int.
     *      - Double pour double.
     *      - Boolean pour boolean.
     *      - etc
     ** Difference between list and arraylist in declaration java
        Declaration Arraylist object as list, it's make changing implementation easier. for exemple when can change arraylist to linkedlist or hashset ...
     *? Exemple
        Collection<String> stringList = new ArrayList<String>();
        //Client side
        stringList = new LinkedList<String>();

        stringList = new HashSet<String>();
        //stringList = new HashSet<>(); java 1.7 and 1.8



It is easy to change the implementation to 
     */
    public static void main(String args[]){
        List<Integer> list = new ArrayList<Integer>(12);
        list.add(12);
        list.add(13);
        list.add(14);

        int listSize = list.size();
        for(int i = 0; i < listSize; i++ ){
            System.out.println(list.get(i));
        }
        System.out.println("_____________________");
        for (Integer integer : list) {
            System.out.println(integer);
        }
        Collections.sort(list, Collections.reverseOrder());
        list.forEach(el -> System.out.println(el));
        //************************************** */
        list.addAll(1,Arrays.asList(15,16,18));
        System.out.println("______________________");
        list.set(0, 99);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove((Integer) 18); // casting
        list.remove(Integer.valueOf(14)); // casting
        System.out.println(list);
        list.removeIf(n-> n == (Integer)13 );
        System.out.println(list);

        Object[] arr = new Object[5];  // polymorphig array
        arr[0] = 'C';
        arr[1] = true;
        arr[3] = "sssssssss";
        System.out.println("________________");

        //list.removeRange   to run removeRange methode we must change declared variable list to Arraylist cause , removeRange not commun between  ArrayList class and list interface

    }
    
}


