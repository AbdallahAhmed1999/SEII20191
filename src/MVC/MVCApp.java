/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author aashgar
 */
public class MVCApp {
    public static void main(String[] args) {
        Model aModel = new Model("Ahmad", "SE", 89.1);
        Controller aController = new Controller(aModel, new View1());        
        aController.update();
        
        aController.setaView(new View2());
        aController.update();
        
    }
}
