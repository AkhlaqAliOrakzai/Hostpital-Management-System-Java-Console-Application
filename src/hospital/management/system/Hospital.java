package hospital.management.system;
import java.util.*;

public class Hospital 
{
    private String name;
    private String phone;
    private ArrayList <Doctor> doctors = new ArrayList<Doctor>();
    Hospital(String name, String phone)
    {
        this.name = name;
        this.phone = phone;
    }
    public String getName()
    {
        return this.name;
    }
    public String getPhone()
    {
        return this.phone;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public void addDoctor(Doctor doctor)
    {
        this.doctors.add(doctor);
    }
    public String toString()
    {
//        if(doctors.size()>0)
//        {
//            for(int i = 0 ; i<doctors.size(); i++)
//            {
//                Doctor d = (Doctor) doctors.get(i);
                return (this.name + " " + this.phone + " "+doctors.toString()+"\n");
//            }
//        }
//        else
//        {
//            return(this.name + " " + this.phone);
//        }
    }
}
