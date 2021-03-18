public class Alkohol
{
    public String gibAlkohol(int cAtome, int pos){
        String praefix = "";
        switch (cAtome)
        {
            case 1:
            praefix = "Meth";
            break;
            case 2:
            praefix = "Eth";
            break;
            case 3:
            praefix = "Prop";
            break;
            case 4:
            praefix = "But";
            break;
            case 5:
            praefix = "Pent";
            break;
            case 6:
            praefix = "Hex";
            break;
            case 7:
            praefix = "Hept";
            break;
            case 8:
            praefix = "Oct";
            break;
            case 9:
            praefix = "Non";
            break;
            case 10:
            praefix = "Dec";
        }

        if(cAtome >= pos && cAtome >= 1){
            if(pos > Math.ceil((double)(cAtome/2))){
                return praefix + "an-" + ((cAtome - pos) + 1) + "-ol";
            }
            else{
                return praefix + "an-" + pos + "-ol";
            }
        }
        else{
            return "Die Daten sind fehlerhaft";
        }

    }
}
