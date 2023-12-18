
public class Sucher2
{
    private Integer[] suchArray;
    private List<Integer> suchListe;

    public Sucher2(Integer[] pArray){
        suchArray = pArray;
    }
    public Sucher2(List psuchListe){
        suchListe = psuchListe;
    }
    public boolean lineareSuche(Object suchschluessel){
        if(suchArray!= null){ // lineareSuche Array
            System.out.print("Suche in Array....");
            
            boolean gefunden = false;
            int zaehler = 0; 
            while(gefunden == false && zaehler < suchArray.length){
                if(suchArray[zaehler]== suchschluessel){
                    return true; 
                }
                else
                {
                    zaehler++;        
                }
            }
            return gefunden; 
        }
        else if (suchListe!= null){ // lineareSuche Liste
            System.out.print("Suche in Liste....");
            
            suchListe.toFirst();
            while(suchListe.hasAccess()){

                if(suchListe.getContent() == suchschluessel){
                    return true;
                }
                else
                {
                    suchListe.next(); 
                }

            }

            return false;
        }
        else{
        System.out.print("!");
        return false;
        }
    }
}
