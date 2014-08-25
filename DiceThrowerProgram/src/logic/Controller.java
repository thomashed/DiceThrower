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
public class Controller {
    
    // Constructor
    public Controller(){
    
    }
    
    // Methods
    
    public static void main(String[] args) {
        
        Test t = new Test();
        
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        
        t1.start();
        t2.start();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
