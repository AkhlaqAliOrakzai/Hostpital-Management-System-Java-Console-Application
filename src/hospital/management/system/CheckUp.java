package hospital.management.system;

class CheckUp
{
    private Patient p ;
    private Doctor d ; 
    private String date;
    private String time;
    private ClinicalTest ct;
    CheckUp(Patient p, Doctor d, String date, String time, ClinicalTest ct)
    {
        this.p = p;
        this.d = d;
        this.date = date;
        this.time = time;
        this.ct = ct;
    }
    public String getDate()
    {
        return date;
    }
    public String getTime()
    {
        return time;
    }
    public String getPatient()
    {
        return this.p.toString();
    }
    public String getDoctor()
    {
        return this.d.toString();
    }
    public String getClinicalTest()
    {
        return this.ct.toString();
    }
    
    public String toString()
    {
        return p.toString() + " "+ d.toString() + " " + date+ " " + time +" "+ ct.toString();
    }
}

