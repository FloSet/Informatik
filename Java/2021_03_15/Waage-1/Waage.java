public class Waage
{
   double gewicht = 60;
   double groesse = 160;
    
   public Waage (){
            
   }
   
   public void anzeigen()
   {
      System.out.println("Sie wiegen "+ gewicht + " kg!");
      System.out.println("Sie sind "+ groesse + " cm groß!");
      System.out.println("Sie sollten ungefähr " + getIdealgewicht() + "kg wiegen");      
   }
   
   public void wiegen(double neuesGewicht)
   {
      gewicht = neuesGewicht;
   }

   public void messen(double neueGroesse){
      groesse = neueGroesse;
   }
   
   public double getIdealgewicht()
   {
      double ideal; 
   
      ideal = (groesse-100)*0.9;
      return ideal;
   }
}
