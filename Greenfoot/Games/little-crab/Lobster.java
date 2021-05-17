import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends ActorFunctions
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);

        if(Greenfoot.getRandomNumber(100) < 1){
            turnSmooth(Greenfoot.getRandomNumber(180));
        }

        if(isAtEdge()){
            turnSmooth(180);
        }

        removeTouchingWithSound(Crab.class, true);
    }
}
