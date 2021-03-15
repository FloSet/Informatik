public class If
{
    public If()
    {
            int tag = 3;

            if (tag >= 1 && tag <= 5){
                System.out.println("Wochentag");
            }
            else if(tag >= 6 && tag <= 7){
                System.out.println("Wochenende");
            }
            else{
                System.out.println("Fehler");
            }
    }
}
