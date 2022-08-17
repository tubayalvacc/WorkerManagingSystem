public class Prelector extends Academician {
    public String DoorNumber;

    public Prelector(String NameSurname, String PhoneNumber, String Email, String Department, String Title, String DoorNumber) {
        super(NameSurname, PhoneNumber, Email, Department, Title);
        this.DoorNumber = DoorNumber;
    }

    public void GetDoorNumber(){
        System.out.println("DoorNumber: " + DoorNumber);
    }
    public void SetDoorNumber(String DoorNumber){
        this.DoorNumber = DoorNumber;
    }

    public void Meeting(){
        System.out.println(getNameSurname() + " Is Meeting!");
    }

    public void HaveExam(){
        System.out.println(getNameSurname() + " Is Having Exam!");
    }



}
