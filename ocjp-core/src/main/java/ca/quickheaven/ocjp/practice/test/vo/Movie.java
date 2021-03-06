package ca.quickheaven.ocjp.practice.test.vo;

public class Movie {

    private String title;
    private double rating;

    private String label;

    @Override
    public String toString() {
        return this.title;
    }

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public Movie(String title, String label) {
        this.title = title;
        this.label = label;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String toString(String timing) {
        return title + ": " + label + "(" + timing + ")";
    }
}
