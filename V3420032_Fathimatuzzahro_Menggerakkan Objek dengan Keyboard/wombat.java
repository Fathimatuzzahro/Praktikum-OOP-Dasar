import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wombat here.
 * 
 * @author (fathimatuzzahro) 
 * @version (v1)
 */
public class wombat extends Actor
{
    /**
     * Act - do whatever the wombat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(1);
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+5);
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-5);
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+5,getY());
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-5,getY());
        }
        removeTouching(apel.class);
        removeTouching(apel2.class);
        removeTouching(apel3.class);
    }
    
}
