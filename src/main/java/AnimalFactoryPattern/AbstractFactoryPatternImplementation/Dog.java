/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AnimalFactoryPattern.AbstractFactoryPatternImplementation;

import AnimalFactoryPattern.Animal;

/**
 *
 * @author Meena
 */
public class Dog implements Animal{

    @Override
    public String speak() 
    {
        return "Whoooof Whooaaaf"; 
    }
    
}
