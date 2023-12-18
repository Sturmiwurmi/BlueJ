
public class BinaeresucheArray
{
    private Integer[] meinArray;
    public BinaeresucheArray(int pGroesse){
        meinArray = new Integer[pGroesse];

        for(int i = pGroesse-1; i>=0; i--){

            meinArray[i] = i;

        }
    }

    public boolean Binaeresuche(int Suchschlüssel){ // es werden keine Primzahlen erkannt
        
        int rechts, links, mitte;
        links = 0;
        rechts = meinArray.length;
        mitte =(int) ((links+rechts)/2);

        
             
        while(links<=rechts ){
            mitte =(int) ((links+rechts)/2);
            if(Suchschlüssel == meinArray[mitte]){
                
                return true;
            }  
            else if(Suchschlüssel>meinArray[mitte]){
                links = mitte+1;
            }
            else if(Suchschlüssel<meinArray[mitte]){
                rechts = mitte-1;
            }
            else{
                System.out.println("!");
                break;
            }

        }

             
        return false;
    }

    public boolean Binaeresuche2(int suchschlüssel){
        int rechts, links, mitte;
        links = 0;
        rechts = meinArray.length;
        while(links<=rechts){
            mitte =(int) ((links+rechts)/2);
            if(suchschlüssel == meinArray[mitte]){
                return true;

            }  
            else if(suchschlüssel>meinArray[mitte]){
                links = mitte+1;
            }
            else if(suchschlüssel<meinArray[mitte]){
                rechts = mitte-1;
            }
        }
        return false;
    }

    public boolean Binaeresucherekursiv(int links, int rechts,int i){

        if(links>rechts){
            return false;
        }
        int mitte = (int) ((links+rechts)/2);
        if(meinArray[mitte] == i){                
            return true;
        }
        else if(i<meinArray[mitte]){
            return Binaeresucherekursiv(links, mitte-1,i);
        }else if(i>meinArray[mitte]){
            return Binaeresucherekursiv(mitte+1, rechts,i);
        }
        else{
            return false;
        }
    }
}
