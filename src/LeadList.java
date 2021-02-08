
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author youso
 */
public class LeadList {
    
    ArrayList<lead> lead = new ArrayList();
    private Iterable<lead> LeadList;
    
    
    void addlead(String ClientName, int PhoneNum, int DateEntered)
    {
        lead LeadToAdd = new lead(ClientName,PhoneNum,DateEntered);
        lead.add(LeadToAdd);
    }

}

    
