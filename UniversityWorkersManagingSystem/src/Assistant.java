public class Assistant extends Academician{
    private String OfficeTimings;

    public Assistant(String NameSurname, String PhoneNumber, String Email, String Department, String Title, String OfficeTimings) {
        super(NameSurname, PhoneNumber, Email, Department, Title);
        this.OfficeTimings = OfficeTimings;
    }

    public void GetOfficeTimings(){
        System.out.println("OfficeTimings: " + OfficeTimings);
    }
    public void SetOfficeTimings(String OfficeTimings){
        this.OfficeTimings = OfficeTimings;
    }
    public void HaveQuiz(){
        System.out.println(getNameSurname() + " Is Having Quiz!");
    }
}
