import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soldado_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soldado_3 extends Actor
{
    /**
     * Act - do whatever the Soldado_3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        shoot();
        vida();
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
            move(-5);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            move(5);
        }
    }
    
    public void shoot()
    {
        Actor Zombie1;
        if (Greenfoot.isKeyDown("space")) 
        {
            Zombie1 = getOneIntersectingObject(Zombie_1.class); 
            if (Zombie1 != null)
            {
                World world;
                world = getWorld();
                world.removeObject(Zombie1);
                Greenfoot.playSound("SonidoDisparo.mp3");
            }
        }
    }
    public void vida()
    {
        Actor Posion1;
        if (Greenfoot.isKeyDown("X"))
        {
            Posion1 = getOneIntersectingObject(Posion1.class);
            if (Posion1 != null)
            {
                World world;
                world = getWorld();
                world.removeObject(Posion1);
                //VidaEscudo1 vidaescudo1 = new VidaEscudo1();
                //addObject(vidaescudo1, 1087, 300); 
                //world.addObject(VidaEscudo1);
                //setLocation(1087, 300); 
                Greenfoot.playSound("Escudo.mp3");
            }
        }
    }
}
