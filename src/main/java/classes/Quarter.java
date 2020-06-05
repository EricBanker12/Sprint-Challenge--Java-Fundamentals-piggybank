package src.main.java.classes;

public class Quarter extends Money {
    public Quarter() {
        super();
        this.setValue(0.25f);
    }

    public Quarter(int count) {
        super(count);
        this.setValue(0.25f);
    }

    @Override
    public String toString() {
        int count = this.getCount();
        if (count == 1) {
            return "1 Quarter";
        }
        return count + " Quarters";
    }
}