package POO;

public class this_ {
    int n;

    this_(int n){ this.n = n;}

    this_ add(this_ nb){
        this.n += nb.n;
        return this;
    }
    boolean isEqual(this_ nb){ return this.n == nb.n;}
    static public void main(String args[]){
        this_ nbr = new this_(3);
        this_ nbr1 = new this_(3);
        //nbr.add(nbr1);
        System.out.println(nbr.n);
        System.out.println(nbr == nbr1);
        System.out.println(nbr.isEqual(nbr1));


    }
    
}
