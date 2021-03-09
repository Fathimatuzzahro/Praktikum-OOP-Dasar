import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Balon adalah musuh yang harus dihindari.
 * 
 * @author (fathimatuzahro) 
 * @version (v1.1)
 */
public class balon13 extends Actor
{
    /**
     * Act - do whatever the balon13 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int i;
    public void act() 
    {
        // Add your action code here.
        turn(4);
    }
    /**
     * operasi geser kanan dan kiri
     */
    public void turnRandom(){
        int turns = Greenfoot.getRandomNumber(4);
    }
}
