/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author aashgar
 */
public class BscContent implements Content{

    @Override
    public void view(String cData) {
        System.out.println("Bsc course content: "+cData);
    }
    
}
