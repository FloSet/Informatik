public class Spiel
{
    public int SteinScherePapier(String eingabe1, String eingabe2)
    {
        if(eingabe1 == "Stein" || eingabe1 == "Schere" || eingabe1 == "Papier" && eingabe2 == "Stein" || eingabe2 == "Schere" || eingabe2 == "Papier"){
            switch(eingabe1){
                case "Stein":
                    switch(eingabe2){
                        case "Stein":
                            return 3;
                        case "Papier":
                            return 2;
                        case "Schere":
                            return 1;
                        default:
                            return 0;
                    }
                case "Schere":
                    switch(eingabe2){
                        case "Stein":
                            return 2;
                        case "Papier":
                            return 1;
                        case "Schere":
                            return 3;
                        default:
                            return 0;
                    }
                case "Papier":
                switch(eingabe2){
                    case "Stein":
                        return 1;
                    case "Papier":
                        return 3;
                    case "Schere":
                        return 2;
                    default:
                        return 0;
                    }
                default:
                    return 0;
            }
        }
        else{
            return 0;
        }    
    }
}
