public class IT_Department extends Officer{
    private String Duty;

    public IT_Department(String NameSurname, String PhoneNumber, String Email, String Departments, String Shifts, String Duty) {
        super(NameSurname, PhoneNumber, Email, Departments, Shifts);
        this.Duty = Duty;
    }

    public String getDuty() {
        return Duty;
    }
    public void setDuty(String Duty) {
        this.Duty = Duty;
    }
    public void printIT_Department() {
        System.out.println("Duty: " + Duty);
    }
    public void ConnectionSetup(){
        System.out.println(getNameSurname() + " Is Connecting Setup!");
    }


}
