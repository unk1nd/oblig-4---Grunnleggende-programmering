
import java.util.Calendar;
public class ID
{
	
  Calendar cal = Calendar.getInstance();
  private String Navn, Etternavn;
  private int  IDNummer, morID, farID;
  private int Fodselsar;
  int Alder;
  
  public ID (String Last, String Name, int ID, int Born, int motherID, int fatherID )
  	{                           
    
	  IDNummer = ID;
	  Navn = Name;
	  Etternavn = Last;
	  Fodselsar = Born;
      morID = motherID;
      farID = fatherID;

    }

  	public String toString()
    {
        
  		String result;
        Alder = cal.get(Calendar.YEAR) - Fodselsar;

        result = "\nNavn:    \t" + Navn + " " + Etternavn + "\n" + "ID nummer: \t" + IDNummer + "\n" + "Fødselsår: \t" + Fodselsar + "\n" + "Alder:    \t" + Alder + "\n"+ "Mor ID: \t" + morID + "\n" + "Far ID: \t" + farID;
        result += "\n---------------------------------------";
        
        return result;
    }

    public int getMor()
    {       
    	return morID;
    }

    public int getFar()
    {
    	return farID;
    }
    
    public String getName()
    {
    	String result = Navn + " " + Etternavn;
    	return result;
    }

}
