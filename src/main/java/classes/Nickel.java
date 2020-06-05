package src.main.java.classes;

public class Nickel extends Money {
    public Nickel() {
        super();
        this.setValue(0.05f);
    }

    public Nickel(int count) {
        super(count);
        this.setValue(0.05f);
    }

    @Override
    public String toString() {
        int count = this.getCount();
        if (count == 1) {
            return "1 Nickel";
        }
        return count + " Nickels";
    }
}