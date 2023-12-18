
/**
 * Abstract class Biber - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public  class Biber
{
    // instance variables - replace the example below with your own
    private String Größe; 

    /**
     * Constructor for objects of class Teller
     */
    public Biber(String pGröße)
    {
        // initialise instance variables
        pGröße = pGröße.toLowerCase();
        if(pGröße.equals("groß")){
             Größe = pGröße;
        }else if(pGröße.equals("klein")){
            Größe = pGröße;
        }

    }

    public String getGröße(){
        return Größe;
    }
}
