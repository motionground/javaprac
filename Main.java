
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main (String [] args)
    {
    // instance variables - replace the example below with your own
    Employee employeeOne = new Employee ("Olorunfemi", "Luton", 23024, 45);
    Employee employeeTwo = new Employee ("Adeola", "Hatfield", 23024, 23);
    employeeOne.raiseSalary();
    
    System.out.println(employeeOne.getSalary());
    System.out.println(employeeTwo.getSalary());
    
    
    }

}
