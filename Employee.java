
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    private String employeeName; 
    private String employeeLocation;
    private double salary; 
    private int age;
    private String ss; 
    
    //constructor
    public Employee (String name, String location, double salary, int age)
        {
        this.employeeName = name; 
        this.employeeLocation = location; 
        this.salary = salary; 
        this.age = age;
        
        }
        
    public double getSalary()
    {
        return this.salary;
    }
        
    public void raiseSalary()
        {
            this.salary = this.salary + (this.salary * 0.2); 
        }
   
}
