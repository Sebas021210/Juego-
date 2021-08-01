import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soldado1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soldado1 extends Actor
{
    /**
     * Act - do whatever the Soldado1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        shoot();
    }
    
    public void move()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            move(5);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            move(-5);
        }
    }
    
    public void shoot()
    {
        Actor Zombie2;
        if (Greenfoot.isKeyDown("space")) 
        {
            Zombie2 = getOneIntersectingObject(Zombie2.class); 
            if (Zombie2 != null)
            {
                World world;
                world = getWorld();
                world.removeObject(Zombie2);
                Greenfoot.playSound("SonidoDisparo.mp3");
            }
        }
    }
}
