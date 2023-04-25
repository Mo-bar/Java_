package ma.emsi;


public class App 
{
    public static void main( String[] args )
    {
        Laptop l1 = new Laptop();
        System.out.println(l1);
        Laptop l2 = new Laptop("Asus", "Windows", Laptop.Size.MEDUIM) {
        };
        System.out.println(l2);
    }
}
