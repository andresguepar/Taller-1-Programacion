package com.java.ex14;

public class SchoolGrades {
    public double physics;
    public double chemistry;
    public double biology;
    public double maths;
    public double computerScience;

    public double finalGrade() {
        return (physics + chemistry + biology + maths + computerScience) / 5;

    }

    public String showMessage() {
        if (finalGrade() <= 5.99) {
            return ("Good Grade");
        } else if (finalGrade() <= 8) {
            return ("Bad Grade");
        } else if (finalGrade() > 8.01) {
            return ("Excellent Grade");
        } else {
            return null;
        }
    }
}
