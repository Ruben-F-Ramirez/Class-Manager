/*
 * Ruben Ramirez
 * SID: 0432694
 * Professor Kewei Sha
 */
package hw7;

/**
 *
 * @author Ruben Ramirez
 */
public class Hw7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SchoolEmployee myEmployee;
        myEmployee = new SchoolEmployee();
        
        myEmployee.setFirstName("Ruben");
        myEmployee.setLastName("Ramirez");
        myEmployee.setOfficeNumber("365");
        myEmployee.setOrganization("Math");
        myEmployee.Work();
        
        Faculty myFac;
        myFac = new Faculty();
        
        myFac.setFirstName("Ruben");
        myFac.setLastName("Ramirez");
        myFac.setOfficeNumber("365");
        myFac.setOrganization("Math");
        myFac.setOfficeHour("5 p.m. to 7 p.m.");
        myFac.Work();
        
        DepartmentChair myChair;
        myChair = new DepartmentChair();
        
        myChair.setFirstName("Ruben");
        myChair.setLastName("Ramirez");
        myChair.setOfficeNumber("365");
        myChair.setOrganization("Math");
        myChair.setOfficeHour("5 p.m. to 7 p.m.");
        myChair.setDepartment("Math");
        myChair.Work();
        
        /***********************************************
         *      problem 3
         ********************************************/
        TotalArea myTotal = new TotalArea();
        
        myTotal.calcArray();
        myTotal.display();
        
    }
    
}
