

public class Musiktitel
{
   
    private String titel;
    private String interpret;
    private String genere;
    
    public Musiktitel(String ptitel, String pinterpret, String pgenere)
    {
        titel = ptitel;
        interpret = pinterpret;
        genere = pgenere;
    }
    public Musiktitel(String ptitel, String pinterpret)
    {
        titel = ptitel;
        interpret = pinterpret;
        genere = "unbekannt";
    }
    public Musiktitel(String ptitel)
    {
        titel = ptitel;
        interpret = "unbekannt";
        genere = "unbekannt";
    }
    
    public String gettitel(){
        return titel;
    }
    
    public String getinterpret(){
        return interpret;
    }
    
    public String getgenere(){
    return genere;
    }

    
    
}
