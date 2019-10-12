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
public class Singleton {
    private static Singleton aSingleton;
    private String data;

    private Singleton() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static Singleton getaSingleton() {
        if(aSingleton == null)
            aSingleton = new Singleton();
        return aSingleton;
    }
    
    
}
