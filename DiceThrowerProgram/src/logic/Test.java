/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author ThomasHedegaard
 */
public class Test implements Runnable{

        // Make a thread from this class!
    
    @Override
    public void run() {
        System.out.println("I'm from " + Test.class.getName());
    }
    
    
    
    
    

}
