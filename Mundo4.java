import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo4 extends World
{

    /**
     * Constructor for objects of class Mundo4.
     * 
     */
    public Mundo4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Posion1 posion1 = new Posion1();
        addObject(posion1,492,507);
        Vida1 vida1 = new Vida1();
        addObject(vida1,1092,67);
        Zombie_1 zombie_1 = new Zombie_1();
        addObject(zombie_1,539,467);
        Soldado_3 soldado_3 = new Soldado_3();
        addObject(soldado_3,1060,525);
    }
}
