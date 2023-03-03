public class Teacher {
    protected Name name;
    private String ic;
    private String address;
    private int numyearexp;
    private String qualification;
    private String datejoined;
    private int numyearsincentre;
    protected Student student;

    public Teacher() {
        System.out.println("Teacher object created");
    }

    public Teacher(String ic, String address, int numyearexp, String qualification, String datejoined, int numyearsincentre) {
        this.ic = ic;
        this.address = address;
        this.numyearexp = numyearexp;
        this.qualification = qualification;
        this.datejoined = datejoined;
        this.numyearsincentre = numyearsincentre;
    }

    @Override
    public String toString() {
        return
                "IC = " + ic +
                ", Address = " + address +
                ", Years of experience = " + numyearexp +
                ", Qualification = " + qualification +
                ", Date Joined = " + datejoined +
                ", Years In Centre = " + numyearsincentre;
    }

    public void setStudent(Student s) {
        this.student = s;
    }

    public Student getStudent(){
        return student;
    }

    public Name getName(){
        return name;
    }

    public void setName(Name name){
        this.name = name;
    }




}