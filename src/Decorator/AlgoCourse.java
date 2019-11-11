/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author aashgar
 */
public class AlgoCourse extends Course{

    public AlgoCourse(Program aProgram) {
        super(aProgram);
    }

    @Override
    public void view() {
        super.view(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Algorithms Design Course");
    }
    
}
