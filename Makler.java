
public class Makler
{
    private Haus object0;
    private Haus object1;
    private Haus object2;
    
    public void hinzufügen(Haus neu)
    {
        if(object0==null)
        {
            object0=neu;
        }
        else
        {
            if(object1==null)
            {
                object1=neu;
            }
            else
            {
                if(object2==null)
                {
                    object2=neu;
                }
                else
                {
                    System.out.println("Fehler:kein freie object");
                }
            }
        }
    }
    public void printMakler()
    {
        if(object0!= null)
        {
            object0.printHaus();
        }
            if(object1 != null)
        {
            object1.printHaus();
        }
        if(object2!=null)
        {
            object2.printHaus();
        }
    }
    public Haus minPreis()
    {
        int min;
        min=999999;
        Haus haus;
        haus=null;
        if(object0!=null)
        {
            if(object0.getPreis()<min)
            {
                min=object0.getPreis();
                haus=object0;
            }
        }
        return haus;
    }
        
    // public int minPreis()
    // {
       // int min;
       // min=9999999;
      
       // if(object0 !=null)
       // {
           // if(object0.getPreis()<min)
           // {
               // min=object0.getPreis();
           // }
       // }
       // if(object1!= null)
       // {
           // if(object1.getPreis()<min)
           // {
               // min=object1.getPreis();
           // }
       // }
       // if(object2!=null)
       // {
           // if(object2.getPreis()<min)
           // {
               // min=object2.getPreis();
           // }
       // }
        // return min;
    // }
  
}