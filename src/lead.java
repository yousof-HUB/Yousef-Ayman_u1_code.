/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author youso
 */
public class lead {

    static void add(lead LeadToAdd) {
    }
    private String ClientName; 
    private int PhoneNum;
    private int DateEntered; 
     
    public lead(String clientname, int phonenum, int dateentered)
    {
       this.ClientName = clientname;
       this.DateEntered = dateentered;
       this.PhoneNum = phonenum; 
    }

    /**
     * @return the ClientName
     */
    public String getClientname() {
        return ClientName;
    }

    /**
     * @param clientname the ClientName to set
     */
    public void setClientname(String clientname) {
        this.ClientName = clientname;
    }

    /**
     * @return the PhoneNum
     */
    public int getPhonenum() {
        return PhoneNum;
    }

    /**
     * @param phonenum the PhoneNum to set
     */
    public void setPhonenum(int phonenum) {
        this.PhoneNum = phonenum;
    }

    /**
     * @return the DateEntered
     */
    public int getDateentered() {
        return DateEntered;
    }

    /**
     * @param dateintered the DateEntered to set
     */
    public void setDateentered(int dateintered) {
        this.DateEntered = dateintered;
    }

    void getClientName() {
    }
}
