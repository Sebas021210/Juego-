import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo2 extends World
{

    /**
     * Constructor for objects of class Mundo2.
     * 
     */
    public Mundo2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 574, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Vida1 vida1 = new Vida1();
        addObject(vida1,944,64);
        Soldado_2 soldado_2 = new Soldado_2();
        addObject(soldado_2,113,452);
        Zombie_1 zombie_1 = new Zombie_1();
        addObject(zombie_1,1004,407);
        Posion1 posion1 = new Posion1();
        addObject(posion1,858,535);
        Zombie_1 zombie_12 = new Zombie_1();
        addObject(zombie_12,650,443);
    }
}
