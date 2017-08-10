package com.example.android.a5_reportcard;

import java.util.ArrayList;

//Name of the class
public class ReportCard {

    public static void main(String[] args) {
        //Here we create a list of Grades
        ArrayList<ReportCard> years = new ArrayList<>();
        years.add(new ReportCard(2017, "A", true));
        years.add(new ReportCard(2016, "C", true));
        years.add(new ReportCard(2015, "A", true));
        years.add(new ReportCard(2014, "B", true));
        years.add(new ReportCard(2013, "B", true));
        years.add(new ReportCard(2012, "D", false));
        years.add(new ReportCard(2011, "C", true));
        years.add(new ReportCard(2010, "A", true));

        for (int i = 0; i < 8; ++i) {
            //Here we use a getter
            if (years.get(i).getYear() < 2018 - i) {
                //Here we use a setter
                years.get(i).setYear(2017 - i);
            }

            //Here we print information about the grade
            System.out.println(years.toString());
        }
    }

    //Private variables
    private int year;
    private String grade;

    //Private constant
    private boolean passed;

    //Constructor
    public ReportCard( int year, String grade,boolean passed){
        this.year = year;
        this.grade = grade;
        this.passed = passed;
    }

    //Accessors (a.k.a. getters)

    public int getYear() {
        return year;
    }

    public String getGrade() {
        return grade;
    }

    public boolean isPassed() { return passed; }

    //Modifiers (a.k.a. setters)

    /**
     * Sets the year for the current grade
     *
     * @param year an integer with the valid values between 2010 and 2017
     * @return true if value has been assigned and false if the parameter is invalid
     */

    public boolean setYear(int year) {
        //Validate your parameters, valid year for a grade is between 2010 and 2017
        if (year > 2009 && year < 2018) {
            this.year = year;
            return true;
        }
        return false;
    }

    public void setGrade(String grade) { this.grade = grade; }

    public void isPassed(boolean passed) {
        this.passed = passed;
    }

    //We cannot provide a setter for a constant, it has to be specified through a constructor

    //@toString method allows you to print information about the current object.

    @Override
    public String toString() {

        String passed = "Not passed";

        if (isPassed()) {
            passed = "Passed";
        }

        return String.format("Year: %s\nGrade: %s\nIs the year passed: %s", year, grade, passed);
    }

}
