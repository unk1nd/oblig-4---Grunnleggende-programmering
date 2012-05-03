

public class Slekt
{
   int count;
   ID  p;
   private ID[] IDArray = new ID[100];
   
   public Slekt()

    {
        count = 11;
        ID p0 = new ID("NULL", "NULL", 0, 0, 0, 0);
        IDArray[0] = p0;

        ID p1 = new ID("Bendiksen","Gustav", 1, 1952, 8, 7);
        IDArray[1] = p1;

        ID p2 = new ID("Bendiksen", "Jonni Elsa", 2, 1955, 9, 10);
        IDArray[2] = p2;

        ID p3 = new ID("Bendiksen", "Mikael", 3, 1987, 2, 1);
        IDArray[3] = p3;

        ID p4 = new ID("Bendiksen", "Marius", 4, 1987, 2, 1);
        IDArray[4] = p4;
        
        ID p5 = new ID("Bendiksen", "Kristin", 5, 1984, 2, 1);
        IDArray[5] = p5;
        
        ID p6 = new ID("S¿rensen","Gro Elisabeth", 6, 1981, 2, 1);
        IDArray[6] = p6;

        ID p7 = new ID("Bendiksen","Gunnar", 7, 1928, 0, 0);
        IDArray[7] = p7;

        ID p8 = new ID("Bendiksen","Bj¿rg", 8, 1930, 0, 0);
        IDArray[8] = p8;
        
        ID p9 = new ID("Johansen","Elsa", 9, 1925, 0, 0);
        IDArray[9] = p9;
        
        ID p10 = new ID("Johansen","Johan", 10, 1922, 0, 0);
        IDArray[10] = p10;

    }




    public int getMor(int userID)
    { 	
    	return IDArray[userID].getMor();
    }

    public int getFar(int userID)
    {
    	return IDArray[userID].getMor();
    }
    
   public void finnBarn(int m_id, int f_id)
   {
        System.out.println("Dette er barna til:\n" + IDArray[f_id].getName() + " og " + IDArray[m_id].getName()+ "\n");
        System.out.println("---------------------------------------");
        for(int i = 1; i < count; i++)
        {
            if(f_id == IDArray[i].getFar())
            {
                System.out.println(IDArray[i].toString());
            }
            else if(m_id == IDArray[i].getMor())
            {
                System.out.println(IDArray[i].toString());
            }
            
        }
        
   }

   public boolean nyPerson(String Last, String Name, int Born, int motherID, int fatherID)
   {
       int ID = count;
       p = new ID(Last, Name, ID, Born, motherID, fatherID);
       System.out.println(p);
       IDArray [count] = p;
       count++;
       return true;
   }

    public String toString()
    {
        String result = "Det er " + count + " stykker i tabellen\n";
        result +=("---------------------------------------\n");
            for (int i = 1; i < count; i++)
            {
                result += IDArray[i].toString();
                
            }
        
        return result;
    }
    
    

}


