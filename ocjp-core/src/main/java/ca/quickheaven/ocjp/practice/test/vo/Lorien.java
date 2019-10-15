package ca.quickheaven.ocjp.practice.test.vo;

public class Lorien implements Comparable<Lorien> {

    private int id;
    private String name;

    public Lorien(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Lorien o) {
        return this.getName().compareTo(o.getName());
    }
}
