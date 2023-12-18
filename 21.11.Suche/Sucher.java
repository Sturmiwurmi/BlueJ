
public class Sucher
{
    private Integer[] suchArray;
    private List<Integer> suchListe;
    public Sucher(int pAnzahlWerte){

        suchArray = new Integer[pAnzahlWerte];
        suchListe = new List<Integer>();

        for(int i = 0; i<suchArray.length; i++){
            suchArray[i] = i+1; 
            suchListe.insert(i+1);
            suchListe.toLast(); 

        }
       
    }

    public boolean lineareSucheArray(int suchschluessel){
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

    public boolean binaereSucheArray(int suchschluessel){
        int links, rechts, mitte; 
        links = 0; 
        rechts = suchArray.length-1; 

        //System.out.println(rechts);
        while(links <= rechts ){
            mitte = Math.round((links+rechts)/2);  
            if(suchArray[mitte] == suchschluessel){
                return true; 
            }else if(suchArray[mitte] < suchschluessel){
                links = mitte + 1;                 
            }else if(suchArray[mitte] > suchschluessel){
                rechts = mitte - 1;                 
            }

        }
        
        return false;
    }    

    public boolean lineareSucheList(int suchschluessel){
        
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
}
