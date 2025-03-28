package ro.ulbs.paradigme.lab4;

import java.util.Comparator;

public class ComparatorNume implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        int cmp = s1.nume.compareTo(s2.nume);
        return (cmp != 0) ? cmp : Integer.compare(s1.grupa, s2.grupa);
    }
}





