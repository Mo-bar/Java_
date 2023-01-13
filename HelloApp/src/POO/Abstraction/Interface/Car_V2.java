package POO.Abstraction.Interface;

public class Car_V2 implements Movable, SelfDrivable {
    private float X,Y;
    private int numOfPassengers;


    public Car_V2(float x, float y, int numOfPassengers) {
        X = x;
        Y = y;
        this.numOfPassengers = numOfPassengers;
    }
    public Car_V2() {}

    public float getX() {
        return this.X;
    }

    public void setX(float X) {
        this.X = X;
    }

    public float getY() {
        return this.Y;
    }

    public void setY(float Y) {
        this.Y = Y;
    }

    public int getNumOfPassengers() {
        return this.numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    @Override
    public void moveDown() {
        Y--;
    }

    @Override
    public void moveLeft() {
        X--;
    }

    @Override
    public void moveRight() {
        X++;
    }

    @Override
    public void moveUp() {
        Y++;
    }

    @Override
    public void destination(String str) {
        System.out.println("Destination V2: "+str);
    }

    @Override
    public void drive() {
        System.out.println("Drive V2");
    }
}
