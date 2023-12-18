
/**
 * Write a description of class Palindrom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindrom
{
    // instance variables - replace the example below with your own
    private Stack<Character> buchstabenstapel = new Stack<Character>(); 

    /**
     * Constructor for objects of class Palindrom
     */
    public Palindrom()
    {
        // initialise instance variables

    }

    public boolean palindromPruefen(String pEingabe){
        int schleifenzähler = 0; 
        int wortlaenge = pEingabe.length();
        char[] wortfeld; 
        wortfeld = new char[wortlaenge];

        //pEingabe = pEingabe.trim(); // um Leerzeichen vor und nach dem Wort zu entfernen 
        pEingabe = pEingabe.replace(" ",""); // um Leerzeichen in einem Satz zu entfernen 

        System.out.println(pEingabe);
        wortfeld = pEingabe.toCharArray();

    
        for(int i = 0; i<wortfeld.length; i++){    
            buchstabenstapel.push(wortfeld[i]);
        }

        while(!buchstabenstapel.isEmpty()){
            if(wortfeld[schleifenzähler] == buchstabenstapel.top()){
                buchstabenstapel.pop();
            }
            else
            {
                return false;    
            }
            schleifenzähler++; 

        }
        return true; 
    }

}
