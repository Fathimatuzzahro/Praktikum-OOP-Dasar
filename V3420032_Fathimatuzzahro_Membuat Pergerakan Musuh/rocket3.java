import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class rocket3 sebagai peran pahlawan.
 * 
 * @author (fathimatuzzahro) 
 * @version (v1.0)
 */
public class rocket3 extends Actor
{
    /**
     * Act - do whatever the rocket3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int maju=0;
    public void act() 
    {
        // Add your action code here.
        maju(5);
        removeTouching(balon3.class);
        removeTouching(balon32.class);
        removeTouching(balon33.class);
    } 
    /**
     * operasi maju dan bergeser
     */
    public void maju(int rentangMaju){
        maju=rentangMaju;
        move(rentangMaju);
    }
    public int getMaju(){
        return maju;
    }
}
