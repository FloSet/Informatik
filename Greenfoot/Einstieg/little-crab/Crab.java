import java.util.Random;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        move(5);

        if(Greenfoot.getRandomNumber(100) < 1){
            turnSmooth(Greenfoot.getRandomNumber(180));
        }

        if(isAtEdge()){
            turnSmooth(180);
        }

        removeTouchingWithSound(wo.class);
        
    }

    public void turnSmooth(int degres){
        for(int i = 0; i < Math.ceil(degres/4); i++){
            turn(4);
            Greenfoot.delay(1);
        }
    }

    public void removeTouchingWithSound(Class<?> cls){
        if(isTouching(cls)){
            removeTouching(cls);
            Greenfoot.playSound("sounds\\au.wav");
        }
    }
}


