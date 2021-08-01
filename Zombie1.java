import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie1 extends Actor
{
    /**
     * Act - do whatever the Zombie1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        walk();
        eat();
    }
    public void walk()
    {
        move (-1);
    }
    
    public void eat()
    {
        Actor Soldado2;
        Soldado2 = getOneObjectAtOffset(0, 0, Soldado2.class);
        if (Soldado2 != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Soldado2);
            Greenfoot.playSound("AudioZombie.mp3");
        }
    }
}
