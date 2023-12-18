

public class S107Nr6
{
    public String rekStart(int x) //rekStart(6) -> "AAABBB"
    {
    return methA(x, "");
    }
    
    public String methA(int n, String s){
    if(n<=0){
    return "";
        }
        else 
        {
        return "A"+ methB(n-1, s);
        }
    }
    public String methB(int n, String s){
    if(n<=0){
    return "";
        }
        else 
        {
        return methA(n-1, s)+"B";
        }
    }
    
}
