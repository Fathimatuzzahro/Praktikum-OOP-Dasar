import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Balon adalah musuh yang harus ditabrak.
 * 
 * @author (fathimatuzzahro) 
 * @version (v1.2)
 */
public class balon23 extends Actor
{
    /**
     * Act - do whatever the balon23 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        turn(4);
    }
    /**
     * operasi balon berputar
     */
    public void turnRandom(){
        int turns = Greenfoot.getRandomNumber(4);
    }
}
