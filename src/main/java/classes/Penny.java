package src.main.java.classes;

public class Penny extends Money {
    public Penny() {
        super();
        this.setValue(0.01f);
    }

    public Penny(int count) {
        super(count);
        this.setValue(0.01f);
    }

    @Override
    public String toString() {
        int count = this.getCount();
        if (count == 1) {
            return "1 Penny";
        }
        return count + " Pennies";
    }
}