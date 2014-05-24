/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryMethodPattern;

import FactoryMethodPattern.Impl.FactoryMethodInterfaceImplementation;
import FactoryMethodPattern.Impl.FactoryMethodInterfaceImplementationTwo;

/**
 *
 * @author Meena
 */
public class FactoryMethodClass 
{
    public static final String name1 = "Meena";
    public static final String name2 = "Muneem";
    
    public FactoryMethodInterface getNames(String names) throws Exception
    {
        if(names == null)
        {
            return null;
        }
        else if(names.equalsIgnoreCase(name1))
        {
            return new FactoryMethodInterfaceImplementation();
        }
        else if(names.equalsIgnoreCase(name2))
        {
            return new FactoryMethodInterfaceImplementationTwo();
        }
        
        throw new IllegalArgumentException();
    }
}
