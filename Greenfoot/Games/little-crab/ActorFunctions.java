import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ActorFunctions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ActorFunctions extends Actor
{
    public void turnSmooth(int degres){
        for(int i = 0; i < Math.ceil(degres/4); i++){
            turn(4);
            Greenfoot.delay(1);
        }
    }

    public void removeTouchingWithSound(Class<?> cls, boolean endGame){
        if(isTouching(cls)){
            removeTouching(cls);
            Greenfoot.playSound("sounds\\au.wav");
            if(cls == wo.class){
                CrabWorld.wormsEated ++;
            }
            if(endGame){
                Greenfoot.stop();
                System.out.println("Würmer gegessen:" + CrabWorld.wormsEated);
            }
        }
    }
}
