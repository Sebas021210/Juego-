import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo1 extends World
{

    /**
     * Constructor for objects of class Mundo1.
     * 
     */
    public Mundo1()
    {    
        super(1280, 545, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Soldado_1 soldado_1 = new Soldado_1();
        addObject(soldado_1,64,399);
        Zombie_2 zombie_2 = new Zombie_2();
        addObject(zombie_2,1234,410);
        Posion1 posion1 = new Posion1();
        addObject(posion1,924,527);
        Vida1 vida1 = new Vida1();
        addObject(vida1,1087,62);

        //if (soldado_1.getX()==posion1.getX())
        //{
        //removeObject(vida1);
        //VidaEscudo1 vidaescudo1 = new VidaEscudo1();
        //addObject(vidaescudo1, 1087, 300); 
        //}

        Zombie_2 zombie_22 = new Zombie_2();
        addObject(zombie_22,1136,413);
        Zombie_2 zombie_23 = new Zombie_2();
        addObject(zombie_23,651,410);
    }
    
    
}
