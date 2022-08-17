public class Worker {
    private String NameSurname;
    private String PhoneNumber;
    private String Email;

    public Worker(String NameSurname, String PhoneNumber, String Email) {
        this.NameSurname = NameSurname;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }
    public String getNameSurname() {
        return NameSurname;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public String getEmail() {
        return Email;
    }
    public void setNameSurname(String NameSurname) {
        this.NameSurname = NameSurname;
    }
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void printWorker() {
        System.out.println("NameSurname: " + NameSurname);
        System.out.println("PhoneNumber: " + PhoneNumber);
        System.out.println("Email: " + Email);
    }
    public void Entrance(){
        System.out.println(this.NameSurname + " Has Entered!");
    }
    public void Exit(){
        System.out.println(this.NameSurname + " Has Exited From University!");
    }
    public void DiningHall(){
        System.out.println(this.NameSurname + " Is Eating Food in DiningHall!");
    }
}
