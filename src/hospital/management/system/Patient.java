package hospital.management.system;

class Patient extends Person
{
    protected int patientID;
    protected int age;
    protected String date_of_Arrival;
    static public int totalPatient = 0;
    Patient(int patientID, String name, String address, String contactNo, int age, String date_of_Arrival)
    {
        super(name,address,contactNo);
        this.patientID = patientID;
        this.age = age ;
        this.date_of_Arrival = date_of_Arrival;
        totalPatient++;
    }
    public String getPatientID()
    {
        return contactNo;
    }
    public String getAge()
    {
        return contactNo;
    }
    public String getDateOfBirth()
    {
        return contactNo;
    }
    public String toString()
    {
        return patientID + " " + name + " " + address + " "+ contactNo +" " + " " + age + " " + date_of_Arrival;
    }
    
}