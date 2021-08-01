import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie2 extends Actor
{
    /**
     * Act - do whatever the Zombie2 wants to do. This method is called whenever
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
        Actor Soldado1;
        Soldado1 = getOneObjectAtOffset(0, 0, Soldado1.class);
        if (Soldado1 != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Soldado1);
            Greenfoot.playSound("AudioZombie.mp3");
        }
    }
}
