import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Array here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array extends Actor
{
    int[] meinArray = new int[27];

    public void act() 
    {
        for(int i = 0; i < meinArray.length; i++){
            meinArray[i] = Greenfoot.getRandomNumber(332);
        }

        System.out.println("Das Array hat " + meinArray.length + " Elemente die höchste Zahl ist "+ highestNumber(meinArray) + " und die niedrigste " + lowestNumber(meinArray) + " damit ist der Durchschnitt " + average(meinArray) + "\n-----------------------------");

        for(int elem: meinArray){
            System.out.println(elem);
        }
    }

    public int highestNumber(int[] array){
        int highestNumber = 0;
        for(int elem: array){
            highestNumber = Math.max(highestNumber, elem);
        }
        return highestNumber;
    }

    public int lowestNumber(int[] array){
        int lowestNumber = 2147483647;
        for(int elem: array){
            lowestNumber = Math.min(lowestNumber, elem);
        }
        return lowestNumber;
    }

    public long average(int[] array){
        double total = 0;
        for(int elem: array){
            total += elem;
        }

        
        return Math.round(total/array.length);
    }
}
