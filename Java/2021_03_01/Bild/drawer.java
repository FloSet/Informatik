
/**
 * Beschreiben Sie hier die Klasse draw.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class drawer
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    Triangle roof = new Triangle();
    Square window = new Square();
    Square door = new Square();
    Rectangle house = new Rectangle();
    Square tree = new Square();
    Circle crown = new Circle();
    
    /**
     * Konstruktor für Objekte der Klasse draw
     */
    public drawer()
    {
        roof.makeVisible();
        roof.changeSize(50, 130);
        roof.moveHorizontal(30);
        roof.changeColor("red");

        house.makeVisible();
        house.changeSize(130,250);
        house.changeColor("green");
    }
}
