package ca.quickheaven.ocjp.practice.test.vo;

public interface FullName {

    void getFullName(Person person);

    default void setFullName(Person person) {
    }
}
