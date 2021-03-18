import java.util.Scanner;

public class If
{
    double Betrag;
    
    public If(){
        berechnen();
    }
    
    public void berechnen(){
        boolean fertig = false;
        Scanner scan = new Scanner(System.in);
        
        
        while (fertig == false) {
            try {
                System.out.println("Gib den Betrag ein:");
                Betrag = Double.parseDouble(scan.nextLine());
                fertig = true;
            } catch (Exception e) {
                System.out.println("Der Betrag darf nur aus Zahlen besetehen, gib ihn erneut ein! Falls dein Betrag eine Kommastelle hat, muss diese als Punkt (.) geschrieben werden!");
            }
        }
        
        if(Betrag < 5000){
            System.out.println("_____________________________________________\nSteuersatz: 0%\nZu zahlende Steuern: 0" + "\n_____________________________________________\n");
        } else if (Betrag >= 5000 && Betrag <= 20000){
            System.out.println("_____________________________________________\nSteuersatz: 10%\nZu zahlende Steuern: " + (Betrag * 0.1) + "\n_____________________________________________\n");
        } else if (Betrag > 20000){
            System.out.println("_____________________________________________\nSteuersatz: 15%\nZu zahlende Steuern: " + (Betrag * 0.15) + "\n_____________________________________________\n");
        }
    }
}
