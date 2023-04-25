package ma.emsi;

import java.util.Objects;

public class Laptop {
    static private int id = 0;
    private int  serial;
    private String Marque;
    private String os;
    private Size size;

    enum  Size{
        SMALL,
        MEDUIM,
        LARGE
    }

    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Laptop() {
        this.serial = ++id;
    }

    public Laptop(String marque, String os, Size size) {
        this.serial = ++id;
        Marque = marque;
        this.os = os;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(Marque, laptop.Marque) && Objects.equals(os, laptop.os) && size == laptop.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "\n\tSerial : " + serial +
                ",\n\tMarque : '" + Marque + '\'' +
                ",\n\tOperating system : '" + os + '\'' +
                ",\n\tSize : " + size +
                "\n},";
    }
}
