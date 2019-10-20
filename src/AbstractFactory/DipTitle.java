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
public class DipTitle implements Title{
    @Override
    public void view(String tData) {
        System.out.println("Dip course title: "+tData);
    }
}
