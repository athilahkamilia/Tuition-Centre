public class TeacherBatch {
    protected Teacher tutor[] = new Teacher[2];
    private int currsz = 0;

    public void add(Teacher a, int i) {
        tutor[i] = a;
    }

    public void add(Teacher a) {
        tutor[currsz++] = a;
    }
}
