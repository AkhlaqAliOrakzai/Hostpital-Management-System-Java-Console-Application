package hospital.management.system;

class ClinicalTest
{
    private String name;
    private boolean isPositive = false;
    ClinicalTest(String name, boolean isPositive)
    {
        this.name = name; 
        this.isPositive = isPositive;
    }
    public String getName()
    {
        return name;
    }
    public boolean getIsPositive()
    {
        return isPositive;
    }
    public String toString()
    {
        return name +" "+ isPositive;
    }
    
}
