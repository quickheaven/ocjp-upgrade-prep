package ca.quickheaven.ocjp.practice.test.vo;

public class Validator {

    private boolean valid;

    public Validator(boolean valid) {
        this.valid = valid;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
