package ro.ulbs.paradigme.lab4;

import java.util.Comparator;

class ComparatorGrupa implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.restante(), s2.restante());
    }
}
