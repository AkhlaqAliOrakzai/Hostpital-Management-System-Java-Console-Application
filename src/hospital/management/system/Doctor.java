package hospital.management.system;

class Doctor extends Person
{
    private int empID;
    private String date_of_Birth;
    private String date_of_Hiring;
    private String specialization;
    static public int totalDoctors = 0;
    Doctor(int empID, String name, String address , String contactNo, String date_of_Birth, String date_of_Hiring, String specialization)
    {
        super(name, address, contactNo);
        this.empID = empID;
        this.date_of_Birth = date_of_Birth;
        this.date_of_Hiring = date_of_Hiring;
        this.specialization = specialization;
        totalDoctors++;
    }
    public String getEmpID()
    {
        return contactNo;
    }
    public String getDateOfBirth()
    {
        return contactNo;
    }
    public String getDateOfHiring()
    {
        return contactNo;
    }
    public String getSpecialization()
    {
        return contactNo;
    }
    
    public String toString()
    {
        return + empID + " " + name + " " + address + " "+ contactNo +" " + date_of_Birth + " " + date_of_Hiring + " "+ specialization;
    }
    
}

