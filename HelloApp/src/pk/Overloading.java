package pk;

public class Overloading{
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