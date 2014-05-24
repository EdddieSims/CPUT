/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SingletonDesignPattern;

/**
 *
 * @author Meena
 */
public class SingletonInstance 
{
    private static SingletonInstance instance;
    private SingletonInstance()
    {
        
    }
    public synchronized static SingletonInstance getInstance()
    {
        if(instance == null)
        {
            instance = new SingletonInstance();
        }
        return instance;
    }
    private int yearBorn;
    public void setAge(int yearBorn)
    {
       this.yearBorn = yearBorn;
    }
    public int getYear()
    {
         return 2014-yearBorn;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    
}
