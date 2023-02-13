package comparison;

public class Student implements Comparable<Student> {
    int roll;
    float marks;

    public Student(float marks, int roll) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.marks - o.marks);
        return diff;
    }
}
