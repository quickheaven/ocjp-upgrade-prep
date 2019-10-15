package ca.quickheaven.ocjp.practice.test.two;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Question59 {

    public static void main(String[] args) {
        Locale locale = new Locale("ja", "JP");
        ResourceBundle bundle = ResourceBundle.getBundle("ca.quickheaven.ocjp.practice.test.two.StatBundle", locale); // 1
        Object gdp = bundle.getObject("GDP"); // 2
        System.out.println(gdp);
    }
}

class StatsBundle_ja_JP extends ListResourceBundle {

    @Override
    public Object[][] getContents() {
        return contents;
    }

    private Object[][] contents = {
            {"GDP", new Integer(21300)},
            {"Population", new Integer(125449703)},
            {"Literacy", new Double(0.99)}
    };
}
