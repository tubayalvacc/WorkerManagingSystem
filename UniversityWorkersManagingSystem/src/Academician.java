public class Academician extends Worker {
    private String Department;
    private String Title;


    public Academician(String NameSurname, String PhoneNumber, String Email, String Department, String Title) {
        super(NameSurname, PhoneNumber, Email);
        this.Department = Department;
        this.Title = Title;
    }

        public String getDepartment() {
            return Department;
        }
        public String getTitle() {
            return Title;
        }
        public void setDepartment(String Department) {
            this.Department = Department;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public void printAcademician() {
            System.out.println("Department: " + Department);
            System.out.println("Title: " + Title);
        }
        public void EnterClass(){
            System.out.println(getNameSurname() +" "+ Department +  "Academician Has Entered!");
        }

}
