package ca.quickheaven.ocjp.practice.test.vo;

public class Data {

    private int value;

    public Data(int value) {
        this.value = value;
    }

    public void output() {
        System.out.print(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
