
/**
 * Write a description of class S105Nr2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class S105Nr2
{
    public int Fakultaet(int n){
        int Ergebniss = 1;
        for(int i = n; i>0; i--){
            if(i>0){
                System.out.println(i);
                Ergebniss = Ergebniss*i;
            }
        }
        return Ergebniss;    
    }

    public int Fakultaetrekursiv(int n){
        int Ergebniss = 1;
        if(n>0){
            Ergebniss = Fakultaetrekursiv(n-1)*n;    
        }
        return Ergebniss;
    }
}
