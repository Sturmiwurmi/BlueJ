
/**
 * Write a description of class Teller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teller
{
    // instance variables - replace the example below with your own
    private String Tellerfarbe; 

    /**
     * Constructor for objects of class Teller
     */
    public Teller(String pTellerfarbe)
    {
        // initialise instance variables
        pTellerfarbe = pTellerfarbe.toLowerCase();
       
        if(pTellerfarbe.equals("braun")){
        Tellerfarbe = pTellerfarbe;
        }else if(pTellerfarbe.equals("grün")){
         Tellerfarbe = pTellerfarbe;
        }
       
    }

    public String getTellerfarbe(){
    return Tellerfarbe;
    }
}
