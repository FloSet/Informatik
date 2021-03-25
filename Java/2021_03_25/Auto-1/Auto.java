public class Auto
{
    //Attribute
    private String kennzeichen;
    private double kilometerstand;
    private double tankinhalt;
    private double tankvolumen;
    private double verbrauch;

    //Konstruktor
    public Auto(String pKennzeichen, double pKilometerstand, double pTankinhalt, double pTankvolumen, double pVerbrauch){
        updateAuto(pKennzeichen, pKilometerstand, pTankinhalt, pTankvolumen, pVerbrauch);
    }

    //Methoden
    public void updateAuto(String pKennzeichen, double pKilometerstand, double pTankinhalt, double pTankvolumen, double pVerbrauch){
        kennzeichen = pKennzeichen;
        kilometerstand = pKilometerstand;
        tankinhalt = pTankinhalt;
        tankvolumen = pTankvolumen;
        verbrauch = pVerbrauch;
    }

    public void fahren(double Strecke){
        
        if((tankinhalt / (verbrauch / 100)) >= Strecke){
            kilometerstand += Strecke;
            tankinhalt -= ((verbrauch / 100) * Strecke);
        }
        else{
            kilometerstand += tankinhalt / (verbrauch / 100);
            tankinhalt -= ((verbrauch / 100) * (tankinhalt / (verbrauch / 100)));
        }
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public double getKilometerstand() {
        return kilometerstand;
    }

    public double getTankinhalt() {
        return tankinhalt;
    }

    public double getTankvolumen() {
        return tankvolumen;
    }

    public double getVerbrauch() {
        return verbrauch;
    }

    public double tanken(double pMenge){
        tankinhalt += pMenge;
        if (tankinhalt >= tankvolumen){
            tankinhalt = tankvolumen;
        }
        return tankinhalt;
    }

}
