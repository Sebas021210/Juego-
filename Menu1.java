import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu1 extends World
{
    Flecha flecha = new Flecha();
    private int opcion = 0;
    /**
     * Constructor for objects of class Menu1.
     * 
     */
    public Menu1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(728, 455, 1);
        showText("Bienvenidos al juego", 100, 10);
        showText("Presione las teclas de flechas para moverse y espacio para disparar", 320, 30);
        showText("Presione la tecla x para recoger el escudo", 198, 50);
        prepararMundo();
    }
    
    private void prepararMundo()
    {
        addObject(new Juego1(),570, 100);
        addObject(new Juego2(), 570, 200);
        addObject(new Juego3(), 570, 300);
        addObject(new Salir(), 570, 400);
        addObject(flecha, 400, 120);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("up") && opcion != 0) {opcion++;}
        if (Greenfoot.isKeyDown("down") && opcion != 1) {opcion--;}
        if (Greenfoot.isKeyDown("up") && opcion != 1) {opcion++;}
        if (Greenfoot.isKeyDown("down") && opcion != 2) {opcion--;}
        if (Greenfoot.isKeyDown("up") && opcion != 2) {opcion++;}
        if (Greenfoot.isKeyDown("down") && opcion != 3) {opcion--;}
        
        if (opcion >= 4) opcion = 0;
        if (opcion < 0) opcion = 1;
        
        flecha.setLocation(400, 120 + (opcion*100));
        
        if (Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("enter"))
        {
            switch(opcion)
            {
                case 0:
                    Greenfoot.setWorld(new Mundo1());
                    break;
                case 1:
                    Greenfoot.setWorld(new Mundo2());
                    break;
                case 2:
                    Greenfoot.setWorld(new Mundo4());
                    break;
                case 3:
                    Greenfoot.stop();
                    break;
            }
        }
    }
}
