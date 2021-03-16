import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (fathimatuzzahro) 
 * @version (v1)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject (new wombat(), 100,300);
        if(Greenfoot.getRandomNumber(100) < 2) {//untuk apel dapat random/ acak
            addObject(new apel(), Greenfoot.getRandomNumber(700), 10);
        }
        if(Greenfoot.getRandomNumber(100) < 2) {//untuk apel dapat random/ acak
            addObject(new apel2(), Greenfoot.getRandomNumber(700), 10);
        }
        if(Greenfoot.getRandomNumber(100) < 2) {//untuk apel dapat random/ acak
            addObject(new apel3(), Greenfoot.getRandomNumber(700), 10);
        }
        if(Greenfoot.getRandomNumber(100) < 2) {//untuk bom dapat random/ acak
            addObject(new bom(), Greenfoot.getRandomNumber(700), 10);
        }
        if(Greenfoot.getRandomNumber(100) < 2) {//untuk bom dapat random/ acak
            addObject(new bom2(), Greenfoot.getRandomNumber(700), 10);
        }
        if(Greenfoot.getRandomNumber(100) < 2) {//untuk bom dapat random/ acak
            addObject(new bom3(), Greenfoot.getRandomNumber(700), 10);
        }
    }
}
