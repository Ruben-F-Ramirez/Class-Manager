/*
 * Ruben Ramirez
 */

package School_Manager;

/**
 *
 * @author Ruben Ramirez
 */
public class DepartmentChair extends Faculty{
    DepartmentChair(){
        super();
    }
    
    private String Department;
    
    // methods
    @Override
    public void Work(){
        System.out.printf("%s %s works for UHCL at %s.\n"
                + "They chair "
                + "the department of %s\n",getFirstName(), getLastName(), getOfficeHour(), getDepartment());
    }

    /**
     * @return the Department
     */
    public String getDepartment() {
        return Department;
    }

    /**
     * @param Department the Department to set
     */
    public void setDepartment(String Department) {
        this.Department = Department;
    }
    
    

}
