public class LabAssistant extends Assistant {
    private String LabTimings;

    public LabAssistant(String NameSurname, String PhoneNumber, String Email, String Department, String Title, String OfficeTimings, String LabTimings) {
        super(NameSurname, PhoneNumber, Email, Department, Title, OfficeTimings);
        this.LabTimings = LabTimings;
    }

    public void GetLabTimings(){
        System.out.println("LabTimings: " + LabTimings);
    }
    public void SetLabTimings(String LabTimings){
        this.LabTimings = LabTimings;
    }
    public void HaveLab(){
        System.out.println(getNameSurname() + " Is Having Lab!");
    }

    public void EnterLAB(){
        System.out.println(getNameSurname() + " Is Entering Lab!");
    }
    public void EnterClass(){
        System.out.println(getNameSurname() + " Is Entering Class!");
    }

}
