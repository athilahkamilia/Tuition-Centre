public class Name {
    private String fName;
    private String lName;
    private String mName;

    public Name(String fName, String mName, String lName){
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Name: " + fName + " " + lName + " " + mName;
    }
}
