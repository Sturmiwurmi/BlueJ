import java.util.Random;
/**
 * Write a description of class Küche here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Küche
{
    private Stack<Teller> Tellerstapel = new Stack<Teller>();
    private Queue<Biber> Biberschlange = new Queue<Biber>(); 

    Random rand = new Random();

    public Küche(){
        for(int i = 0; i<2; i++){
            int n = rand.nextInt(2)+1; 

            if(n == 1){
                Tellerstapel.push(new Teller("Braun"));    
                System.out.println("Braun");
            }else if(n==2)
            {
                Tellerstapel.push(new Teller("Grün"));  
                System.out.println("Grün");
            }

        }
        System.out.println();
        for(int i = 0; i<2; i++){
            int n = rand.nextInt(2)+1; 

            if(n == 1){
                Biberschlange.enqueue(new Biber("groß")); 
                System.out.println("groß");
            }else if(n==2)
            {
                Biberschlange.enqueue(new Biber("klein")); 
                System.out.println("klein");
            }

        }
        System.out.println();  

        //System.out.println(TellerzuStapell(Tellerstapel, Biberschlange));
        //System.out.println();
    }

    public boolean TellerzuStapel(){

        while(!Tellerstapel.isEmpty()){
            if(Tellerstapel.top().getTellerfarbe().equals("braun") && Biberschlange.front().getGröße().equals("groß")){
                Tellerstapel.pop();
                Biberschlange.dequeue();
            }else if(Tellerstapel.top().getTellerfarbe().equals("grün") && Biberschlange.front().getGröße().equals("klein")){
                Tellerstapel.pop();
                Biberschlange.dequeue();
            }else{
                return false;
            }

        }

        return true; 
    }

    public boolean TellerzuStapell(Stack<Teller> pTellerstapel, Queue<Biber> pBiberschlange){

        while(!pTellerstapel.isEmpty()){
            if(pTellerstapel.top().getTellerfarbe().equals("braun") && pBiberschlange.front().getGröße().equals("groß")){
                pTellerstapel.pop();
                pBiberschlange.dequeue();
            }else if(pTellerstapel.top().getTellerfarbe().equals("grün") && pBiberschlange.front().getGröße().equals("klein")){
                pTellerstapel.pop();
                pBiberschlange.dequeue();
            }else{
                return false;
            }

        }

        return true; 
    }
}
