import java.util.Arrays;

public class Student {
    protected Name name;
    private String ic;
    private String address;
    private int year;
    private String schoolname;
    private float marks[] = new float[5];


    public Student(String ic, String address, int year, String schoolname) {
        this.ic = ic;
        this.address = address;
        this.year = year;
        this.schoolname = schoolname;
    }

    @Override
    public String toString() {
        return
                "IC = " + ic +
                ", Address= " + address +
                ", Year = " + year +
                ", Schoolname = " + schoolname +
                ", Marks = " + Arrays.toString(marks);
    }

    public Student(){
        System.out.println("Student object created");
    }

    public float calcAvg() {
        float total = 0, average;
        for (int i = 0; i < marks.length; i++){
            total += marks[i];
        }
        average = total / marks.length;
        return average;
    }

    public float calcMin() {
        float smallest = 101;

        for (int i = 0; i < marks.length; i++){
            if (marks[i] < smallest){
                smallest = marks[i];
            }
        }
        return smallest;
    }

    public float calcMin(float a, float b) {
        float smallest = a;

        for (int i = 0; i < marks.length; i++){
            if (b < a){
                smallest = b;
            }
        }
        return smallest;
    }

    public float calcMax() {
        float max = -1;

        for (int i = 0; i < marks.length; i++){
            if (marks[i] > max){
                max = marks[i];
            }
        }
        return max;
    }

    public float calcMax(float a, float b) {
        float max = a;

        for (int i = 0; i < marks.length; i++){
            if (b > a){
                max = b;
            }
        }
        return max;
    }

    public void setName(Name thename) {
        name = thename;
    }

    public void setMark(float mark, int i) throws Exception {

        if (i > 4){
            throw new Exception ("Index????");
        }
        if (mark < 0 ){
            throw new Exception("Error in mark ?????");
        }
        marks[i] = mark;
    }

    public Name getName() {
        return name;
    }

    void displayMarks(){
        for (int i = 0; i < marks.length; i++){
            System.out.println("marks(" + i + "): " + marks[i]);
        }
    }

}