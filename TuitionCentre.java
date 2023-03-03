public class TuitionCentre {
    private String headmaster;
    private String address;
    private String name;
    private int numTutors;
    private int numStudents;
    protected Student[] students = new Student[2];
    protected Teacher[] tutor = new Teacher[2];
    private int currsz = 0;
    TeacherBatch teacherbatch;
    StudentBatch studentbatch;

    public TuitionCentre(String headmaster, String address, String name, int numTutors, int numStudents) {
        this.headmaster = headmaster;
        this.address = address;
        this.name = name;
        this.numTutors = numTutors;
        this.numStudents = numStudents;
    }

    @Override
    public String toString() {
        return "TuitionCenter [headmaster=" + headmaster + "address=" + address + ", name=" + name + ", numTutors=" + numTutors + ", numStudents="
                + numStudents + "]";
    }
    public void addStudent(Student s, int i) {
        students[i] = s;
    }

    public void addStudent(Student s) {
        students[currsz++] = s;
    }

    public void addTeacher(Teacher a, int i) {
        tutor[i] = a;
    }

    public void addTeacher(Teacher a) {
        tutor[currsz++] = a;
    }

    public TeacherBatch getTeacherbatch(){
        return teacherbatch;
    }

    public void setTeacherBatch(TeacherBatch teacherbatch) {
        this.teacherbatch = teacherbatch;
    }

    public StudentBatch getStudentbatch(){
        return studentbatch;
    }

    public void setStudentBatch(StudentBatch studentbatch) {
        this.studentbatch = studentbatch;
    }
}