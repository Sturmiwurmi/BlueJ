
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
 

/**
 * Write a description of class PascalschesDreieck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PascalschesDreieck
{
    private List<Long[]> Y = new ArrayList<Long[]>();
    
    private int Schichten; 
    
    
    
    public PascalschesDreieck(int pSchichten)
    {
        
        
        
        Schichten = pSchichten;
        for(int i = 0; i<pSchichten;i++){
            Y.add(i,new Long[i+1]);
        }

        for(int i = 0; i<Y.size();i++){
            Y.get(i)[0] = new Long(1);
            Y.get(i)[Y.get(i).length-1] = new Long(1);
        }

        for(int i = 0; i<Y.size();i++){
            for(int b = 0; b<Y.get(i).length; b++){
                if(Y.get(i)[b]== null){  

                    int yminus1= i-1;

                    System.out.println("X/Y: "+ b +"/"+ i+" ist null");

                    Y.get(i)[b] = new Long(getDreieckXY(b, yminus1)+getDreieckXY(b-1, yminus1));
                } 
            }
        }
        
        Dreieckausgeben();
    }

    public Long getDreieckXY(int xx, int yy){
        return Y.get(yy)[xx];
    }

   
    
    
    
    public void Dreieckausgeben(){
        
        System.out.println("Testausgabe:");
        
        
        Long groeßteZahl = Y.get(Schichten-1)[Y.get(Schichten-1).length /2]; // die größte Zahl befidnet sich in der Mitte des Arrays in der letzten Reihe der List 
        int anzahlzeichengroeßteZahl = groeßteZahl.toString().length(); 
        System.out.println(anzahlzeichengroeßteZahl);
        
        int platzhalter = Y.size()-1;
        for(int i = 0; i<Y.size();i++){
            
             
            for(int c = 0; c<platzhalter*(anzahlzeichengroeßteZahl+1); c++){
            System.out.print(" ");            
            }
            platzhalter -= 1;
            
            for(int b = 0; b<Y.get(i).length; b++){
                int anzahlZeichenib = Y.get(i)[b].toString().length();
                int anzahlleerzeichen = anzahlzeichengroeßteZahl - anzahlZeichenib;
                
                System.out.print(" | "); 
                for(int c = 0; c<anzahlleerzeichen ; c++){
                System.out.print(" ");
                }
                System.out.print(Y.get(i)[b]+" | ");
                
                
            }
            System.out.println();
            
        }
        
       
        
    }

}
