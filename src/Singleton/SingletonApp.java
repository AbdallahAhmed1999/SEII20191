/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author aashgar
 */
public class SingletonApp {
    public static void main(String[] args) {
        Singleton aSingleton1 = Singleton.getaSingleton();
        aSingleton1.setData("Software Engineering 2" );
        
        Singleton aSingleton2 = Singleton.getaSingleton();
        aSingleton2.setData("Singleton Design Patterns");
        
        System.out.println(aSingleton1.getData());
        System.out.println(aSingleton2.getData());
    }
}
