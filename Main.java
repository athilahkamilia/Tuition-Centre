public class Main
{
    public static void main(String[] args) {

        //***STUDENT***

        Student mike = new Student("03123", "6 Jalan 7", 5,"SK Haha");
        Name name = new Name("Michael", "Mat", "James");
        mike.setName(name);

        Student adila = new Student("897867", "6, Dahlia Apartments",4, "SK Hang Tuah");
        name = new Name("Adila", "binti", "Abdul");
        adila.setName(name);

        Student imran = new Student("040821", "4, Jalan 6",3, "Lamy International School");
        name = new Name("Syed", "Imran", "Shah");
        imran.setName(name);

        Student ali = new Student("02334", "8 Jalan 7", 5,"SK Super");
        name = new Name ("haha", "ali", "bakar");
        ali.setName(name);

        //set marks for student
        try {
            mike.setMark(10, 0);
            mike.setMark(9, 1);
            mike.setMark(90, 2);
            mike.setMark(10, 3);
            mike.setMark(70, 4);
        } catch (Exception ex) {
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }

        try {
            ali.setMark(49, 0);
            ali.setMark(89, 1);
            ali.setMark(98, 2);
            ali.setMark(58, 3);
            ali.setMark(44, 4);
        } catch (Exception ex) {
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }

        try {
            adila.setMark(49, 0);
            adila.setMark(80, 1);
            adila.setMark(78, 2);
            adila.setMark(98, 3);
            adila.setMark(50, 4);
        } catch (Exception ex) {
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }

        try {
            imran.setMark(29, 0);
            imran.setMark(59, 1);
            imran.setMark(49, 2);
            imran.setMark(76, 3);
            imran.setMark(70, 4);
        } catch (Exception ex) {
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }



        // creating a batch for students
        StudentBatch abcStudent = new StudentBatch() ;
        abcStudent.add(mike);
        abcStudent.add(ali);

        StudentBatch defStudent= new StudentBatch();
        defStudent.add(imran);
        defStudent.add(adila);


        //***TEACHER***

        Teacher Aminah = new Teacher("9876", "7 Jalan 8", 7, "masters", "7 Jan 2021", 2);
        name = new Name("Siti", "Aminah", "haha");
        Aminah.setName(name);

        Teacher noni = new Teacher("89987", "Abc apartments", 6, "Degree", "6 Sept 2015", 8);
        name = new Name("Nina", "Nunu", "Nazri");
        noni.setName(name);

        Teacher abu = new Teacher("765678", "bungalow", 6, "diploma", "26 Jan 2022", 1);
        name = new Name("Abu", "Bakar", "Muhammad");
        abu.setName(name);

        Teacher lee = new Teacher ("760809", "21-09-30, Aloft Apartments", 5, "Masters", "12 Oct 2020", 3 );
        name = new Name("Lee", "Zii", "Jia");
        lee.setName(name);

        //assign batch object
        TeacherBatch abcTeacher = new TeacherBatch();
        abcTeacher.add(Aminah);
        abcTeacher.add(noni);

        TeacherBatch defTeacher = new TeacherBatch();
        defTeacher.add(abu);
        defTeacher.add(lee);

        //***TUITION CENTER***

        //ABC TUITION CENTRE
        TuitionCentre abcCentre = new TuitionCentre("Rokiah","3 Jalan 5", "abc Centre", 2,2);

        System.out.println("\n***************ABC TUITION CENTRE***************");

        abcCentre.setTeacherBatch(abcTeacher);

        System.out.println("\nLIST OF TUTORS");
        for (int i = 0; i < abcCentre.getTeacherbatch().tutor.length; i++){
            int num = i + 1;
            System.out.println("Teacher #" + num + ": ");
            System.out.println(abcCentre.getTeacherbatch().tutor[i].getName());
            System.out.println("Background: " + abcCentre.getTeacherbatch().tutor[i] + "\n");
        }

        abcCentre.setStudentBatch(abcStudent);

        System.out.println("LIST OF STUDENTS");
        for (int i = 0; i < abcCentre.getStudentbatch().students.length; i++){
            int num = i + 1;
            System.out.println("Student #" + num + ": ");
            System.out.println(abcCentre.getStudentbatch().students[i].getName());
            System.out.println("Background: " + abcCentre.getStudentbatch().students[i] + "\n");
        }

        //ASSIGN STUDENT TO TUTOR
        abcCentre.addStudent(ali);
        abcCentre.addTeacher(Aminah,0);
        Aminah.setStudent(ali);
        abcCentre.addStudent(mike);
        abcCentre.addTeacher(noni,1);
        noni.setStudent(mike);

        //PRINT OUT WHICH STUDENT IS ASSIGNED TO WHICH TUTOR
        System.out.println("Teacher Aminah's student - " + Aminah.getStudent().name);
        System.out.println("Teacher Noni's student - " + noni.getStudent().name);

        //CALC & PRINT INDIVIDUAL AVG, MIN & MAX MARKS
        //MIKE
        System.out.println("\n***INDIVIDUAL PERFORMANCE***\n\n***MIKE***");
        System.out.println("Average marks: " + mike.calcAvg());
        System.out.println("Minimum marks: " + mike.calcMin());
        System.out.println("Maximum marks: " + mike.calcMax());

        //ALI
        System.out.println("\n***ALI***");
        System.out.println("Average marks: " + ali.calcAvg());
        System.out.println("Minimum marks: " + ali.calcMin());
        System.out.println("Maximum marks: " + ali.calcMax());

        //CALC & PRINT OVERALL AVG, MIN & MAX MARKS
        System.out.println("\n***OVERALL ABC TUITION CENTRE PERFORMANCE***");
        float avg = (mike.calcAvg() + ali.calcAvg())/2;
        System.out.println("Average marks: " + avg);
        System.out.println("Minimum marks: " + mike.calcMin(ali.calcMin(), mike.calcMin()));
        System.out.println("Maximum marks: " + mike.calcMax(ali.calcMax(), mike.calcMax()));


        //DEF TUITION CENTRE
        TuitionCentre defCentre = new TuitionCentre("Salim","45 Jalan 8", "def Centre", 2,2);

        System.out.println("\n***************DEF TUITION CENTRE***************");

        defCentre.setTeacherBatch(defTeacher);

        System.out.println("\nLIST OF TUTORS");
        for (int i = 0; i < defCentre.getTeacherbatch().tutor.length; i++){
            int num = i + 1;
            System.out.println("Teacher #" + num + ": ");
            System.out.println(defCentre.getTeacherbatch().tutor[i].getName());
            System.out.println("Background: " + defCentre.getTeacherbatch().tutor[i] + "\n");
        }

        defCentre.setStudentBatch(abcStudent);

        System.out.println("\nLIST OF STUDENTS");
        for (int i = 0; i < defCentre.getStudentbatch().students.length; i++){
            int num = i + 1;
            System.out.println("Student #" + num + ": ");
            System.out.println(defCentre.getStudentbatch().students[i].getName());
            System.out.println("Background: " + defCentre.getStudentbatch().students[i] + "\n");
        }

        //ASSIGN STUDENT TO TUTOR
        defCentre.addStudent(imran);
        defCentre.addTeacher(abu,0);
        abu.setStudent(imran);
        defCentre.addStudent(adila);
        defCentre.addTeacher(lee,1);
        lee.setStudent(adila);

        System.out.println("Teacher Abu's student - " + abu.getStudent().name);
        System.out.println("Teacher Lee's student - " + noni.getStudent().name);

        //CALC & PRINT INDIVIDUAL AVG, MIN & MAX MARKS
        //IMRAN
        System.out.println("\n***INDIVIDUAL PERFORMANCE***\n\n***IMRAN***");
        System.out.println("Average marks: " + imran.calcAvg());
        System.out.println("Minimum marks: " + imran.calcMin());
        System.out.println("Maximum marks: " + imran.calcMax());

        //ADILA
        System.out.println("\n***ADILA***");
        System.out.println("Average marks: " + adila.calcAvg());
        System.out.println("Minimum marks: " + adila.calcMin());
        System.out.println("Maximum marks: " + adila.calcMax());

        //CALC & PRINT OVERALL AVG, MIN & MAX MARKS
        System.out.println("\n***OVERALL DEF TUITION CENTRE PERFORMANCE***");
        float avg2 = (adila.calcAvg() + imran.calcAvg())/2;
        System.out.println("Average marks: " + avg2);
        System.out.println("Minimum marks: " + adila.calcMin(ali.calcMin(), imran.calcMin()));
        System.out.println("Maximum marks: " + adila.calcMax(ali.calcMax(), imran.calcMax()));


    }
}
