import java.util.Scanner;

public class orologio 
{
    public static void main(String[] args) 
    {
        int ore = 0;
        int minuti = 0;
        int secondi  = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci le ore: ");
        int orenumero = scanner.nextInt();
        if (orenumero > 24)
        {
            System.out.print("non puoi inserire più di 24 ore!!");
            System.exit(0);
        }
        System.out.println(ore + ":" + minuti + ":" + secondi);
        //System.out.println(ore); //System.out.println(":" + minuti); //System.out.println(":" + secondi);
        while (ore < orenumero)
        {
            if (ore ==24)
            {
                ore=0;
                minuti=0;
                secondi=0;
            }
            else if (minuti == 60)
            {
                ore++;
                minuti = 0;
            }
            else if (secondi == 60)
            {
                minuti++;
                secondi = 0;
            }
            else
            {
                secondi++;
            }
            if((minuti == 60) || (secondi == 60)){            
            }
            else System.out.println(ore + ":" + minuti + ":" + secondi);
        }
        System.out.println("sono passate " + ore + " ore!");
    }
}
