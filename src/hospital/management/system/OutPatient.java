package hospital.management.system;

public class OutPatient extends Patient
{
    private String room;
    private String bed;
    OutPatient(int patientID, String name, String address, String contactNo, int age, String date_of_Arrival,String room,String bed)
    {
        super(patientID,name,address,contactNo,age,date_of_Arrival);
        this.bed = bed;
        this.room = room;
    } 
    public String toString()
    {
        return patientID + " " + name + " " + address + " "+ contactNo +" " + " " + age + " " + date_of_Arrival + " " + this.room + " " + this.bed;
    }
}
