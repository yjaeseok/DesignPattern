package lib;

public class Age implements Cloneable {

    private int year;
    private int value;

    public Age(int year, int value) {
        this.year = year;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    Age copy() throws CloneNotSupportedException {
        return (Age) clone();
    }
}
