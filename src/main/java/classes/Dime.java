package src.main.java.classes;

public class Dime extends Money {
    public Dime() {
        super();
        this.setValue(0.10f);
    }

    public Dime(int count) {
        super(count);
        this.setValue(0.10f);
    }

    @Override
    public String toString() {
        int count = this.getCount();
        if (count == 1) {
            return "1 Dime";
        }
        return count + " Dimes";
    }
}