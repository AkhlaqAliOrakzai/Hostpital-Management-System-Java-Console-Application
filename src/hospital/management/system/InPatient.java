package hospital.management.system;

public class InPatient extends Patient
{
    private String OPD;
    InPatient(int patientID, String name, String address, String contactNo, int age, String date_of_Arrival,String OPD)
    {
        super(patientID,name,address,contactNo,age,date_of_Arrival);
        this.OPD = OPD;
    } 
    public String toString()
    {
        return patientID + " " + name + " " + address + " "+ contactNo +" " + " " + age + " " + date_of_Arrival + " " + this.OPD;
    }
}
