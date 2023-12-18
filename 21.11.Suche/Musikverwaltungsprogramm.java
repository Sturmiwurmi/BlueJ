
public class Musikverwaltungsprogramm
{
    private List<Musiktitel> liste = new List<Musiktitel>();
    private Sucher2 Sucher;
    public void Titelhinzufügen(Musiktitel pMusiktitel){
    liste.append(pMusiktitel);
    }
    public boolean Titelgefunden(Musiktitel pTietel){
    Sucher = new Sucher2(liste);
    return Sucher.lineareSuche(pTietel);
    }
    public boolean titelsuchen(String ptitel, String pinterpret, String pgenere){
        liste.toFirst();
        while(liste.hasAccess()){
            if(liste.getContent().gettitel() == ptitel && liste.getContent().getinterpret() == pinterpret && liste.getContent().getgenere() == pgenere){
            return true;
            }
            else
            {
            liste.next(); 
            }
        }
        return false;
    }
    public boolean titelsuchen(String ptitel, String pinterpret){
        liste.toFirst();
        while(liste.hasAccess()){
            if(liste.getContent().gettitel() == ptitel && liste.getContent().getinterpret() == pinterpret){
            return true;
            }
            else
            {
            liste.next(); 
            }
        }
        return false;
    }
    public boolean titelsuchen(String ptitel){
     liste.toFirst();
        while(liste.hasAccess()){
        
            if(liste.getContent().gettitel() == ptitel){
            return true;
            }
            else
            {
            liste.next(); 
            }
        }      
        return false;
    }
}
