import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class apel3 here.
 * 
 * @author (fathimatuzzahro) 
 * @version (v3)
 */
public class apel3 extends Actor
{
    /**
     * Act - do whatever the apel3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        turn(4);
        int x = getX();
        int y = getY();
        setLocation(x, y + 1);
       
        if (getY() ==499) //untuk apel3 dapat turun ke bawah
        {
            setLocation(getX(),0);
        }
    }
    public void turnRandom(){
        int turns = Greenfoot.getRandomNumber(4);
    }
}
