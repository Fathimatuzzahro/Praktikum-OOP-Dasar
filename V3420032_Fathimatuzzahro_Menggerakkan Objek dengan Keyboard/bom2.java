import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bom2 here.
 * 
 * @author (fathimatuzzahro) 
 * @version (v2)
 */
public class bom2 extends Actor
{
    /**
     * Act - do whatever the bom2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        turn(4);
        int x = getX();
        int y = getY();
        setLocation(x, y + 1);
       
        if (getY() ==499) //untuk bom2 dapat turun ke bawah
        {
            setLocation(getX(),0);
        }
    }
    public void turnRandom(){
        int turns = Greenfoot.getRandomNumber(4);
    }
}
