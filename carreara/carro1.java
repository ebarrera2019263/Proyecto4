import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class carro1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carro1 extends Actor
{
    /**
     * Act - do whatever the carro1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            
            move(-4);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            
            move(4);
        }

    }
}
