package hospital.management.system;

class Person 
{
    protected String name; 
    protected String address; 
    protected String contactNo;
    Person(String name, String address, String contactNo)
    {
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getContactNo()
    {
        return contactNo;
    }
    public String toString()
    {
        return name + " " + address + " "+ contactNo;
    }
}
