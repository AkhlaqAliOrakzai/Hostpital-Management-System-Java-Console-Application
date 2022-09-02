
package hospital.management.system;

public class Test {

    public static void main(String[] args) 
    {
//        System.out.println("1 - Add Patient \n2 - Add Doctor\n3 - Add Clinical Test \n4 - Add Hospital \n5 - Add Doctor to Hospital");
//        int option=0;
//        switch(option)
//        {
//            
//        }
        System.out.println("Patient Check Up Detail");
        Patient p = new Patient(1,"Qamar","Kohat", "0235546545555",20,"20-2-2021");
        Doctor doctor = new Doctor(111,"Mujahid", "Peshawar","0312545545556","20-02-2000","02-02-2018","FCPS");
        ClinicalTest ct = new ClinicalTest("Sugar",true);
        CheckUp cp = new CheckUp(p, doctor, "05-06-2021","18:00",ct);
        System.out.println(cp.toString());
        
        System.out.println("\nHospital Record (Doctor is inside[] separated by comma (,) )");
        Hospital h = new Hospital("Hira","051-15248763");
        Doctor d = new Doctor(1,"Sameer","Kohat","03056897452","1-1-2000","2-2-2020","MBBS");
        Doctor d1 = new Doctor(1,"Ajmal","Peshawar","03056897452","1-1-2000","2-2-2020","MBBS");
        h.addDoctor(d);
        h.addDoctor(d1);
        
        System.out.println(h.toString());
    
    }
    
}
