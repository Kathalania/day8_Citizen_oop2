import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        BiologyStudent bioStu = new BiologyStudent("Berlin", 12345,"85368", "Monika");
        ComputerScienceStudent comStu = new ComputerScienceStudent("Aalen", 17495,"ksdjhfksdj", "Thomas");

        // Neuer BioStudent wird nur mit Werten aus übergeordneter Klasse zurückgegeben
        Student student = new BiologyStudent("Hamburg", 18364, "367890", "Clemens");
        System.out.println(student);

        //Student student2 = new Student("670579", "Heribert");

        List<Student> myList = new ArrayList<>();
        myList.add(student);
        myList.add(bioStu);
        myList.add(comStu);
        System.out.println(myList);

        System.out.println(student.majorDegree());
        //System.out.println(student2.majorDegree());
        System.out.println(bioStu.majorDegree());
        System.out.println(comStu.majorDegree());




    }
}
