public class OrganischeVerbindung
{

    public String gibAlkan(int cAtome, int Stoffklasse){
        String praefix = "";
        switch (cAtome)
        {
            case 1: praefix = "Meth"; break;
            case 2: praefix = "Eth"; break;
            case 3: praefix = "Prop"; break;
            case 4: praefix = "But"; break;
            case 5: praefix = "Pent"; break;
            case 6: praefix = "Hex"; break;
            case 7: praefix = "Hept"; break;
            case 8: praefix = "Oct"; break;
            case 9: praefix = "Non"; break;
            case 10: praefix = "Dec";
        }

        switch(Stoffklasse){
            case 1:
            return praefix + "an";
            case 2:
            return praefix + "en";
            case 3:
            return praefix + "in";
            case 4:
            return praefix + "anol";
            case 5:
            return praefix + "anal";
            case 6:
            return praefix + "ansäure";
            default:
            return "Fehler!";
        }
    }
}
