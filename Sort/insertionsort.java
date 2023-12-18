
/**
 * Write a description of class insertionsort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class insertionsort
{
    List<Integer> Liste = new List<Integer>();
    public void Listeanhängen(int x){
        Liste.append(x);
    } 

    
    public List insertionsort(){
        List<Integer> sortierteListe = new List<Integer>();
        while(!Liste.isEmpty()){
            Liste.toFirst();
            int aktuelles = Liste.getContent();
            sortierteListe.toFirst();

            while(sortierteListe.hasAccess()&& sortierteListe.getContent() < aktuelles){
                sortierteListe.next();
            }
            if(sortierteListe.hasAccess()){
                sortierteListe.insert(aktuelles);
            }
            else
            {
                sortierteListe.append(aktuelles);
            }
            Liste.remove();
        }
        return sortierteListe;
    }
}
