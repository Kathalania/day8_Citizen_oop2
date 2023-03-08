public class ComputerScienceStudent extends Student implements Citizen{

    private String address;
    private int identityCarNumber;

    //Konstruktor
    public ComputerScienceStudent(String address, int identityCarNumber, String id, String name) {
        super(id, name);
        this.address = address;
        this.identityCarNumber = identityCarNumber;
    }
    ///Zugriff auf abstrakte Methode aus Student
    public boolean isEnrolled() {
        return true;
    }
    ///gemeinsamer public String über alle Klassen, aber mit anderen Werten///
    public String majorDegree(){
        return "Java";
    }

    /// Getter
    @Override
    public String getAddress(String address) {
        return address;
    }

    @Override
    public int getIdentityCarNumber(int identityCarNumber) {
        return identityCarNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIdentityCarNumber(int identityCarNumber) {
        this.identityCarNumber = identityCarNumber;
    }
}
