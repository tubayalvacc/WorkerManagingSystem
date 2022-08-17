public class SecurityGuard  extends Officer{
    private String Documents;

    public SecurityGuard(String NameSurname, String PhoneNumber, String Email, String Departments, String Shifts, String Documents) {
        super(NameSurname, PhoneNumber, Email, Departments, Shifts);
        this.Documents = Documents;
    }

    public String getDocuments() {
        return Documents;
    }
    public void setDocuments(String Documents) {
        this.Documents = Documents;
    }
    public void printSecurityGuard() {
        System.out.println("Documents: " + Documents);
    }

    public void GuardDuty(){
        System.out.println(getNameSurname() + " Is Guarding Duty!");
    }

}
