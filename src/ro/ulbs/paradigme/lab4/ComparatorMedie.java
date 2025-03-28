package ro.ulbs.paradigme.lab4;

import java.util.Comparator;

class ComparatorMedie implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.medie(), s1.medie());
    }
}