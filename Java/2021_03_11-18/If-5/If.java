import java.util.Scanner;

public class If
{
    int Altersfreigabe, Alter, Reihe;
    double Preis, FertigerPreis;
    int[] Altersfreigaben = {0,6,12,16,18};
    
    public If(){
        berechnen();
    }
    
    public void berechnen(){
        boolean fertig = false;
        Scanner scan = new Scanner(System.in);
        

        while (fertig == false) {
            try {
                System.out.println("Gib die Altersfreigabe für deinen Film ein:");
                Altersfreigabe = Integer.parseInt(scan.nextLine());
                for (int i = 0; i < Altersfreigaben.length; i++){
                    if(Altersfreigabe == Altersfreigaben[i]){
                        fertig = true;
                        i = Altersfreigaben.length;
                    }
                }
                if(fertig == false){
                    System.out.println("Diese Altersfreigabe existiert nicht. Bitte versuche es erneut!");
                }
            } catch (Exception e) {
                System.out.println("Der Altersfreigabe muss eine ganze Zahl sein. Bitte versuche es erneut!");
            }
        }
        fertig = false;

        while (fertig == false) {
            try {
                System.out.println("Gib jetzt dein Alter ein:");
                Alter = Integer.parseInt(scan.nextLine());

                if(Alter < 0 || Alter > 120){
                    System.out.println("Dein Alter ist wohl nicht ganz richtig! Bitte versuche es erneut!");
                }
                else if(Alter<Altersfreigabe){
                    System.out.println("Sie sind nicht alt genug für den Film");
                    return;
                }
                else{
                    fertig = true;
                }

            } catch (Exception e) {
                System.out.println("Dein Alter muss eine ganze Zahl sein. Bitte versuche es erneut!");
            }
        }
        fertig = false;

        while (fertig == false) {
            try {
                System.out.println("Gib den Preis ein:");
                Preis = Double.parseDouble(scan.nextLine());
                if(Preis < 1 || Preis > 100){
                    System.out.println("Der Preis scheint nicht real zu sein!");
                }
                else{
                    fertig = true;
                }
            } catch (Exception e) {
                System.out.println("Der Preis darf nur aus Zahlen besetehen, gib ihn erneut ein! Falls dein Betrag eine Kommastelle hat, muss diese als Punkt (.) geschrieben werden!");
            }
        }
        fertig = false;

        while (fertig == false) {
            fertig = false;
            try {
                System.out.println("Gib jetzt die Reihe ein, in der du sitzen möchtest:");
                Reihe = Integer.parseInt(scan.nextLine());
                if(Reihe < 1 || Reihe > 12){
                    System.out.println("Die Reihe gibt es bei uns nicht!");
                }
                else{
                    fertig = true;
                }
            } catch (Exception e) {
                System.out.println("Unsere Säle haben vollwertige und durchnummerierte Reihen, deshalb dürfen keine Buchstaben und Kommazahlen enthalten sein. Bitte versuche es erneut!");
            }
        }
        
        if(Alter >= 0 && Alter <= 6){
            FertigerPreis = Preis * 0.5;
        }
        else if(Alter >= 6 && Alter <= 12){
            FertigerPreis = Preis * 0.75;
        }
        else if(Alter >= 13 && Alter <= 16){
            FertigerPreis = Preis * 0.9;
        }
        else{
            FertigerPreis = Preis;
        }

        if(Reihe >= 1 && Reihe <= 4){
            FertigerPreis = FertigerPreis * 0.7;
        }
        else if(Reihe >= 9 && Reihe <= 11){
            FertigerPreis = FertigerPreis * 1.3;
        }
        else if(Reihe == 12){
            FertigerPreis = FertigerPreis * 1.4;
        }
        
        System.out.println("______________________________________________________\n\nPreis: " + FertigerPreis + "\n\n\n\n");
    }
}
