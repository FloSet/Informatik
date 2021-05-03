import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    public static int wormsEated = 0;

    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        wormsEated = 0;
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Lobster lobster = new Lobster();
        addObject(lobster,219,255);
        Crab crab = new Crab();
        addObject(crab,308,385);
        Lobster lobster2 = new Lobster();
        addObject(lobster2,487,88);
        wo wo = new wo();
        addObject(wo,3,100);
        wo wo2 = new wo();
        addObject(wo2,80,404);
        wo wo3 = new wo();
        addObject(wo3,238,78);
        wo wo4 = new wo();
        addObject(wo4,439,249);
        wo wo5 = new wo();
        addObject(wo5,439,518);
        wo wo6 = new wo();
        addObject(wo6,133,463);
        wo wo7 = new wo();
        addObject(wo7,188,315);
        wo wo8 = new wo();
        addObject(wo8,148,191);
        wo wo9 = new wo();
        addObject(wo9,185,97);
        wo wo10 = new wo();
        addObject(wo10,289,49);
        wo wo11 = new wo();
        addObject(wo11,285,153);
        wo wo12 = new wo();
        addObject(wo12,407,89);
        wo wo13 = new wo();
        addObject(wo13,88,279);
        wo wo14 = new wo();
        addObject(wo14,112,67);
        wo wo15 = new wo();
        addObject(wo15,136,539);
        wo wo16 = new wo();
        addObject(wo16,41,513);
        wo wo17 = new wo();
        addObject(wo17,76,383);
        wo wo18 = new wo();
        addObject(wo18,119,93);
        wo wo19 = new wo();
        addObject(wo19,186,149);
        wo wo20 = new wo();
        addObject(wo20,261,151);
        wo wo21 = new wo();
        addObject(wo21,351,255);
        wo wo22 = new wo();
        addObject(wo22,320,430);
        wo wo23 = new wo();
        addObject(wo23,472,67);
        wo wo24 = new wo();
        addObject(wo24,396,59);
        wo wo25 = new wo();
        addObject(wo25,182,112);
        wo wo26 = new wo();
        addObject(wo26,59,326);
        wo wo27 = new wo();
        addObject(wo27,66,321);
        wo wo28 = new wo();
        addObject(wo28,457,393);
        wo wo29 = new wo();
        addObject(wo29,410,296);
        wo wo30 = new wo();
        addObject(wo30,403,191);
        wo wo31 = new wo();
        addObject(wo31,242,349);
        wo wo32 = new wo();
        addObject(wo32,180,436);
        wo wo33 = new wo();
        addObject(wo33,225,504);
        wo wo34 = new wo();
        addObject(wo34,479,302);
        wo wo35 = new wo();
        addObject(wo35,495,190);
        wo wo36 = new wo();
        addObject(wo36,346,131);
        wo26.setLocation(76,271);
        wo27.setLocation(46,221);
        wo9.setLocation(28,33);
        wo2.setLocation(50,440);
        wo11.setLocation(296,220);
        wo18.setLocation(78,138);
    }
}