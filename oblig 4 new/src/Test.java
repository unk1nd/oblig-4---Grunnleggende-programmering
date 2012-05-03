

import java.util.Scanner;
public class Test
{
    public static void main (String []args)
    {
       Slekt slekt1 = new Slekt();
       Scanner scan = new Scanner(System.in);
        int Valg = 0;
        while (Valg != 9)
        {
            System.out.println ("Valg 1 for Ny person");
            System.out.println ("Valg 2 for Finn mor:");
            System.out.println ("Valg 3 for Finn far:");
            System.out.println ("Valg 4 for Finn barn for 2 foreldre :");
            System.out.println ("Valg 5 for Lister alle i tabellen");
            System.out.println ("Valg 9 for Exit");
            Valg = scan.nextInt();

            switch (Valg)
            {

                case 1:
                    
                    System.out.println("");
                    System.out.println("Name:");
                    String Name = scan.next();
                    String Etternavn = scan.next();
                    System.out.println("Fødselsår:");
                    int Fodselsar = scan.nextInt();
                    System.out.println("Mor id:\nMor ukjent? skriv 0");
                    int MorID = scan.nextInt();
                    System.out.println("Far id:\nFar ukjent? skriv 0");
                    int FarID = scan.nextInt();
                    slekt1.nyPerson(Etternavn, Name, Fodselsar, MorID, FarID);
                    break;

                 case 2:
                     System.out.println("Skriv in ID til Mor");
                     MorID = scan.nextInt();
                     slekt1.getMor(MorID);
                     System.out.println(slekt1.getMor(MorID));
                    break;
                case 3:
                    System.out.println("Skriv inn Far ID");
                    FarID = scan.nextInt();
                    slekt1.getFar(FarID);
                    System.out.println(slekt1.getFar(FarID));
                     break;
                case 4:
                    System.out.println ("Skriv inn ID til Mor");
                    MorID = scan.nextInt();
                    System.out.println ("Skriv inn ID til Far");
                    FarID = scan.nextInt();
                    slekt1.finnBarn(MorID, FarID);
                    break;
                case 5:
                    System.out.println(slekt1.toString());
                    break;
                case 9:
                    System.exit(0);
                    break;

            }
        }
    }
}
