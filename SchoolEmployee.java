

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
public class SchoolEmployee {
    SchoolEmployee(){
        
    }
    
    private String FirstName;
    private String LastName;
    private String OfficeNumber;
    private String Organization;
    
    /****************************************
    
    *       Methods
    *****************************************/
    
    /* print message for name
    */
    
    public void Work(){
        
        System.out.printf("%s %s works for UHCL.\n",getFirstName(), getLastName());
        
    } 
    

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the OfficeNumber
     */
    public String getOfficeNumber() {
        return OfficeNumber;
    }

    /**
     * @param OfficeNumber the OfficeNumber to set
     */
    public void setOfficeNumber(String OfficeNumber) {
        this.OfficeNumber = OfficeNumber;
    }

    /**
     * @return the Organization
     */
    public String getOrganization() {
        return Organization;
    }

    /**
     * @param Organization the Organization to set
     */
    public void setOrganization(String Organization) {
        this.Organization = Organization;
    }
    
    

}
