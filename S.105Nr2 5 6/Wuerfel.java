
import java.util.*;

public class Wuerfel
{
    private Random rand = new Random(); 

    private int Seiten;

    public Wuerfel(int pSeiten){
        Seiten = pSeiten;
    }

    public int wuerfel(){ 
        int Wuerfelergebniss = rand.nextInt(Seiten+1);

        while(Wuerfelergebniss == 0){
            Wuerfelergebniss = rand.nextInt(Seiten+1);
        }

        return Wuerfelergebniss;
    }

    public int getSeiten(){
        return Seiten;
    }
}
