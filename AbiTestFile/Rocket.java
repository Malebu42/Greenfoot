
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        CheckKeys();
    }    
    
    public void CheckKeys(){
        if(Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - 10);
        }
        
        if(Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + 10);
            
        }
        
        if(Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + 10, this.getY());
            
        }
        
        if(Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - 10, this.getY());
            
        }
        
        if(Greenfoot.isKeyDown("space")){
            Bullet myBullet;
            myBullet = new Bullet();
            
            this.getWorld().addObject(new Bullet(), this.getX() + 60, this.getY());
            
        }
    }
}
