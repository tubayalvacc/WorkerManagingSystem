public class Officer extends Worker{
    private String Departments;
    private String Shifts;

    public Officer(String NameSurname, String PhoneNumber, String Email, String Departments, String Shifts) {
        super(NameSurname, PhoneNumber, Email);
        this.Departments = Departments;
        this.Shifts = Shifts;
    }

    public String getDepartments() {
        return Departments;
    }
    public String getShifts() {
        return Shifts;
    }
    public void setDepartments(String Departments) {
        this.Departments = Departments;
    }
    public void setShifts(String Shifts) {
        this.Shifts = Shifts;
    }
    public void printOfficer() {
        System.out.println("NameSurname: " + getNameSurname());
        System.out.println("Departments: " + Departments);
        System.out.println("Shifts: " + Shifts);
    }
    public void Work(){
        System.out.println(getNameSurname() + " Is Working!");
    }

}
