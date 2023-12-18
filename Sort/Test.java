
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
   public int summeVonEinsBisNrekursiv(int n){
    int Ergebnis = n;
    
    if(n>0){
    Ergebnis += summeVonEinsBisNrekursiv(n-1);
    }
    
    return Ergebnis;
    }
    
    public void methode1(int i){
    if(i>=2){
        methode1(i/2);
    }
    System.out.print(i%2);
    }
    public void testii(){
    int i = 3;
    int b = 0;
    while(i<5){
    b++;
    System.out.println(b);
    }
    }
}
