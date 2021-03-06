
/**
 * @author Florian Schmidtke
 * @version 03.03.2021/ 1.0.0

 */
public class drawer
{
    Triangle roof = new Triangle();
    Square window = new Square();
    Rectangle door = new Rectangle();
    Rectangle house = new Rectangle();
    Rectangle tree = new Rectangle();
    Circle crown = new Circle();

    public drawer()
    {
        roof.changeSize(50, 130);
        roof.moveHorizontal(30);
        roof.changeColor("red"); 

        house.changeSize(130,170);
        house.changeColor("green");
        house.moveHorizontal(-45);
        house.moveVertical(15);

        door.changeSize(30,60);
        door.changeColor("black");
        door.moveVertical(125);
        door.moveHorizontal(40);

        window.changeSize(30);
        window.changeColor("white");
        window.moveVertical(30);
        window.moveHorizontal(-30);

        tree.changeSize(35,90);
        tree.moveVertical(95);
        tree.moveHorizontal(150);
        tree.changeColor("brown");

        crown.changeSize(100);
        crown.moveHorizontal(155);
        crown.changeColor("green");

        house.makeVisible();
        window.makeVisible();
        door.makeVisible();
        roof.makeVisible();
        tree.makeVisible();
        crown.makeVisible();
    }
}
