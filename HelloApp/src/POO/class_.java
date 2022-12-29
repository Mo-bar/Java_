package POO;

public class class_ {
    //? La classe est un modèle ou un prototype d'objet, et l'objet est une instance d'une classe.
    // Attributs
    String att1; // non static data member.
    int att2;
    boolean att3;
    static int att4; // static data member.
    public class_(){ // constructor par default ou  sans argument. //? il nous permet d'appeler une methode ou un attribut sans devoir instancier la classe
        this.att1 = "";
        this.att2 = 0;
    }
    public class_(String att1, int att2){ // constructeur paramétré
        this.att1 = att1;
        this.att2 = att2;
    }
    public class_(String att1, int att2, boolean att3){
        this(att1,att2);
        this.att3 = att3;
    }
    public class_(class_ c){ // constructeur de copié
        this(c.att1, c.att2, c.att3);
    }
    protected void finalize() throws Throwable
    {
        //? cette méthode est exactement le contraire d'un constructeur en Java.elle nettoyé un objet instancie par la classe
        System.out.println(att1 + " a été détruit");
    }
    static class staticNestedClass{
        void Print(){
            System.out.println("Hello from static nested class.");
        }
    }
    class NestedClass{
        void Print(){
            System.out.println("Hello from non static nested class.");
        }
    }
    public static void main(String args[]){
        class_.staticNestedClass obj = new class_.staticNestedClass();
        obj.Print();
        class_ obj1 = new class_();
        class_.NestedClass nc = obj1.new NestedClass(); 
        nc.Print();

    }
}
