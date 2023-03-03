
public class StudentBatch {
    protected Student students[] = new Student[2];
    private int currsz = 0;

    public void add(Student s, int i) {
        students[i] = s;
    }

    public void add(Student s) {
        students[currsz++] = s;
    }

}

