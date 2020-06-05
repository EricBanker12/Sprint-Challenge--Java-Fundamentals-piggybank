package src.main.java.classes;

public abstract class Money {
    private int count = 1;
    private float value;

    public Money() {}

    public Money(int count) {
        setCount(count);
    }

    public int getCount() {
        return count;
    }

    public float getTotal() {
        return this.count * this.value;
    }

    public float getValue() {
        return value;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public abstract String toString();
}