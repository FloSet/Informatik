import java.util.Random;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends ActorFunctions
{
    public void act()
    {
        checkKeyPressed();

        

        removeTouchingWithSound(wo.class, false);
        
    }

    public void checkKeyPressed(){
        if(Greenfoot.isKeyDown("W")){
            move(4);
        }
        if(Greenfoot.isKeyDown("S")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("A")){
            turn(-10);
        }
        if(Greenfoot.isKeyDown("D")){
            turn(10);
        }
    }
}


