import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a rondom number : ");
            int  inputInt = in.nextInt();
            System.out.println(inputInt);
        }
    }
}
