package ca.quickheaven.ocjp.practice.test.vo;

import java.util.Comparator;

public class LorienComparator implements Comparator<Lorien> {

    @Override
    public int compare(Lorien o1, Lorien o2) {
        return o1.compareTo(o2);
    }
}
