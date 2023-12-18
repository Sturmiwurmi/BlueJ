
/**
 * Write a description of class Spiel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spiel
{
    private Wuerfel meinWuerfel;
    
    

    public Spiel(Wuerfel pWuerfel)
    {
        meinWuerfel = pWuerfel; 
                
    }

    public Wuerfel getWuerfel(){
        return meinWuerfel;
    }

    public int addiereX(int X){    
        int Ergebniss = 0;
        for(int i = X; i>0; i--){
            Ergebniss += meinWuerfel.wuerfel();
        }
        return Ergebniss;
    }

    public int addiereXrekursiv(int X){
        int Ergebniss = 0;
        if(X>0){
            Ergebniss = meinWuerfel.wuerfel();
            System.out.println(Ergebniss);
            Ergebniss += addiereXrekursiv(X-1);    
        }
        return Ergebniss;
    }

    public int maxFinden(int X){
        int Max = 0;
        int Wuerfelergebniss;
        for(int i = X; i>0; i--){
            Wuerfelergebniss = meinWuerfel.wuerfel();
            if(Wuerfelergebniss>Max){
                Max = Wuerfelergebniss;
            }
        }
        return Max; 
    }
    
    public int maxFindenrekursiv(int X, int pMax){
        /*
        int Max = pMax;
        int Wuerfelergebniss;
        if(X>0){
            Wuerfelergebniss = meinWuerfel.wuerfel();
            if(maxFindenrekursiv(X-1, Max)>Max){
                Max = Wuerfelergebniss;
            }
        }
        return Max;
       */
      return 0; // ???? 
    }

    public void gibXErgebnisse(int X) {

        for(int i = X; i>0; i--){
            System.out.print(meinWuerfel.wuerfel()); 
            
        }
        System.out.println();    
    }
    
    
    
    public void gibErgebnisserekursiv(int X){
    
        int Ergebniss = meinWuerfel.wuerfel();
        if(X>0){
        System.out.print(Ergebniss);
        gibErgebnisserekursiv(X-1);
        }
        else{
        System.out.println();
        }
        
    }

    public int multipliziereX(int X){
        int Ergebniss = 1;
        int Wuerfelergebniss;
        for(int i = X; i>0; i--){

            Ergebniss *= meinWuerfel.wuerfel();
            System.out.println(Ergebniss);
        }
        return Ergebniss; // verbuggt 
    }
    
    public int multipliziereXrekursiv(int X){
        int Ergebniss = 1;
        if(X>0){
            Ergebniss = meinWuerfel.wuerfel();
             System.out.println(Ergebniss);
            Ergebniss = Ergebniss*multipliziereXrekursiv(X-1);    
        }
        return Ergebniss;
    }
}
