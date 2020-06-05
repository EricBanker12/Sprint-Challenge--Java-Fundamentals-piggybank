package src.main.java.classes;

public class Dollar extends Money {
    Dollar() {
        super();
        this.setValue(1.00f);
    }

    Dollar(int count) {
        super(count);
        this.setValue(1.00f);
    }

    @Override
    public String toString() {
        return "$" + this.getCount();
    }
}